-- Table: public.CandidatureSpontanee

-- DROP TABLE IF EXISTS public."CandidatureSpontanee";

CREATE TABLE IF NOT EXISTS public."CandidatureSpontanee"
( 
	id_candidature int primary key not null,
	date_candidature DATE,
	poste_candidate varchar(25),
	rep varchar(25),
	nom_entreprise_vise varchar(25),
	addresse_phys varchar (25),
	addresse_electronique varchar(25),
	telephone varchar(25)
	
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."CandidatureSpontanee"
    OWNER to postgres;