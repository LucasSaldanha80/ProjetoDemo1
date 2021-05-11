INSERT INTO USUARIO(nome, email, senha) VALUES('Lucas', 'lucas@email.com', '123456');
INSERT INTO USUARIO(nome, email, senha) VALUES('Saldanha', 'saldanha@email.com', '654321');
INSERT INTO USUARIO(nome, email, senha) VALUES('Toledo', 'toledo@email.com', '113378');
INSERT INTO USUARIO(nome, email, senha) VALUES('Maria', 'maria@email.com', '224490');
INSERT INTO USUARIO(nome, email, senha) VALUES('Joao', 'joao@email.com', '557789');

INSERT INTO SERVICO(nome) VALUES('Mecanico');
INSERT INTO SERVICO(nome) VALUES('Diarista');
INSERT INTO SERVICO(nome) VALUES('Jardineiro');
INSERT INTO SERVICO(nome) VALUES('Eletricista');
INSERT INTO SERVICO(nome) VALUES('Professor particular');

INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('O melhor Mecanico', 'Sou o melhor mecanico da cidade', '2021-05-05 18:00:00', 1, 1);
INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('A melhor Diarista', 'Sou a melhor diarista da cidade', '2021-05-05 18:05:00', 2, 2);
INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('O melhor Jardineiro', 'Sou o melhor jardineiro da cidade', '2021-05-05 18:02:00', 3, 3);
INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('O melhor Eletricista', 'Sou o melhor eletricista da cidade', '2021-05-05 18:01:00', 4, 4);
INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('O melhor Professor Particular', 'Sou o melhor professor particular da cidade', '2021-05-05 18:20:00', 5, 5);