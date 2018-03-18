import { Injectable } from '@angular/core';
import {Post} from './post';
import {POSTS} from './mock-post';

@Injectable()
export class BlogService {
    getPosts(): Promise<Post[]>{
        return Promise.resolve(POSTS);
    }
}