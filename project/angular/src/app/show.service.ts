import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ShowService {

  public show!: String;
  public filter: any = [];
  public selector: boolean = false;
  public fav: any = [];
  public cart: any = [];
  
  constructor() { }
}