import { Component, OnInit } from '@angular/core';
import { CandidatureService} from '../services/candidature.service';
import { Candidatures} from '../../models/candidatures';

@Component({
  selector: 'app-candidatures',
  templateUrl: './candidatures.component.html',
  styleUrl: './candidatures.component.css'
})
export class CandidaturesComponent implements OnInit{

  candidatures: Candidatures[] = [];

  constructor(private candidatureService: CandidatureService){

  }

  ngOnInit(): void {
    this.candidatureService.getCandidatures().subscribe((data) => {
      this.candidatures = data;
    })
  }

}
