import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, FormArray, Validators } from '@angular/forms';
@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.scss']
})
export class ReactiveFormComponent implements OnInit {

  form!:FormGroup;
  constructor(private fb:FormBuilder) { }


  ngOnInit(): void {
    this.form=this.fb.group({

    })
  }

}
