import { Injectable } from '@angular/core';
import { Post } from '../interface/post.interface';

@Injectable({
  providedIn: 'root'
})
export class PostService {
  posts: Post[] = [];
  constructor() { }
}
