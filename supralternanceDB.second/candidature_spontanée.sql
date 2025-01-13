-- Table: public.candidature_spontanée

-- DROP TABLE IF EXISTS public."candidature_spontanée";

CREATE TABLE IF NOT EXISTS public."candidature_spontanée"
(
   id_candidature_spontanee INT,
   moyen_de_communication VARCHAR(50),
   id_candidature INT NOT NULL,
   PRIMARY KEY(id_candidature_spontanee),
   UNIQUE(id_candidature),
   FOREIGN KEY(id_candidature) REFERENCES Candidatures(id_candidature)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."candidature_spontanée"
    OWNER to postgres;