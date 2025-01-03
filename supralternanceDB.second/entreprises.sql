-- Table: public.entreprises

-- DROP TABLE IF EXISTS public.entreprises;

CREATE TABLE IF NOT EXISTS public.entreprises
(
   id_entreprise INT,
   nom_entreprise_concerne VARCHAR(50),
   addresse_electronique VARCHAR(50),
   telephone VARCHAR(50),
   addresse_phys VARCHAR(50),
   PRIMARY KEY(id_entreprise)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.entreprises
    OWNER to postgres;