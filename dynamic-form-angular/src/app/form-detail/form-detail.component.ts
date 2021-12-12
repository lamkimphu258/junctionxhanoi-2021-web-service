import { Component, OnInit } from '@angular/core';
import { InputComponent } from 'src/model/input-component';

@Component({
  selector: 'app-form-detail',
  templateUrl: './form-detail.component.html',
  styleUrls: ['./form-detail.component.scss']
})
export class FormDetailComponent implements OnInit {

  public inputComponents: InputComponent[] = [{
    label: "",
    type: "4",
    attribute: {},
    options: []
  }]

  constructor() { }

  ngOnInit(): void {
  }

  addComponent() {
    this.inputComponents.push({
      label: "",
      type: "4",
      attribute: {},
      options: []
    })
  }

  onChangeWidth(width: string, parent: HTMLDivElement) {
    console.log(width);
    if (width == '50%') {
      parent.className = "col-6 mb-3";
    }
    else {
      parent.className = "col-12 mb-3";
    }
  }
}
