import {Component, OnInit, ViewChild} from '@angular/core';
import { CandidatureService} from '../services/candidature.service';
import { EntreprisesService } from '../services/entreprises.service';
import { Candidatures} from '../../models/candidatures';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {EntreprisesComponent} from '../entreprises/entreprises.component';

@Component({
  selector: 'app-candidatures',
  templateUrl: './candidatures.component.html',
  styleUrl: './candidatures.component.css'
})

export class CandidaturesComponent implements OnInit{

  form!: FormGroup;entrepriseData: any;
  @ViewChild(EntreprisesComponent) entreprisesComponent!: EntreprisesComponent;

  constructor(private fb: FormBuilder,private candidatureService: CandidatureService, private entreprisesService: EntreprisesService) {


  }

  ngOnInit(): void {
    this.form = this.fb.group({
      dateCandidature: ['', Validators.required],
      nomCandidature: ['', Validators.required],
      reponseCandidature: ['', Validators.required]
    });
  }


  onSubmit(): void {
    if (this.form.valid && this.entreprisesComponent.form.valid) {
      const entrepriseData = this.entreprisesComponent.form.value;
      const candidatureData = this.form.value;

      this.entreprisesService.addEntreprise(entrepriseData).subscribe({
        next: (response) => {
          console.log('Entreprise créée avec succès', response);

          this.candidatureService.addCandidature(candidatureData).subscribe({
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
