import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CardComponent } from './card/card.component';
import { TransactionComponent } from './transaction/transaction.component';
import {CardService} from './card/card.service';
import {HttpClientModule} from '@angular/common/http';
import { FormComponent } from './card/form.component';
import { FormsModule } from '@angular/forms';
import {RouterModule,Routes} from '@angular/router';

const routes: Routes = [
  {path:'card/form',component: FormComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    TransactionComponent,
    FormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [CardService],
  bootstrap: [AppComponent]
})
export class AppModule { }
