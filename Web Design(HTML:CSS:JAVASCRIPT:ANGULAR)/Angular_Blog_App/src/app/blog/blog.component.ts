import { Component, OnInit } from '@angular/core';
import{Post} from'./post'
import{POSTS} from './mock-post'
import { BlogService } from './blog.service';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css'],
  providers:[BlogService]
})
export class BlogComponent implements OnInit {
  posts: Post[];
  constructor(private postservice : BlogService) {
    
    
  }
  getPosts(): void{
    this.postservice.getPosts().then(posts => this.posts = posts);
  }
 
  save(id:string){
    if(document.getElementById(id+"token").innerHTML=="Update"){
      document.getElementById(id+"title").setAttribute("contenteditable","true");
      document.getElementById(id+"name").setAttribute("contenteditable","true");
      document.getElementById(id+"time").setAttribute("contenteditable","true");
      document.getElementById(id+"p").setAttribute("contenteditable","true");
      document.getElementById(id+"token").innerHTML="Save";
    }else{
      var now = new Date();
      var yy = now.getFullYear();
      var m = now.getMonth()+1;
      var d = now.getDay()+12;
      var h = now.getHours();
      var mm = now.getMinutes();
      var str;
      if(h>12){
        h-= 12;
        str = "PM";
      }else{
        str="AM";
      }
      if(document.getElementById(id+"title").innerHTML!=""&&document.getElementById(id+"name").innerHTML!=""&&document.getElementById(id+"p").innerHTML!=""){
        document.getElementById(id+"title").setAttribute("contenteditable","false");
        document.getElementById(id+"name").setAttribute("contenteditable","false");
        document.getElementById(id+"time").setAttribute("contenteditable","false");
        document.getElementById(id+"time").innerHTML=m+"/"+d+"/"+yy+", "+h+":"+mm+str;
        document.getElementById(id+"p").setAttribute("contenteditable","false");
        document.getElementById(id+"token").innerHTML="Update";
      }else{
        alert("Invalid Inputs");
      }
    }
  }
  create(){
    var newStickyRequest = new XMLHttpRequest();
    newStickyRequest.open('GET', './assets/newblog.html', true);
    newStickyRequest.responseType = 'text';
    newStickyRequest.onload = function (e) {
      if (newStickyRequest.status == 200) {
        var stickyArea = document.querySelector('.sticky-area');
        var div = document.createElement('div');
        div.innerHTML = newStickyRequest.responseText;
        stickyArea.appendChild(div);
      }
    };
    newStickyRequest.send();
  }


  ngOnInit() {
    this.getPosts();
   }
    
  }


