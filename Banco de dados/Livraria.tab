#Dev:Félix Francisco
#Descrição : Criei as três tabelas , clientes e seus dados ,editoras e seus dados, e os respectivos dados da livraria , O que liga as 3 é o codigo_isbn (chave estrangeira) e na lista livro ela é a primária ,  o ponto é usar o seu código isbn como reconhecimento do título, da editora ,  e de sua identificação.

CREATE TABLE LISTA_CLIENTE (
	codigo text primary key,
	cpf text,
	telefone varchar(20),
	endereco text, 
	livros_comprados text,
	data_compra date,
	cod_ISBN text , 
	foreign key (cod_ISBN) references LISTA_LIVROS(ISBN)
);
insert into LISTA_CLIENTE
(codigo,cpf,telefone,endereco,livros_comprados,data_compra)
values
('101','3232323','231568','Palhoça-Centro','O dia de amanhã','2020-12-01'),
('102','111213','245888','Palhoça-Aririu','O amanhã','2020-12-02'),
('103','4962633','238558','Palhoça-Pagani','Amanhã promete','2020-10-03');

CREATE TABLE LISTA_LIVROS (
	Titulo text,
	ISBN text primary key,
	nome_autor text,
	quantidade_em_estoque varchar(20),
	Assunto text, 
	editora text
);
insert into LISTA_LIVROS
(Titulo,ISBN,nome_autor,quantidade_em_estoque,Assunto,editora)
values
('O dia de amanhã','31','Christian Mane','60','motivacional','New days'),
('O amanhã','32','Jake Bloff','50','motivacional','New days'),
('O amanhã promete','33','Bally Floyd','70','motivacional','New days');
select * from LISTA_LIVROS;
UPDATE LISTA_CLIENTE SET cod_isbn = '33' where codigo = '103';




CREATE TABLE EDITORAS (
	nome text,
	GERENTE text,
	codigo text primary key,
	Endereco text,
	telefone_de_contato varchar(20));
insert into EDITORAS
(nome,GERENTE,codigo,Endereco,telefone_de_contato)
values
('New Days','Geison Arruda','51','New York','555001'),
('New Nights','Jackson Mane','69','New Jersey','555002');
select * from LISTA_CLIENTE;
update LISTA_LIVROS set editora = 'New Nights' where isbn = '32';
select * from EDITORAS;
ALTER TABLE EDITORAS ADD COLUMN isbn_livros TEXT;
update EDITORAS set isbn_livros = '31' where codigo = '61';

