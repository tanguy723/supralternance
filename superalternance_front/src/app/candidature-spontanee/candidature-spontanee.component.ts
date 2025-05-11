import { Component } from '@angular/core';
import { CandidatureSpontanee} from '../../models/candidatureSpontanee';

import {CandidatureSpontaneeService} from '../services/candidature-spontanee.service';

@Component({
  selector: 'app-candidature-spontanee',
  templateUrl: './candidature-spontanee.component.html',
  styleUrl: './candidature-spontanee.component.css'
})
export class CandidatureSpontaneeComponent {

  candidatures_spontanee: CandidatureSpontanee = {

    dateCandidature: new Date(),
    nomCandidature: '',
    reponseCandidature: '',
    com: ''

  };

  constructor(private candidatureSpontaneeService: CandidatureSpontaneeService) {

  }

  onSubmit() {
    this.candidatureSpontaneeService.getCandidature(this.candidatures_spontanee).subscribe({
      next: (response) => {
        console.log('Candidature normale créée avec succès', response);
      },
      error: (error) => {
        console.error('Erreur lors de la création de la candidature normale', error);
      },
      complete: () => {
        console.log('Requête terminée');
      }
    });

  }
}
