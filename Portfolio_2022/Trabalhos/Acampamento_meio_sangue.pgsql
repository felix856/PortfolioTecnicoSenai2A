 ##Dev:Félix Francisco
------------------Tabela Deuses---
create table Deuses(
cadeira int ,
poder varchar,
nome varchar primary key

);
------------------------------
Create table Seres(
nome varchar primary key,
tipo varchar,
campista_protegido int references campista (id),
funcao varchar

);
insert into Seres
(campista_protegido,nome,tipo,funcao);
values


-------------Table chalé
create table chale(
numero int primary key,
nome varchar,
Deus_chale varchar	
);
insert into chale
(numero,nome,Deus_chale)
values 
;
----------------Tabela campistas
create table campista(
id  serial  primary key,
nome varchar,
	idade int,
	Habilidades varchar,
	id_numerochale int references chale (numero),
	Pai_Deus varchar references Deuses (nome)
);
insert into campista
(nome,idade,Habilidades,id_numerochale,Pai_Deus)
values
('Percy Jackson',18,'Manipular e curar com a água',3,'Poseidon'),
('Annabeth Chase',18,'Estrategista e guerreira',6,'Atena'),
('Nico di Angelo',15,'Abrir fissuras,controlar submundo,fazer tremor de terra',13,'Hades'),
('Bianca di Angelo',12,'Invocar e banir os mortos,Destruir Guerreiros Esqueletos,Comunicar-se telepaticamente com fantasmas',13,'Hades'),
('Luke Castellan',22,'Velocidade Sobre -Humana,Teletransporte',11,'Hermes'),
('Thalia Grace',15,'Aerocinese,Atmocinese,Eletrocinese',1,'Zeus');
---------------------Tabela Area
create table Areas(
nome varchar,
id_area int primary key,
utilidade varchar	
);
insert into Areas
(nome,id_area,utilidade)
values
('Anfiteatro',11,'A plataforma pode ser utilizada para atividades, mas só é regularmente ocupada pelo corpo docente do acampamento.'),
('Arena',22,' O ambiente é composto por uma arena central e por assentos em seus extremos, tomados pelos semideuses que não estão batalhando'),
('Casa Grande',33,'É a sede do acampamento, onde o Diretor e o Diretor de Atividades têm seus apartamentos, e onde todos os conselhos de guerra são mantidos'),
('Pavilhão de jantar',44,'Área aberta e permeada por mesas e cadeiras de jantar, é onde a comida é servida'),
('Bosque do Conselho dos Anciãos',55,'Aqui acontece as reuniões dos sátiros, mas também pode ser um lugar que todos podem se reunir para algum tipo de conversa porém as conversas devem ser em momentos que não está acontecendo as reuniões'),
('Arsenal',66,'Galpão grande de metal localizado ao lado do chalé de Atena, é uma espécie de tenda de tecido de camuflagem');

--------Tabela Funcionário
create table funcionario(
cod int primary key,
nome varchar,
Pai_Deus varchar references Deuses (nome),
especies varchar,
funcao varchar	
);
insert into funcionario
(cod,nome,Pai_Deus,especies,funcao)
values
(1001,'Dionisio','Zeus','Deus','Diretor do acampamento'),
(1002,'Quíron',null,'Centauro','Diretor de atividades'),
(1003,'Argos','Hera','Gigante','Seguranca'),
(1004,'Harpias',null,'Harpias','"Limpeza"'),
(1005,'Tântalo',null,'Semideus','Diretor de atividades'),
(1006,'Peleu',null,'Dragão','Guarda da arvore de Thalia');

 create table trabalha(
 id_area int references Areas (id_area),
id_campista int references campista (id),
id_funcionario int references funcionario (cod)	 
 );
 insert into trabalha
 (id_campista,id_area,id_funcionario)
 values
 (1,33,1002),
 (2,22,1003),
 (3,44,1004),
 (4,55,1001),
 (6,66,1005);
 select * from trabalha;
  select campista.nome,campista.habilidades,campista.idade,chale.nome from campista inner join chale on campista.id_numerochale = chale.numero  where Pai_Deus = 'Hades'

Tabela de visualização e exportação
\copy (select campista.nome,campista.habilidades,campista.idade,chale.nome from campista inner join chale on campista.id_numeroch
ale = chale.numero  where Pai_Deus = 'Hades') to 'C:\Users\felix_francisco\Documents\visualiza_filhosHades.csv' delimiter ';' csv header;
COPY 2

\copy (select funcionario.nome,funcionario.cod,funcionario.Pai_deus,funcionario.funcao from funcionario inner join Deuses on funcio
nario.Pai_Deus = Deuses.nome ) to 'C:\Users\felix_francisco\Documents\Visualiza_Pai_Deus_de_funcionarios.csv' delimiter ';' csv header;
COPY 2

Importando tabelas
\copy Seres from '\C:Users\felix_francisco\Downloads\Seres.csv' with delimiter ';' csv header
\copy Deuses from 'C:\Users\felix_francisco\Documents\Deuses_c.csv' with delimiter ';' csv header
