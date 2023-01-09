create table if not exists patient (
    id                          uuid(100),
    address_id                  uuid,
    firstName                   text,
    lastName                    text,
    emailId                     text,
    phoneNumber                 text,
    age                         text,
    patientRegisteredNumber     text,
    PRIMARY KEY (id)
);

ALTER TABLE patient
--    DROP CONSTRAINT IF EXISTS fk_address_patient_id,
    ADD CONSTRAINT fk_patient_address_id
        FOREIGN KEY (address_id)
            REFERENCES address (id) ON DELETE CASCADE;
