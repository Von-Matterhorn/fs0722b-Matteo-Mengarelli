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
  games: any;
  constructor(public catalogo: CatalogoService){}

  ngOnInit(){
    this.catalogo.getdata().subscribe(res=>{
      this.games=res;
      console.log(this.games);
    })
  }

}
