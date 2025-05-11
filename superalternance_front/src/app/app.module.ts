import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CandidaturesComponent } from './candidatures/candidatures.component';
import { CandidatureParOffreComponent } from './candidature-par-offre/candidature-par-offre.component';
import { CandidatureSpontaneeComponent } from './candidature-spontanee/candidature-spontanee.component';
import { CandidatureMainComponent } from './candidature-main/candidature-main.component';
import {FormsModule} from '@angular/forms';
import { EntreprisesComponent } from './entreprises/entreprises.component';




@NgModule({
  declarations: [
    AppComponent,
    CandidaturesComponent,
    CandidatureParOffreComponent,
    CandidatureSpontaneeComponent,
    CandidatureMainComponent,
    EntreprisesComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule

  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
