import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormWrapperComponent } from './form-component/form-wrapper/form-wrapper.component';
import { FormDetailComponent } from './form-detail/form-detail.component';
import { FormCheckboxComponent } from './form-component/form-checkbox/form-checkbox.component';
import { FormDropdownComponent } from './form-component/form-dropdown/form-dropdown.component';
import { FormNumberComponent } from './form-component/form-number/form-number.component';
import { FormRadioComponent } from './form-component/form-radio/form-radio.component';
import { FormDateComponent } from './form-component/form-date/form-date.component';
import { FormTextFieldComponent } from './form-component/form-text-field/form-text-field.component';
import { FormPhoneComponent } from './form-component/form-phone/form-phone.component';

@NgModule({
  declarations: [
    AppComponent,
    FormWrapperComponent,
    FormDetailComponent,
    FormCheckboxComponent,
    FormDropdownComponent,
    FormNumberComponent,
    FormRadioComponent,
    FormDateComponent,
    FormTextFieldComponent,
    FormPhoneComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
