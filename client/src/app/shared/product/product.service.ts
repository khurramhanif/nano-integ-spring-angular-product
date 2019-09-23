import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) {
  }

  getAllChecking(): Observable<any> {
    return this.http.get('//localhost:8080/checking-accounts');
  }

  getAllSavings(): Observable<any> {
    return this.http.get('//localhost:8080/saving-accounts');
  }

}
