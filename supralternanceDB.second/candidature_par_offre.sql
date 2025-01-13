-- Table: public.candidature_par_offre

-- DROP TABLE IF EXISTS public.candidature_par_offre;

CREATE TABLE IF NOT EXISTS public.candidature_par_offre
(
   id_candidature_par_offre INT,
   addresse_de_offre VARCHAR(50),
   description_de_offre VARCHAR(50),
   provenance_de_offre VARCHAR(50),
   id_candidature INT NOT NULL,
   PRIMARY KEY(id_candidature_par_offre),
   UNIQUE(id_candidature),
   FOREIGN KEY(id_candidature) REFERENCES Candidatures(id_candidature)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.candidature_par_offre
    OWNER to postgres;