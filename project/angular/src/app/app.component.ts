import { Component,Input, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'project';
  logged: boolean = false;
  catalogo: any;
  constructor(private http: HttpClient){}

  ngOnInit(){
    let headers = new HttpHeaders({});
    this.http.get<any>('http://localhost:3000/', {
      headers: headers
    }).subscribe(data => {
      this.catalogo = data;
      console.log(this.catalogo)
    })
  }
}