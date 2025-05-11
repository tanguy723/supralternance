import { TestBed } from '@angular/core/testing';

import { CandidatureSpontaneeService } from './candidature-spontanee.service';

describe('CandidatureSpontaneeService', () => {
  let service: CandidatureSpontaneeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CandidatureSpontaneeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
