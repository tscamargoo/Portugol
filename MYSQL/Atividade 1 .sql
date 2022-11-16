-- Criando o Banco de Dados
CREATE DATABASE db_pessoas;

USE db_pessoas;

CREATE TABLE tb_pessoas(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade INT,
    data_contratacao DATE,
    salario DECIMAL NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO tb_pessoas(nome, idade, data_contratacao, salario) 
VALUES("thiago", 24, "2022-10-03", 6.700);

INSERT INTO tb_pessoas(nome, idade, data_contratacao, salario) 
VALUES("alex", 24, "2022-10-03", 6.500);

INSERT INTO tb_pessoas(nome, idade, data_contratacao, salario) 
VALUES("allysom", 21, "2022-10-03", 1.700);

INSERT INTO tb_pessoas(nome, idade, data_contratacao, salario) 
VALUES("eduardo", 27, "2022-10-03", 1.300);

INSERT INTO tb_pessoas(nome, idade, data_contratacao, salario) 
VALUES("rafael", 40, "2022-10-03", 1.400);

INSERT INTO tb_pessoas(nome, idade, data_contratacao, salario) 
VALUES("yuri", 22, "2022-10-03", 2.000);

SELECT DISTINCT * FROM tb_pessoas;


