import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  displayMessage:boolean=false;
  constructor() { }

  ngOnInit(): void {
  }

  checkInputLength(userInput:any){
        if(userInput.value.length>30){
          alert("Your name exceeds the limit 30");
        }
  }

  checkPasswordLength(userData:any){
    if(userData.value.length<8){
      this.displayMessage=true;
    }
    else{
      this.displayMessage=false;
    }
}



}
