import { Component, Input, OnInit } from '@angular/core';
import { CatalogoService } from '../catalogo.service';
import { ShowService } from '../show.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  @Input()
  image:any = [];
  random: any = [];
  x!: number;
  selected!: string;
  games: any;
  constructor(private catalogo: CatalogoService, private send: ShowService, private genre: ShowService, private control: ShowService){}

  ngOnInit(){
    this.catalogo.getdata().subscribe(res=>{
      this.games=res;
      console.log(this.games)
      this.buildCarousel()
    })
  }

  buildCarousel =  () =>{
    for (let i = 0; i < 5; i++) {
      this.x = Math.floor(Math.random() * (24 - 1 + 1) + 1);
      for(let a = 0; a < this.random.length; a++){
        while(this.x == this.random[a]){
          this.x = Math.floor(Math.random() * (24 - 1 + 1) + 1);
        }
      }
      this.random[i] = this.x;
    }
    for(let x = 0; x < this.random.length; x++){
      for(let y = 0; y < 24; y++){
        if(this.random[x] == this.games[y].id){
          this.image[x] = this.games[y].img;
        }
      }
    }
  }

  getGame1 = () =>{
    this.selected = this.image[0];
    this.send.show = this.selected;
    this.control.selector = false;
  }

  getGame2 = () =>{
    this.selected = this.image[1];
    this.send.show = this.selected;
    this.control.selector = false;
  }

  getGame3 = () =>{
    this.selected = this.image[2];
    this.send.show = this.selected;
    this.control.selector = false;
  }

  getGame4 = () =>{
    this.selected = this.image[3];
    this.send.show = this.selected;
    this.control.selector = false;
  }

  getGame5 = () =>{
    this.selected = this.image[4];
    this.send.show = this.selected;
    this.control.selector = false;
  }

  getGenre1(){
    this.selected = 'Gioco di ruolo';
    this.genre.filter = this.selected;
  }
  getGenre2(){
    this.selected = 'Azione';
    this.genre.filter = this.selected;
  }
  getGenre3(){
    this.selected = 'Avventura';
    this.genre.filter = this.selected;
  }
  getGenre4(){
    this.selected = 'Sport';
    this.genre.filter = this.selected;
  }
}