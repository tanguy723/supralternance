import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CandidaturesComponent} from './candidatures/candidatures.component';
import {Candidatures} from '../models/candidatures';

const routes: Routes = [
  { path: 'candidatures', component: CandidaturesComponent},
  { path: '', redirectTo: '/candidatures', pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
