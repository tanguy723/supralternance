import {Candidatures} from './candidatures';

export class CandidatureParOffre extends Candidatures{
  constructor(
    dateCandidature : Date,
    nomCandidature : String,
    reponseCandidature : String,
    public nomOffre : String,
    public lienOffre : String,
    public descriptionOffre : String,
    public originOffre : String
  ) {
    super(
      dateCandidature,
      nomCandidature,
      reponseCandidature)
  }

}
