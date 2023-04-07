import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  @Input() data: any;
  random!: number;
  constructor() { }

  ngOnInit(){
    for(let i = 0; i < 5; i++){
      this.random = Math.floor(Math.random()* (24-1) + 1);
      for(let x = 0; x < 25; x++){
        if(this.data[x].id == this.random){
          
        }
      }
    }
  }

}
