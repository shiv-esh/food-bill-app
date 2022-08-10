import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FoodItem } from '../food-menu/food-item-model';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-bill',
  templateUrl: './bill.component.html',
  styleUrls: ['./bill.component.css']
})
export class BillComponent implements OnInit {
  
@Input() billItems:FoodItem[]=[]
@Input() total:number=0;

@Output() newTotalEvent=new EventEmitter<{newTotal:number}>();


  constructor(private http: HttpClient,private route:Router) { 
    
  }
 
  ngOnInit(): void {
   
  }

  
  onRemoveItem(item:FoodItem){
   
    this.total=this.total-item.item_cost;
    item.item_quantity-=1;
    this.newTotalEvent.emit({newTotal:this.total})
    if(item.item_quantity==0){
    var index =
      this.billItems.indexOf(item)
     
      this.billItems.splice(index, 1);
    }
      
  }


  calculateTotal(){
    this.billItems.forEach(element => {
      
      this.total=this.total+element.item_cost;
    
    });
    console.log(this.total);
  }
 
}
