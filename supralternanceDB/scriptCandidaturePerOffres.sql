-- Table: public.CandidaturePerOffres

-- DROP TABLE IF EXISTS public."CandidaturePerOffres";

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