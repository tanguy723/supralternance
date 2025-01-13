-- Table: public.nbr_candidatures_par_jour

-- DROP TABLE IF EXISTS public.nbr_candidatures_par_jour;

CREATE TABLE IF NOT EXISTS public.nbr_candidatures_par_jour
(
   id_candidature INT,
   id_semainier INT,
   jour_candidature DATE,
   nbr_candidature_par_jour VARCHAR(50),
   PRIMARY KEY(id_candidature, id_semainier),
   FOREIGN KEY(id_candidature) REFERENCES Candidatures(id_candidature),
   FOREIGN KEY(id_semainier) REFERENCES semainier(id_semainier)

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.nbr_candidatures_par_jour
    OWNER to postgres;