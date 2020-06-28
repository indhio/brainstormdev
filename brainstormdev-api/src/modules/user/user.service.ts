import { Injectable } from '@nestjs/common';

@Injectable()
export class UserService {

  users: Array<any>;

  constructor() {
    this.users = new Array<any>();
    this.users.push({ id: '1', name: 'Renan' });
    this.users.push({ id: '2', name: 'Lais' });
    this.users.push({ id: '3', name: 'Vinicius' });
  }

  list(): Promise<any> {
    // this.users.push({id: 'dsfds'});
    return new Promise((resolve, reject) => {
      resolve(this.users);
    });
  }

  getById(id: number): Promise<any> {
    return new Promise((resolve, reject) => {
      let user = this.users.filter(user => user.id === id);
      if (user) {
        resolve(user);
      } else {
        reject(false);
      }
    });
  }

  create(user: any): Promise<void> {
    return new Promise((resolve, reject) => {
      this.users.push(user);
      resolve();
    });
  }

  update(user: any): Promise<void> {
    return new Promise((resolve, reject) => {
      this.users.forEach((element) => {
        if (element.id === user.id) {
          element.name = user.name;
        }
      });
      resolve(user);
    });
  }

  delete(id: string): Promise<void> {
    return new Promise((resolve, reject) => {
      let indexToRemove = null;
      this.users.forEach((element, index) => {
        if (element.id === id) {
          indexToRemove = index;
        }
      });
      if (indexToRemove !== null) {
        this.users.splice(indexToRemove, 1);
      }
      resolve();
    });
  }

}
