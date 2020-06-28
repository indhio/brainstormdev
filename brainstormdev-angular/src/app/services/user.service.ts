import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {

  }

  list(): Observable<any> {
    return this.http.get(environment.apiUrl + '/user/list');
  }

  getById(id: string) {
    this.http.get(environment.apiUrl + '/user/' + id);
  }

  create(user: any) {
    this.http.post(environment.apiUrl + '/user/create', user);
  }

  update(user: any) {
    this.http.put(environment.apiUrl + '/user/create', user);
  }

  delete(id: string) {
    this.http.delete(environment.apiUrl + '/user/delete/' + id);
  }

}
