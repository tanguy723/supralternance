-- Table: public.deadline

-- DROP TABLE IF EXISTS public.deadline;

CREATE TABLE IF NOT EXISTS public.deadline
(
   id_Deadline INT,
   Date_deadline DATE,
   id_objectif INT NOT NULL,
   PRIMARY KEY(id_Deadline),
   UNIQUE(id_objectif),
   FOREIGN KEY(id_objectif) REFERENCES Objectifs(id_objectif)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.deadline
    OWNER to postgres;