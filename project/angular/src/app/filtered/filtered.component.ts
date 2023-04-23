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
  checkout: boolean = false;
  constructor(private catalogo: CatalogoService, public show: ShowService) { }

  ngOnInit(): void {
    this.catalogo.getdata().subscribe(res=>{
      this.games=res;
      this.filter()
    })
  }

  filter = () => {
    if(this.show.favbool == false && this.show.cartbool == false){
      this.checkout = false;
      for(let i = 0; i < this.games.length; i++){
        if(this.games[i].genre.includes(this.show.filter) || this.games[i].title.toUpperCase().includes(this.show.filter.toUpperCase())){
          this.filtered.push(this.games[i])
          console.log(this.filtered)
        }
      }
      console.log(this.filtered)
    }else if(this.show.favbool == true){
      this.show.favbool = false;
      this.checkout = false;
      for(let x = 0; x < this.show.fav.length; x++){
        this.filtered.push(this.show.fav[x])
      }
    }else{
      this.show.cartbool = false;
      this.checkout = true;
      for(let x = 0; x < this.show.cart.length; x++){
        this.filtered.push(this.show.cart[x])
      }
    }
  }

  getGame(x: any){
    this.show.show = x.img;
    this.show.selector = true;
  }

  thanks(){
    alert("GRAZIE PER AVER L'ACQUISTO");
    this.show.cart = [];
  }
}
