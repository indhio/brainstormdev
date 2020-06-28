import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserFormComponent } from './modules/user/user-form.component';
import { UserComponent } from './modules/user/user.component';

const routes: Routes = [

  { path: '', component: UserComponent },
  { path: 'users', component: UserComponent },
  { path: 'users/add', component: UserFormComponent },

];

@NgModule({
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
