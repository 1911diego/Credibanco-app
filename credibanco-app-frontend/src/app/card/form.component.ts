import { Component, OnInit } from '@angular/core';
import { Card } from './card';
@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  card:Card = new Card()
  constructor() { }

  ngOnInit(): void {
  }

  public create():void{
    console.log(this.card);
  }
}
