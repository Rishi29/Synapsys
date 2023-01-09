create table address(
   id              uuid(100),
   address1        varchar(100),
   address2        text,
   state           text,
   city            text,
   zip             text,
   country         text,
   PRIMARY KEY (id)
);


--ALTER TABLE address
----    DROP CONSTRAINT IF EXISTS fk_address_patient_id,
--    ADD CONSTRAINT fk_address_patient_id
--        FOREIGN KEY (patient_id)
--            REFERENCES patient (id) ON DELETE CASCADE;
