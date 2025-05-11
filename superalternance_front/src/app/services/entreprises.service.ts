import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Entreprises} from '../../models/entreprises';

@Injectable({
  providedIn: 'root'
})
export class EntreprisesService {

  private apiUrl = 'http://localhost:8084.entreprises';

  constructor(private http: HttpClient) { }

  getEntreprises(): Observable<Entreprises[]> {
    return this.http.get<Entreprises[]>(this.apiUrl);
  }

  getEntreprise(id: Entreprises): Observable<Entreprises> {
    return this.http.get<Entreprises>(`${this.apiUrl}/${id}`);
  }

  addEntreprise(entreprises: Entreprises): Observable<Entreprises> {
    return this.http.post<Entreprises>(this.apiUrl, entreprises);
  }

  updateEntreprise(entreprises: Entreprises): Observable<Entreprises> {
    return this.http.put<Entreprises>(this.apiUrl, entreprises);
  }

  deleteEntreprise(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
