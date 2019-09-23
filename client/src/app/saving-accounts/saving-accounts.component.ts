import { Component, OnInit } from '@angular/core';
import { ProductService } from '../shared/product/product.service';

@Component({
  selector: 'app-saving-accounts',
  templateUrl: './saving-accounts.component.html',
  styleUrls: ['./saving-accounts.component.css']
})
export class SavingAccountsComponent implements OnInit {

  products: Array<any>;

  constructor(private productService: ProductService) { }

  ngOnInit() {
    this.productService.getAllSavings().subscribe(data => {
      this.products = data;
    })
  }

}
