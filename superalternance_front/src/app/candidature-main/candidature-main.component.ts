import { Component } from '@angular/core';

@Component({
  selector: 'app-candidature-main',
  templateUrl: './candidature-main.component.html',
  styleUrl: './candidature-main.component.css'
})
export class CandidatureMainComponent {
  selectedForm: string = 'candidatures';

  onFormChange(formType: string) {
    this.selectedForm = formType;
  }

}
