import { Component } from '@angular/core';
import { ShowService } from './show.service';
import { AuthService } from './auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'project';
  selector: String = '';
  constructor(private game: ShowService, public user: AuthService){
  }

  ngOnInit(){
  }

  getTitle(value: Event){
    this.game.filter = "";
    this.game.filter = (<HTMLInputElement>value.target).value;
  }

  getFav(){
    this.game.favbool = true;
  }

  getCart(){
    this.game.cartbool = true;
  }
}