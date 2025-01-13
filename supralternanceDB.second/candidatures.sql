-- Table: public.candidatures

-- DROP TABLE IF EXISTS public.candidatures;

CREATE TABLE IF NOT EXISTS public.candidatures
(
   id_candidature INT,
   date_candidature DATE,
   poste_candidate VARCHAR(50),
   reponse VARCHAR(50),
   id_entreprise INT NOT NULL,
   PRIMARY KEY(id_candidature),
   FOREIGN KEY(id_entreprise) REFERENCES Entreprises(id_entreprise)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.candidatures
    OWNER to postgres;