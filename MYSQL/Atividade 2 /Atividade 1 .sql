CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_personagens(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade INT,
    data_criacao DATE,
    PRIMARY KEY (id)
);

INSERT INTO tb_personagens(nome, idade , data_criacao)
VALUES ("sub-zero" , 26 , "2022-11-18");

INSERT INTO tb_personagens(nome, idade , data_criacao)
VALUES ( "supermen" , 25 , "2022-11-18");

INSERT INTO tb_personagens(nome, idade , data_criacao)
VALUES ( "seujorge" , 60 , "2022-11-18");

INSERT INTO tb_personagens(nome, idade , data_criacao)
VALUES ( "eminem" , 32 , "2022-11-18");

INSERT INTO tb_personagens(nome, idade , data_criacao)
VALUES ( "ronaldinho" , 8 , "2022-11-18");

INSERT INTO tb_personagens(nome, idade , data_criacao)
VALUES ( "luvadepedreiro" , 10 , "2022-11-18");

-- Lista todos os dados da tabela tb_categorias

TRUNCATE TABLE tb_personagens

SELECT 
    *
FROM
    tb_personagens;
    

-- Criar uma Tabela tb_produtos
CREATE TABLE  tb_classes (
id bigint AUTO_INCREMENT,
habilidade varchar ( 255 ) NOT NULL ,
poder varchar ( 255 ) NOT NULL ,
defesa int ,
vitalidade int ,
personagens_id bigint ,
PRIMARY KEY (id),
FOREIGN KEY (personagens_id) REFERENCES tb_personagens(id)
);

-- Inserir dados na tabela tb_produtos
INSERT INTO tb_classes ( habilidade, poder, defesa, vitalidade, personagens_id)
values  (" artes-marciais " , "gelo" , 7 , 4 , 99 , 1 );

INSERT INTO tb_classes (habilidade, poder, defesa, vitalidade, personagens_id)
values (" super-forca " ,"raiodeluz", 10 , 100, 2); 

INSERT INTO tb_classes (habilidade, poder, defesa, vitalidade, personagens_id)
values ("Cantar" , "violao", 2, 54, 3) ;

INSERT INTO tb_classes (habilidade, poder, defesa, vitalidade, personagens_id)
values  (" Rimar " , "brigar" , 4 , 50 , 4 ) ; 

INSERT INTO tb_classes (habilidade, poder, defesa, vitalidade, personagens_id)
values (" driblar " , "agilidade" , 3 , 100 , 5);

INSERT INTO tb_classes (habilidade, poder, defesa, vitalidade, personagens_id)
values  (" Receba" , "melhordomundo", 2 , 42 , 6 );

SELECT * FROM tb_classes;


SELECT *
FROM tb_classes
where vitalidade >= 100 ;

SELECT *
FROM tb_classes 
where defesa >= 10 ;

SELECT nome, habilidade, poder, tb_personagens.idade AS idade_do_personagens
FROM tb_personagens INNER JOIN tb_classes 
ON tb_personagens.id = tb_classes.personagens_id;

