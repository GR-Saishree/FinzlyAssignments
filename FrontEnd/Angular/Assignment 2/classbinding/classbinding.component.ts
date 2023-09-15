import { style } from '@angular/animations';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-classbinding',
  templateUrl: './classbinding.component.html',
  styleUrls: ['./classbinding.component.css']
})
export class ClassbindingComponent implements OnInit {

  colorChange:boolean=false;

  constructor() { }

  ngOnInit(): void {
  }

  onClick(username:any){
     this.colorChange = !this.colorChange;
    
  }

  sendData(userInput:any){
    console.log(`
    Username : ${userInput}
    `);
    
  }

}
