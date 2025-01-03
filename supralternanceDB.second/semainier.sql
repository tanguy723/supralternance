-- Table: public.semainier

-- DROP TABLE IF EXISTS public.semainier;

CREATE TABLE IF NOT EXISTS public.semainier
(
  id_semainier INT,
   objectif_candidature_par_semaine INT,
   id_objectif INT NOT NULL,
   PRIMARY KEY(id_semainier),
   UNIQUE(id_objectif),
   FOREIGN KEY(id_objectif) REFERENCES Objectifs(id_objectif)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.semainier
    OWNER to postgres;