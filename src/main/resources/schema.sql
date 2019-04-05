CREATE TABLE IF NOT EXISTS Organization (
  id        INTEGER              COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
  version   INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
  name      VARCHAR(45) NOT NULL COMMENT 'Название',
  full_name VARCHAR(225)         COMMENT 'Полное название',
  inn       VARCHAR(45)          COMMENT 'ИНН',
  kpp       VARCHAR(45)          COMMENT 'КПП',
  address   VARCHAR(225)         COMMENT 'Адрес',
  phone     VARCHAR(25)          COMMENT 'Телефон',
  is_active BOOLEAN              COMMENT 'Активность в настоящий момент'
);
COMMENT ON TABLE Organization IS 'Организация';

CREATE TABLE IF NOT EXISTS Office (
  id              INTEGER              COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
  version         INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
  organization_id INTEGER NOT NULL     COMMENT 'Идентификатор организации, к которой принадлежит офис',
  name            VARCHAR(45)          COMMENT 'Название',
  address         VARCHAR(255)         COMMENT 'Адрес',
  phone           VARCHAR(25)          COMMENT 'Телефон',
  is_active       BOOLEAN              COMMENT 'Активность в настоящий момент'
);
COMMENT ON TABLE Office IS 'Офис';

CREATE TABLE IF NOT EXISTS Document_Type (
  code    INTEGER              COMMENT 'Уникальный идентификатор - код документа' PRIMARY KEY,
  version INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
  name    VARCHAR(225) NOT NULL COMMENT 'Название'
);
COMMENT ON TABLE Document_Type IS 'Тип документа';

CREATE TABLE IF NOT EXISTS Document (
  id                 INTEGER              COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
  version            INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
  number             VARCHAR(45) NOT NULL COMMENT 'Номер',
  date               DATE NOT NULL        COMMENT 'Дата выдачи',
  document_type_code INTEGER NOT NULL     COMMENT 'Код документа'
);
COMMENT ON TABLE Document IS 'Документ';

CREATE TABLE IF NOT EXISTS Country (
  code    INTEGER              COMMENT 'Уникальный идентификатор - код страны' PRIMARY KEY,
  version INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
  name    VARCHAR(225) NOT NULL COMMENT ''
);
COMMENT ON TABLE Country IS 'Страна';

CREATE TABLE IF NOT EXISTS User (
  id               INTEGER              COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
  version          INTEGER NOT NULL     COMMENT 'Служебное поле hibernate',
  first_name       VARCHAR(45) NOT NULL COMMENT 'Имя',
  last_name        VARCHAR(45)          COMMENT 'Фамилия',
  middle_name      VARCHAR(45)          COMMENT 'Отчество',
  office_id        INTEGER NOT NULL     COMMENT 'Идентификатор офиса, в котором работает сотрудник',
  position         VARCHAR(225)          COMMENT 'Занимаемая должность',
  phone            VARCHAR(25)          COMMENT 'Телефон',
  document_id      INTEGER              COMMENT 'Идентификатор документа, удостоверяющего личность',
  citizenship_code INTEGER              COMMENT 'Код страны',
  is_identified    BOOLEAN              COMMENT 'Является ли сотрудник идентифицированным'
);
COMMENT ON TABLE User IS 'Сотрудник';

CREATE INDEX IX_Organization_Id ON Office (organization_id);
ALTER TABLE Office ADD FOREIGN KEY (organization_id) REFERENCES Organization(id);

CREATE INDEX IX_Document_Type_Code ON Document (document_type_code);
ALTER TABLE Document ADD FOREIGN KEY (document_type_code) REFERENCES Document_Type(code);

CREATE INDEX IX_Office_Id ON User (office_id);
ALTER TABLE User ADD FOREIGN KEY (office_id) REFERENCES Office(id);

CREATE INDEX IX_Document_Id ON User (document_id);
ALTER TABLE User ADD FOREIGN KEY (document_id) REFERENCES Document(id);

CREATE INDEX IX_Citizenship_Code ON User (citizenship_code);
ALTER TABLE User ADD FOREIGN KEY (citizenship_code) REFERENCES Country(code);