import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ShowService {

  public selected!: String;
  
  constructor() { }
}
