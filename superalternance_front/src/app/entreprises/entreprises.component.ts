import { Component } from '@angular/core';
import {Entreprises} from '../../models/entreprises';
import {EntreprisesService} from '../services/entreprises.service';

@Component({
  selector: 'app-entreprises',
  templateUrl: './entreprises.component.html',
  styleUrl: './entreprises.component.css'
})
export class EntreprisesComponent {

  entreprises: Entreprises = {

    nomEntreprise: '',
    emailEntreprise: '',
    telephoneEntreprise: '',
    addresseEntreprise: ''

  };

  constructor(private entrepriseService: EntreprisesService) {

  }

  onSubmit() {
    this.entrepriseService.getEntreprise(this.entreprises).subscribe({
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
