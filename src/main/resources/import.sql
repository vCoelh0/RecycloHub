-- ========================
-- Usuários
-- ========================
INSERT INTO tb_usuario (nome, sobrenome, email, data_nascimento, senha, perfil, pontos_verdes) VALUES ('Admin', 'Recyclo', 'admin@recyclo.com', '1990-01-01', 'admin123', 'ADMIN', 0);

INSERT INTO tb_usuario (nome, sobrenome, email, data_nascimento, senha, perfil, pontos_verdes) VALUES ('Rafael', 'Santiago', 'rafael@email.com', '2003-05-05', 'senha123', 'USUARIO', 0);

INSERT INTO tb_usuario (nome, sobrenome, email, data_nascimento, senha, perfil, pontos_verdes) VALUES ('Giovana', 'Alves', 'giovana@email.com', '2003-08-12', 'senha123', 'USUARIO', 0);

-- ========================
-- Pontos de coleta
-- ========================
INSERT INTO tb_pontocoleta (nome, endereco, tipo_residuo) VALUES ('Ponto Center Norte', 'Av. Otto Baumgart, 500 - Vila Guilherme', 'Fonte, Placa Mãe');

INSERT INTO tb_pontocoleta (nome, endereco, tipo_residuo) VALUES ('Ponto Escola Municipal Santos', 'Rua das Flores, 123 - Centro', 'Bateria, Celular');

INSERT INTO tb_pontocoleta (nome, endereco, tipo_residuo) VALUES ('Ponto Praça da Liberdade', 'Praça da Liberdade, s/n - Liberdade', 'Monitor, Controle');
