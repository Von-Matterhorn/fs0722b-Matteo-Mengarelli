import { Component } from '@angular/core';
import { ApiService } from './api.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'project';
  logged: boolean = false;
  catalogo: any;
  constructor(private api:ApiService){}

  ngOnInit(){
    this.api.getData().subscribe(res=>{
      this.catalogo=res;
    })
    console.log(this.catalogo);
  }
}