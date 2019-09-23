import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { CheckingAccountsComponent } from './checking-accounts/checking-accounts.component';
import { SavingAccountsComponent } from './saving-accounts/saving-accounts.component';

const routes: Routes = [
  { path: 'checking', component: CheckingAccountsComponent },
  { path: 'saving', component: SavingAccountsComponent }
];




@NgModule({
  declarations: [
    AppComponent,
    CheckingAccountsComponent,
    SavingAccountsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
