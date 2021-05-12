INSERT INTO USUARIO(nome, email, senha) VALUES('Lucas', 'lucas@email.com', '$2a$10$kOOkhaQNYs96yBur4jIK8eNotFovwclLaL7XWG0N0IMEOEsYkMQWu');
INSERT INTO USUARIO(nome, email, senha) VALUES('Maria', 'maria@email.com', '$2a$10$3vECm6Jk8LDj3KrcNZGIj.ppL2SliIl5chOcrn.iur8XC2/8513WC');
INSERT INTO USUARIO(nome, email, senha) VALUES('Toledo', 'toledo@email.com', '$2a$10$Mrx8IKNOka3CCd5628BUs.qhymxeENkvBx782jai3rLpUI6R3Xo/y');
INSERT INTO USUARIO(nome, email, senha) VALUES('Saldanha', 'saldanha@email.com', '$2a$10$1KtBfIzcHeIbVRS7Xx.3cufg0DcX3fClrxf5zzbPjaco3nWWdRexy');
INSERT INTO USUARIO(nome, email, senha) VALUES('Joao', 'joao@email.com', '$2a$10$C6I7IByQVpWtFzp3i5mIMujYiMnuvpRK68R.opBozcxnFK.WkABW6');
INSERT INTO USUARIO(nome, email, senha) VALUES('Jose', 'jose@email.com', '$2a$10$nIMbudls4QBBr2.SuzS1n.I6Fis7fg0HFsXOXFBCML2.DpF6B.vE6');
INSERT INTO USUARIO(nome, email, senha) VALUES('Miguel', 'miguel@email.com', '$2a$10$drpNokqGCzk864ibrSK9PO7nZKaFB4jb5TqxgF7Kx3Bz/nPTRpVGC');


INSERT INTO SERVICO(nome) VALUES('Mecanico');
INSERT INTO SERVICO(nome) VALUES('Diarista');
INSERT INTO SERVICO(nome) VALUES('Jardineiro');
INSERT INTO SERVICO(nome) VALUES('Eletricista');
INSERT INTO SERVICO(nome) VALUES('Professor particular');
INSERT INTO SERVICO(nome) VALUES('Tecnico de Televisores');
INSERT INTO SERVICO(nome) VALUES('Personal Trainer');
INSERT INTO SERVICO(nome) VALUES('Agente de Viagens');
INSERT INTO SERVICO(nome) VALUES('Desenvolvedor');
INSERT INTO SERVICO(nome) VALUES('Designer Grafico');

INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('O melhor Dev', 'Sou o melhor desenvolvedor da cidade', '2021-05-05 18:00:00', 1, 9);
INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('A melhor Diarista', 'Sou a melhor diarista da cidade', '2021-05-05 18:05:00', 2, 2);
INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('O melhor Jardineiro', 'Sou o melhor jardineiro da cidade', '2021-05-05 18:02:00', 4, 3);
INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('O melhor Eletricista', 'Sou o melhor eletricista da cidade', '2021-05-05 18:01:00', 3, 4);
INSERT INTO POSTAGEM(titulo, mensagem, data_criacao, autor_id, servico_id) VALUES('O melhor Professor Particular', 'Sou o melhor professor particular da cidade', '2021-05-05 18:20:00', 5, 5);