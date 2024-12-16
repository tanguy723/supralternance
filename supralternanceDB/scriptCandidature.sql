-- Table: public.Candidatures

-- DROP TABLE IF EXISTS public."Candidatures";

CREATE TABLE IF NOT EXISTS public."Candidatures"
(
	id_candidature int primary key not null,
	date_candidature date not null,
	poste_candidature varchar(100) not null,
	reponse varchar(100),
	nom_entreprise varchar(100) not null,
	addressePhys varchar(100),
	addresseMail varchar(100),
	telephone varchar(15)
	
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Candidatures"
    OWNER to postgres;

-- Table: public.Candidature par offre

-- DROP TABLE IF EXISTS public."CandidaturesPerOffres";

CREATE TABLE IF NOT EXISTS public."CandidaturesPerOffres"
(
	id_candidatureOffre int primary key not null,
	addresseOffre varchar(100) not null,
	descriptionOffre varchar(100),
	siteOffre varchar(30)
	
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."CandidaturesPerOffres"
    OWNER to postgres;

-- Table: public.Candidature Spontanée

-- DROP TABLE IF EXISTS public."CandidaturesSpontanee";

CREATE TABLE IF NOT EXISTS public."CandidaturesSpontanee"
(
	id_candidatureSpontanee int primary key not null,
	moyenCom varchar(25)
	
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."CandidaturesSpontanee"
    OWNER to postgres;


