import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CandidatureMainComponent } from './candidature-main.component';

describe('CandidatureMainComponent', () => {
  let component: CandidatureMainComponent;
  let fixture: ComponentFixture<CandidatureMainComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CandidatureMainComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CandidatureMainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
