import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ShowService {

  public show!: String;
  public filter!: String;
  
  constructor() { }
}
