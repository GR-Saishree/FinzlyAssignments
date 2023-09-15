import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primechecker',
  templateUrl: './primechecker.component.html',
  styleUrls: ['./primechecker.component.css']
})
export class PrimecheckerComponent implements OnInit {

  result:string="Your Result will be displayed once you click the button";
  constructor() { }

  ngOnInit(): void {
  }

  checkPrime(userData:any){
    let number =+userData, countNotPrime=0;
    for(let i=2;i<number;i++){
      if(number%i==0){
          countNotPrime++;
      }
    }
    if(countNotPrime!=0){
      console.log("The number is not prime");
      this.result="The number is not prime";
      
    }
    else{
      console.log("The number is prime");
      this.result="The number is prime";
      
    }
  }

}
