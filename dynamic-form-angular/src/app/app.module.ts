import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormWrapperComponent } from './form-component/form-wrapper/form-wrapper.component';
import { FormDetailComponent } from './form-detail/form-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    FormWrapperComponent,
    FormDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
