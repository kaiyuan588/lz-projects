import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { App1Component } from './app-1/app-1.component';
import { AppCardComponent } from './app-card/app-card.component';

@NgModule({
  declarations: [
    AppComponent,
    App1Component,
    AppCardComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
