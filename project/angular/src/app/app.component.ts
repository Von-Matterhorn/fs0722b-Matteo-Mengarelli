import { Component } from '@angular/core';
import { ShowService } from './show.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'project';
  selector: String = '';
  logged: boolean = false;
  constructor(private game: ShowService){}

  ngOnInit(){
  }

  getTitle(value: Event){
    this.game.filter = (<HTMLInputElement>value.target).value;
  }
}