import { EventEmitter, Component, OnInit, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { subscribeOn } from 'rxjs';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  @Output() newItemEvent = new EventEmitter();
  public k=false
  public name:any
  
  constructor() { }

  ngOnInit(): void {
    
  }

  onclickjasw(data:any)
{
    if(data.name=="jaswanth" && data.password=="jaswanth")
    {
      this.k=true;
      this.name=data.name
      alert("welcome "+data.name) 
    }
    else if(data.name=="harshada" && data.password=="harshada"){
      this.k=true;
      this.name=data.name
      alert("welcome "+data.name) 
      
    }
    else{
      alert("Not good try again")
    }
}

}
