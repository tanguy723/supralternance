-- Table: public.evenements

-- DROP TABLE IF EXISTS public.evenements;

CREATE TABLE IF NOT EXISTS public.evenements
(
   id_event INT,
   nom_evenement VARCHAR(50),
   date_evenements DATE,
   description VARCHAR(150),
   id_objectif INT NOT NULL,
   PRIMARY KEY(id_event),
   UNIQUE(id_objectif),
   FOREIGN KEY(id_objectif) REFERENCES Objectifs(id_objectif)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.evenements
    OWNER to postgres;