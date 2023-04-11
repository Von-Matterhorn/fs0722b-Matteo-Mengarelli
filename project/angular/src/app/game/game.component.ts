import { Component, OnInit } from '@angular/core';
import { CatalogoService } from '../catalogo.service';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.scss']
})
export class GameComponent implements OnInit {

  games: any;
  constructor(public catalogo: CatalogoService) { }

  ngOnInit(){
    this.catalogo.getdata().subscribe(res=>{
      this.games=res;
    })
  }

}
