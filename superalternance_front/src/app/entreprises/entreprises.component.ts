import {Component, OnInit, Output} from '@angular/core';
import {Entreprises} from '../../models/entreprises';
import {EntreprisesService} from '../services/entreprises.service';
import {FormBuilder, FormGroup} from '@angular/forms';
import EventEmitter from 'node:events';

@Component({
  selector: 'app-entreprises',
  templateUrl: './entreprises.component.html',
  styleUrl: './entreprises.component.css'
})
export class EntreprisesComponent implements OnInit{


  form!: FormGroup;


  constructor(private fb: FormBuilder, private entrepriseService: EntreprisesService) {

  }

  ngOnInit():void {
    this.form = this.fb.group({
      nomEntreprise: [''],
      adresseEntreprise: [''],
      emailEntreprise: [''],
      telephoneEntreprise: [''],
    });
  }


}

