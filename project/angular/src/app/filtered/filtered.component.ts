import { Component, OnInit } from '@angular/core';
import { ShowService } from '../show.service';
import { CatalogoService } from '../catalogo.service';

@Component({
  selector: 'app-filtered',
  templateUrl: './filtered.component.html',
  styleUrls: ['./filtered.component.scss']
})
export class FilteredComponent implements OnInit {

  games: any;
  htmlToAdd: any;
  prova: any = [];
  img: String = ''
  lol: String = '/assets/games/ToA.webp'
  constructor(private catalogo: CatalogoService, private recive: ShowService) { }

  ngOnInit(): void {
    this.catalogo.getdata().subscribe(res=>{
      this.games=res;
      this.filter()
    })
  }

  filter = () => {
    this.htmlToAdd = document.getElementById("result");
    for(let i = 0; i < this.games.length; i++){
      if(this.games[i].genre.includes(this.recive.filter)){
        this.prova.push(this.games[i])
      }
    }
  }
}
