CREATE TABLE essen (
    essen_id int(10) AUTO_INCREMENT PRIMARAY KEY not null,
    essen_bezeichnung varchar(100) not null,
    essen_preis double (3. 10) not null
);

INSERT INTO essen (essen_bezeichnung, essen_preis)
    Values ('Banane', '1.5');