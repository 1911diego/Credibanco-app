import { Injectable } from '@angular/core';
import {Card} from './card';
import {Observable} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class CardService {
  private url: string = 'http://localhost:8080/card';

  private httpHeaders = new HttpHeaders({'Content-Type':'application/json'})
  constructor(private http: HttpClient) { }


  create(card:Card):Observable<Card>{
    return this.http.post<Card>(this.url,card,{headers: this.httpHeaders})
  }
  
}
