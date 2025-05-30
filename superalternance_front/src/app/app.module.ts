import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CandidaturesComponent } from './candidatures/candidatures.component';
import { CandidatureParOffreComponent } from './candidature-par-offre/candidature-par-offre.component';
import { CandidatureSpontaneeComponent } from './candidature-spontanee/candidature-spontanee.component';
import { CandidatureMainComponent } from './candidature-main/candidature-main.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
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
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule

  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
