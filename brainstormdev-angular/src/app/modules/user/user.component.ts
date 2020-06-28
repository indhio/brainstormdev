import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html'
})
export class UserComponent implements OnInit {

  list: any[];

  constructor(
    private userService: UserService,
  ) { }

  ngOnInit(): void {
    this.getList();
  }

  getList() {
    this.userService.list().subscribe(
      (list: any) => {
        this.list = list;
      },
      err => console.log(err)
    );
  }

}
