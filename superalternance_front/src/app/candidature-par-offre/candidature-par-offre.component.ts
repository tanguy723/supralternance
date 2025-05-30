import {Component, OnInit, ViewChild} from '@angular/core';
import {CandidatureParOffre} from '../../models/candidatureParOffre';
import {CandidatureParOffreService} from '../services/candidature-par-offre.service';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {EntreprisesComponent} from '../entreprises/entreprises.component';
import {EntreprisesService} from '../services/entreprises.service';

@Component({
  selector: 'app-candidature-par-offre',
  templateUrl: './candidature-par-offre.component.html',
  styleUrl: './candidature-par-offre.component.css'
})
export class CandidatureParOffreComponent implements OnInit {

  form!: FormGroup;
  @ViewChild(EntreprisesComponent) entreprisesComponent!: EntreprisesComponent;

  constructor( private fb: FormBuilder, private candidatureParOffreService: CandidatureParOffreService, private entreprisesService: EntreprisesService) {

  }

  ngOnInit() : void {
    this.form = this.fb.group({
      dateCandidature: ['', Validators.required],
      nomCandidature: ['', Validators.required],
      reponseCandidature: ['', Validators.required],
      nomOffre: ['', Validators.required],
      lienOffre: ['', Validators.required],
      descriptionOffre: ['', Validators.required],
      originOffre: ['', Validators.required]
    });
  }


  onSubmit(): void {
    if (this.form.valid && this.entreprisesComponent.form.valid ) {
      const entrepriseData = this.entreprisesComponent.form.value;
      const candidatureData = this.form.value;

      this.entreprisesService.addEntreprise(entrepriseData).subscribe({
        next: (response) => {
          console.log('Entreprise créée avec succès', response);
          this.candidatureParOffreService.addCandidature(candidatureData).subscribe({
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
        },
        error: (err) => console.error('Erreur entreprise', err)
      });
    } else {
      console.warn('Formulaire invalide, veuillez vérifier les champs');
    }

  }

}
