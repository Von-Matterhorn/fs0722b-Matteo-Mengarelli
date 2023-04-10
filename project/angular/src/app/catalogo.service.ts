import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CatalogoService {

  constructor(private api:HttpClient) { }

  getdata(){
    return this.api.get('http://localhost:3000/');
  }
}
