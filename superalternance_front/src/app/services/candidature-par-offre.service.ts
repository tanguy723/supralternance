import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {CandidatureParOffre} from '../../models/candidatureParOffre';
import {CandidatureParOffreComponent} from '../candidature-par-offre/candidature-par-offre.component';



@Injectable({
  providedIn: 'root'
})
export class CandidatureParOffreService {

  private apiUrl = 'http://localhost:8084.candidatures.offres';

  constructor(private http: HttpClient) { }

  getCandidatures(): Observable<CandidatureParOffre[]> {
    return this.http.get<CandidatureParOffre[]>(this.apiUrl);
  }

  getCandidature(id: CandidatureParOffre): Observable<CandidatureParOffre> {
    return this.http.get<CandidatureParOffre>(`${this.apiUrl}/${id}`);
  }

  addCandidature(candidature: CandidatureParOffre): Observable<CandidatureParOffre> {
    return this.http.post<CandidatureParOffre>(this.apiUrl, candidature);
  }

  updateCandidature(candidature: CandidatureParOffreComponent): Observable<CandidatureParOffre> {
    return this.http.put<CandidatureParOffre>(this.apiUrl, candidature);
  }

  deleteCandidature(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
