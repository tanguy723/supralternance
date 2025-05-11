import { Component } from '@angular/core';
import {CandidatureParOffre} from '../../models/candidatureParOffre';
import {CandidatureParOffreService} from '../services/candidature-par-offre.service';

@Component({
  selector: 'app-candidature-par-offre',
  templateUrl: './candidature-par-offre.component.html',
  styleUrl: './candidature-par-offre.component.css'
})
export class CandidatureParOffreComponent {

  candidatures_par_offre: CandidatureParOffre = {

    dateCandidature: new Date(),
    nomCandidature: '',
    reponseCandidature: '',
    nomOffre : '',
    lienOffre : '',
    descriptionOffre : '',
    originOffre : ''


  };

  constructor(private candidatureParOffreService: CandidatureParOffreService) {

  }

  onSubmit() {
    this.candidatureParOffreService.getCandidature(this.candidatures_par_offre).subscribe({
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
