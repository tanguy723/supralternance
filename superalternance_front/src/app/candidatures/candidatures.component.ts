import { Component, OnInit } from '@angular/core';
import { CandidatureService} from '../services/candidature.service';
import { Candidatures} from '../../models/candidatures';

@Component({
  selector: 'app-candidatures',
  templateUrl: './candidatures.component.html',
  styleUrl: './candidatures.component.css'
})

export class CandidaturesComponent {

  candidatures: Candidatures = {

    dateCandidature: new Date(),
    nomCandidature: '',
    reponseCandidature: ''



  };

  constructor(private candidatureService: CandidatureService) {

  }

  onSubmit() {
    this.candidatureService.getCandidature(this.candidatures).subscribe({
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
