import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-form-radio',
  templateUrl: './form-radio.component.html',
  styleUrls: ['./form-radio.component.scss']
})
export class FormRadioComponent implements OnInit {

  public isAdded = false;

  @Output() onAdd: EventEmitter<void> = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  emitAdd() {
    if (!this.isAdded) {
      this.isAdded = true;
      this.onAdd.emit();
    }
  }
}
