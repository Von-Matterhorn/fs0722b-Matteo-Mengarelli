import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  logged: boolean = false;
  token: String = "";
  username: String = "";
  url: String = "http://localhost:8080/api/auth/"

  constructor(private http: HttpClient) { }

  signUp(data:{}): Observable<any>{
    return this.http.post<any>(this.url + "signup", data)
  }

  logIn(data:{}): Observable<any>{
    return this.http.post<any>(this.url + "signin", data)
  }
}
