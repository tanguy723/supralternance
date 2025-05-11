import { TestBed } from '@angular/core/testing';

import { CandidatureParOffreService } from './candidature-par-offre.service';

describe('CandidatureParOffreService', () => {
  let service: CandidatureParOffreService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CandidatureParOffreService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
