import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router, private auth: AuthService) { }

  ngOnInit(): void {
  }

  onSubmit(form: NgForm){
    console.log(form.value)
    this.auth.logIn(form.value).subscribe(data =>{
      this.auth.logged = true;
      this.auth.token = data.accessToken;
      console.log(this.auth.token)
      console.log(this.auth.logged)
      this.router.navigate(["/home"])
      this. auth.username = data.username;
    },error =>{
      console.log("username o password errata")
    })
  }
}
