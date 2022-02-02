package com.credibanco.assessment.card.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assessment.card.dto.CardDto;
import com.credibanco.assessment.card.model.Card;
import com.credibanco.assessment.card.model.CardType;
import com.credibanco.assessment.card.model.Cardholder;
import com.credibanco.assessment.card.model.Status;
import com.credibanco.assessment.card.service.ICardService;
import com.credibanco.assessment.card.service.ICardTypeService;
import com.credibanco.assessment.card.service.ICardholderService;
import com.credibanco.assessment.card.service.IStatusService;

@RestController
public class CardRestController {

	@Autowired
	private ICardTypeService cardTypeService;
	@Autowired
	private IStatusService statusService;
	@Autowired
	private ICardholderService cardholderService;
	@Autowired
	private ICardService cardService;
	
	/**
	 * This method create a new card 
	 * @param cardDto, JSON
	 * @return responseEntity with status and DTO Response
	 */
	@PostMapping("/card")
	public ResponseEntity<Map<String,Object>> createCard(@RequestBody CardDto cardDto){
		Map<String,Object> response = new HashMap<String,Object>();
		System.out.println(cardDto);
		try {
			//Find card type
			CardType cardType = cardTypeService.findOneById((long) cardDto.getTypeCard());
			//Find new Status
			Status status = statusService.findOneById(1L);
			
			//Creates and persist a cardholder
			Cardholder cardholder = new Cardholder();
			cardholder.setIdCardholder(cardDto.getIdCardholder());
			cardholder.setTelephone(cardDto.getTelephone());
			cardholder.setName(cardDto.getName());
			cardholderService.create(cardholder);
			
			
			//Creates a card validation number between 1 and 100
			Random rd = new Random();
			Integer validationNumber = rd.nextInt(100)+1;
			
			//Creates a new ID using a hash of card Number
			String idCard = String.valueOf(cardDto.getPan().hashCode());
			
			
			//Creates a new card
			Card newCard = new Card();
			newCard.setCardholder(cardholder);
			newCard.setCardType(cardType);
			newCard.setIdCard(idCard);
			newCard.setPan(cardDto.getPan());
			newCard.setValidationNumber(validationNumber);
			newCard.setStatus(status);
			
			cardService.save(newCard);
			
			//Saves the response into DTO Card object
			
			String firstDigits = cardDto.getPan().substring(0,6);
			String lastDigits = cardDto.getPan().substring(cardDto.getPan().length()-4,cardDto.getPan().length());
			
			String maskedPan = firstDigits+ "****"+lastDigits;
			
			CardDto cardDtoResponse = new CardDto(idCard,maskedPan,validationNumber);

			response.put("cardDto",cardDtoResponse);
			response.put("message","Éxito");
			response.put("response_code","00");
			
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
 			
		}catch(Exception e) {
			response.put("message","Fallido");
			response.put("response_code","01");
			
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
