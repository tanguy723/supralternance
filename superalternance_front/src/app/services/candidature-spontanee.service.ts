import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {CandidatureSpontanee} from '../../models/candidatureSpontanee';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CandidatureSpontaneeService {

  private apiUrl = 'http://localhost:8084.candidatures.spontanees';

  constructor(private http: HttpClient) { }

  getCandidatures(): Observable<CandidatureSpontanee[]> {
    return this.http.get<CandidatureSpontanee[]>(this.apiUrl);
  }

  getCandidature(id: CandidatureSpontanee): Observable<CandidatureSpontanee> {
    return this.http.get<CandidatureSpontanee>(`${this.apiUrl}/${id}`);
  }

  addCandidature(candidature: CandidatureSpontanee): Observable<CandidatureSpontanee> {
    return this.http.post<CandidatureSpontanee>(this.apiUrl, candidature);
  }

  updateCandidature(candidature: CandidatureSpontanee): Observable<CandidatureSpontanee> {
    return this.http.put<CandidatureSpontanee>(this.apiUrl, candidature);
  }

  deleteCandidature(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
