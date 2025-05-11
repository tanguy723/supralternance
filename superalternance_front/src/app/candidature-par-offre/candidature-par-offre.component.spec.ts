import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CandidatureParOffreComponent } from './candidature-par-offre.component';

describe('CandidatureParOffreComponent', () => {
  let component: CandidatureParOffreComponent;
  let fixture: ComponentFixture<CandidatureParOffreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CandidatureParOffreComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CandidatureParOffreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
