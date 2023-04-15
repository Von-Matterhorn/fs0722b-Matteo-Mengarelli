import { Component, OnInit } from '@angular/core';
import { CatalogoService } from '../catalogo.service';
import { ShowService } from '../show.service';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.scss']
})
export class GameComponent implements OnInit {

  games: any;
  choice: any = {
    title: '',
    img: '',
    players: '',
    genre: '',
    price: '',
    platform: '',
    release: '',
    editor: '',
    voices: '',
    languages: '',
    info: '',
  }
  constructor(private catalogo: CatalogoService, private recive: ShowService, private control: ShowService) { }

  ngOnInit(){
    this.catalogo.getdata().subscribe(res=>{
      this.games=res;
      this.showGame();
    })
  }

  showGame =  () =>{
    if(this.control.selector == false){
      for(let i = 0; i < 24; i++){
        if(this.recive.show == this.games[i].img && this.control.selector == false){
          this.choice.title = this.games[i].title;
          this.choice.img = this.games[i].img;
          this.choice.players = this.games[i].players;
          this.choice.genre = this.games[i].genre;
          this.choice.price = this.games[i].price;
          this.choice.platform = this.games[i].platform;
          this.choice.release = this.games[i].release;
          this.choice.editor = this.games[i].editor;
          this.choice.voices = this.games[i].voices;
          this.choice.languages = this.games[i].languages;
          this.choice.info = this.games[i].info;
          console.log(this.choice)
        }
      }
    }else{
      this.choice = this.recive.show
      console.log(this.recive.show)
    }
  }
}
