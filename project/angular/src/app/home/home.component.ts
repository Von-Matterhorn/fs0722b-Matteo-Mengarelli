import { Component, Input, OnInit } from '@angular/core';
import { CatalogoService } from '../catalogo.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  @Input() data: any;
  random!: number;
  selected!: string;
  games: any;
  constructor(public catalogo: CatalogoService){}

  ngOnInit(){
    this.catalogo.getdata().subscribe(res=>{
    this.games=res;
    console.log(this.games);
      for (let index = 0; index < 5; index++) {
        this.images()
        this.random = Math.floor(Math.random() * (24 - 1 + 1) + 1);
        for(let x = 0; x < 25; x++){
          if(this.random == this.games[x].id){
            console.log(this.games[x])
          }
        }
      }
    })
  }

  images = function(){
    let random = Math.floor(Math.random() * (24 - 1 + 1) + 1);
    console.log(random);
  }
}