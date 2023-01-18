import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms'

@Component({
  selector: 'app-tdform',
  templateUrl: './tdform.component.html',
  styleUrls: ['./tdform.component.scss']
})
export class TdformComponent implements OnInit {
  @ViewChild('form', {static: true}) form!: NgForm;

  constructor() { }

  userForm={
    userName:'',
    alterEgo:'',
    power:'',
    enemy:'',
    planet:'',
    weakness:''
  }

  Poteri=[
    {
      label:"forza",
      value:"forza"
    },
    {
      label:"velocità",
      value:"velocità"
    },
    {
      label:"fuoco",
      value:"fuoco"
    },
    {
      label:"volo",
      value:"volo"
    },
  ]
  ngOnInit(): void {
    this.form.statusChanges?.subscribe(status => { // a ogni cambiamento nel form verrà stampato in console lo stato del form (valid/invalid)
      console.log('Stato del form: ', status);
  });
  }

  submit(){
    console.log('Form inviato: ', this.form);
    this.form.reset();
  }
}
