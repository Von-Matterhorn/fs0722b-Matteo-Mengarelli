import { Component, OnInit } from '@angular/core';
import { CatalogoService } from '../catalogo.service';
import { ShowService } from '../show.service';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.scss']
})
export class GameComponent implements OnInit {

  games: any = []
  bool: boolean = false;
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
  constructor(private catalogo: CatalogoService, public recive: ShowService, public user: AuthService) { }

  ngOnInit(){
    this.catalogo.getdata().subscribe(res=>{
      this.games=res;
      this.showGame();
      this.checks();
    })
  }

  showGame =  () =>{
    if(this.recive.selector == false){
      for(let i = 0; i < this.games.length; i++){
        if(this.recive.show == this.games[i].img && this.recive.selector == false){
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
        }
      }
    }
  }

  checks(){
    if(this.recive.fav.length > 0){
      for(let x = 0; x < this.recive.fav.length; x++){
        if(this.choice.title == this.recive.fav[x].title){
          this.bool = true;
        }
      }
    }else{
      this.bool = false;
    }
  }

  addFavourites(){
    this.recive.fav.push(this.choice);
    this.bool = true;
  }

  removeFavourites(){
    for(let a = 0; a < this.recive.fav.length; a++){
      if(this.recive.fav[a].title == this.choice.title){
        this.recive.fav.splice(a, 1);
        this.bool = false;
      }
    }
  }
}
