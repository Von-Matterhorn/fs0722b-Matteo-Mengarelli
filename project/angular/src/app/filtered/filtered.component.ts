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
  filtered: any = [];
  selected: any;
  result: any;
  constructor(private catalogo: CatalogoService, private recive: ShowService, private send: ShowService, private control: ShowService) { }

  ngOnInit(): void {
    this.catalogo.getdata().subscribe(res=>{
      this.games=res;
      this.filter()
    })
  }

  filter = () => {
    this.result = this.recive.filter
    for(let i = 0; i < this.games.length; i++){
      if(this.games[i].genre.includes(this.result) || this.games[i].title.toUpperCase().includes(this.result.toUpperCase())){
        this.filtered.push(this.games[i])
      }
    }
  }

  getGame = (x: any) => {
    console.log(x)
    this.selected = x;
    this.send.show = this.selected
    this.control.selector = true;
  }
}
