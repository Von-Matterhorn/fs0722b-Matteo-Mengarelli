import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { GameComponent } from './game/game.component';
import { ProfileComponent } from './profile/profile.component';
import { FilteredComponent } from './filtered/filtered.component';
import { SlickCarouselModule } from 'ngx-slick-carousel';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { LoginComponent } from './profile/login/login.component';
import { SignupComponent } from './profile/signup/signup.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    GameComponent,
    ProfileComponent,
    FilteredComponent,
    LoginComponent,
    SignupComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    SlickCarouselModule,
    MatSelectModule,
    NgbModule,
    MatInputModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
