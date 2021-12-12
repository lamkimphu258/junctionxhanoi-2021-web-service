import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-form-wrapper',
  templateUrl: './form-wrapper.component.html',
  styleUrls: ['./form-wrapper.component.scss']
})
export class FormWrapperComponent implements OnInit {
  
  @Input() index: number = 0;
  @Output() onChangeWidth : EventEmitter<string> = new EventEmitter();
  public type: string = "5";
  public options: string[] = [""];

  constructor() { }

  ngOnInit(): void {
  }

  addOption() {
    this.options.push("");
  }

  changeWidth(input: HTMLInputElement) {
    this.onChangeWidth.emit(input.value);
  }
}
