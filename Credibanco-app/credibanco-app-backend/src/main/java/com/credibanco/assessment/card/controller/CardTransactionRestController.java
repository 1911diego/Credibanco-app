package com.credibanco.assessment.card.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assessment.card.dto.CardTransactionDto;
import com.credibanco.assessment.card.model.Card;
import com.credibanco.assessment.card.model.CardTransaction;
import com.credibanco.assessment.card.model.Purchase;
import com.credibanco.assessment.card.model.Status;
import com.credibanco.assessment.card.service.ICardService;
import com.credibanco.assessment.card.service.ICardTransactionService;
import com.credibanco.assessment.card.service.IPurchaseService;
import com.credibanco.assessment.card.service.IStatusService;

@RestController
public class CardTransactionRestController {

	@Autowired
	private ICardService cardService;
	@Autowired
	private IStatusService statusService;
	@Autowired
	private IPurchaseService purchaseService;
	@Autowired
	private ICardTransactionService transactionService;

	/**
	 * Rest method that creates a Card Transaction
	 * @param cardTransactionDto, Dto consumed from Front
	 * @return response Entity
	 */
	@PostMapping("/transaction")
	public ResponseEntity<Map<String, Object>> createCardTransaction(
			@RequestBody CardTransactionDto cardTransactionDto) {
		Map<String, Object> response = new HashMap<String, Object>();
		HttpStatus httpStatus = null;
		try {
			CardTransaction newTransaction = new CardTransaction();
			newTransaction.setIdCardTransaction(cardTransactionDto.getIdTransaction());
			Card card = cardService.findOneById(cardTransactionDto.getIdCard());
			Status approvedTransaction = statusService.findOneById(3L);
			Status declinedTransaction = statusService.findOneById(4L);
			if (card == null) {
				response.put("message", "Tarjeta no existe");
				response.put("responseCode", "01");
				newTransaction.setStatus(declinedTransaction);
				httpStatus = HttpStatus.NOT_FOUND;
			} else if (card.getStatus().getIdStatus() != 2) {
				response.put("message", "Tarjeta no enrolada");
				response.put("responseCode", "02");
				newTransaction.setStatus(declinedTransaction);
				httpStatus = HttpStatus.BAD_REQUEST;
			} else {
				Purchase purchase = new Purchase();
				purchase.setAddress(cardTransactionDto.getAddress());
				purchase.setTotal(cardTransactionDto.getTotal());
				purchaseService.save(purchase);

				newTransaction.setPurchase(purchase);
				newTransaction.setCard(card);
				newTransaction.setCreationDate(new Date());
				newTransaction.setStatus(approvedTransaction);

				response.put("message", "Compra Exitosa");
				response.put("responseCode", "00");
				response.put("transactionStatus", approvedTransaction.getDescription());
				httpStatus = HttpStatus.CREATED;
			}

			transactionService.save(newTransaction);

		} catch (Exception e) {
			e.printStackTrace();
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(response, httpStatus);
	}

	/**
	 * Rest method that cancels a card transaction
	 * @param cardTransactionDto. dto consumed from Front .
	 * @return Response Entity.
	 */
	@PutMapping("/transaction")
	public ResponseEntity<Map<String, Object>> cancelTransaction(@RequestBody CardTransactionDto cardTransactionDto) {
		Map<String, Object> response = new HashMap<String, Object>();
		HttpStatus httpStatus = null;
		try {

			CardTransaction cardTransaction = transactionService.findOneById(cardTransactionDto.getIdTransaction());
			if (cardTransaction == null) {
				response.put("responseCode", "01");
				response.put("message", "Número de referencia inválido");
				response.put("referenceNumber", cardTransactionDto.getIdTransaction());
				httpStatus = HttpStatus.NOT_FOUND;
			} else if (!cardTransaction.getCard().getIdCard().equalsIgnoreCase(cardTransactionDto.getIdCard())) {
				response.put("responseCode", "01");
				response.put("message", "Número de identificación de tarjeta inválido");
				response.put("referenceNumber", cardTransactionDto.getIdTransaction());
				httpStatus = HttpStatus.NOT_FOUND;
			} else if ((cardTransaction.getPurchase().getTotal() - cardTransactionDto.getTotal()) != 0) {
				response.put("responseCode", "01");
				response.put("message", "El valor total ingresado no coincide con el de la transacción");
				response.put("referenceNumber", cardTransactionDto.getIdTransaction());
				httpStatus = HttpStatus.NOT_FOUND;
			} else {
				Date currentDate = new Date();
				Date transactionDate = cardTransaction.getCreationDate();
				// Calculates if time between transactionDate and currentDate is greater than 5
				// hours
				if ((currentDate.getTime() - transactionDate.getTime()) > 18000000) {
					response.put("responseCode", "02");
					response.put("message", "No se puede anular la transacción");
					response.put("referenceNumber", cardTransactionDto.getIdTransaction());
					httpStatus = HttpStatus.BAD_REQUEST;
				} else {
					// Update the transaction status to Cancelled status
					Status cancelStatus = statusService.findOneById(5L);
					cardTransaction.setStatus(cancelStatus);
					transactionService.save(cardTransaction);
					response.put("responseCode", "00");
					response.put("message", "Compra anulada");
					response.put("referenceNumber", cardTransactionDto.getIdTransaction());
					httpStatus = HttpStatus.OK;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(response, httpStatus);
	}
}
