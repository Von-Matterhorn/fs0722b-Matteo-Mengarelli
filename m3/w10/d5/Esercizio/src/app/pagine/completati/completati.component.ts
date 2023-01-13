import { Component, OnInit } from '@angular/core';
import { ToDo } from 'src/app/to-do.interface';
import { ToDoService } from 'src/app/to-do.service';

@Component({
  selector: 'app-completati',
  templateUrl: './completati.component.html',
  styleUrls: ['./completati.component.scss']
})
export class CompletatiComponent implements OnInit {
  list:ToDo[]=[];
  control:boolean=false;
  constructor(private td:ToDoService) { }

  ngOnInit(): void {
    this.prova()
  }
  async prova(){
    this.list=await this.td.getFiltered(true);
    this.control=true;
  }
  async elimina(id:number){
    const completed:ToDo={id:id,title:"done",completed:true}
    this.td.remove(completed);
    console.log(this.list);
    this.prova();
  }

}
