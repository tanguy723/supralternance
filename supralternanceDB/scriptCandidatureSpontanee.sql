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

