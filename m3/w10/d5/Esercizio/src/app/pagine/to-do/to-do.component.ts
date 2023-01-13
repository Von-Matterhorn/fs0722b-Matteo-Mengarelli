import { Component, OnInit } from '@angular/core';
import { ToDoService } from 'src/app/to-do.service';
import { ToDo } from 'src/app/to-do.interface';

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.scss']
})
export class ToDoComponent implements OnInit {
  list!:ToDo[];
  newTask!:string;
  control:boolean=false;
  constructor(private td:ToDoService) { }
  ngOnInit(): void {
    this.prova();
  }
  ngOnChange():void{

  }
  async prova(){
    this.list=await this.td.getFiltered(false);
    this.control=true;
  }
  async aggiungi(){
    const pending:ToDo={id:1,title:this.newTask,completed:false}
    this.control=false;
    this.td.add(pending);
    this.prova();
    this.newTask='';
  }
  async aggiorna(id:number){
    this.td.update(id);
    this.prova();
  }
  async elimina(id:number){
    const completed:ToDo={id:id,title:"done",completed:true}
    this.td.remove(completed);
    this.prova()
    console.log(this.list)

  }

}
