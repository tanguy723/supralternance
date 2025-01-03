-- Table: public.objectifs

-- DROP TABLE IF EXISTS public.objectifs;

CREATE TABLE IF NOT EXISTS public.objectifs
(
   id_objectif INT,
   accomplis LOGICAL,
   PRIMARY KEY(id_objectif)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.objectifs
    OWNER to postgres;