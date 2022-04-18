 ##Dev:Félix Francisco
create table categorias(
id serial primary key,
descricao varchar(50),
num_corredor int
);
insert into categorias
(descricao, num_corredor)
values
('salgados', 4),
('padaria', 10);


select * from categorias


create table produtos(
id serial primary key,
descricao varchar(50),
qtd int,
valor decimal(5,2), 
categoria_id int,
foreign key(categoria_id) references categorias
);


insert into produtos
(descricao, qtd, valor, categoria_id)
values
('Pão', 40, 7.90, 2),
('Coxinha', 4, 3.50, 2),
('Sonho', 7, 6.00, 2),
('Macarrão', 25, 5.20, 1);
select * from produtos;
-- Consulta de relacionamento
select produtos.descricao as descricao_prod, valor, categorias.descricao as descricao_cat
from produtos inner join categorias on produtos.categoria_id = categorias.id;
