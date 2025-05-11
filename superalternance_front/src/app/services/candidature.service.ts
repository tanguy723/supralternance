import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import { Candidatures } from '../../models/candidatures';


@Injectable({
  providedIn: 'root'
})
export class CandidatureService {

  private apiUrl = 'http://localhost:8084.candidatures';

  constructor(private http: HttpClient) { }

  getCandidatures(): Observable<Candidatures[]> {
    return this.http.get<Candidatures[]>(this.apiUrl);  // Requête GET pour récupérer toutes les candidatures
  }

  getCandidature(id: Candidatures): Observable<Candidatures> {
    return this.http.get<Candidatures>(`${this.apiUrl}/${id}`);  // Requête GET pour récupérer une candidature spécifique
  }

  addCandidature(candidature: Candidatures): Observable<Candidatures> {
    return this.http.post<Candidatures>(this.apiUrl, candidature);  // Requête POST pour ajouter une candidature
  }

  updateCandidature(candidature: Candidatures): Observable<Candidatures> {
    return this.http.put<Candidatures>(this.apiUrl, candidature);  // Requête PUT pour mettre à jour une candidature
  }

  deleteCandidature(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);  // Requête DELETE pour supprimer une candidature
  }
}
