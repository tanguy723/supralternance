import {Candidatures} from './candidatures';

export class CandidatureSpontanee extends Candidatures {
    constructor(
      dateCandidature : Date,
      nomCandidature : String,
      reponseCandidature : String,
      public com : String ) {
      super(
        dateCandidature,
        nomCandidature,
        reponseCandidature);
    }
}
