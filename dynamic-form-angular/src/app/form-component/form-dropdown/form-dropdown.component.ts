import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-form-dropdown',
  templateUrl: './form-dropdown.component.html',
  styleUrls: ['./form-dropdown.component.scss']
})
export class FormDropdownComponent implements OnInit {

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
