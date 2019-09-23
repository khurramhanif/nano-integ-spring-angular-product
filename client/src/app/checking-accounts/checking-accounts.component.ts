import { Component, OnInit } from '@angular/core';
import { ProductService } from '../shared/product/product.service';

@Component({
  selector: 'app-checking-accounts',
  templateUrl: './checking-accounts.component.html',
  styleUrls: ['./checking-accounts.component.css']
})
export class CheckingAccountsComponent implements OnInit {

  products: Array<any>;

  constructor(private productService: ProductService) { }

  ngOnInit() {
    this.productService.getAllChecking().subscribe(data => {
      this.products = data;
    })
  }

}
