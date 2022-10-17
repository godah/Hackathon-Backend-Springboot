INSERT INTO ods (id, descricao) VALUES (1, 'Erradicação da pobreza');
INSERT INTO ods (id, descricao) VALUES (2, 'Fome zero e agricultura sustentável');
INSERT INTO ods (id, descricao) VALUES (3, 'Saúde e bem-estar');
INSERT INTO ods (id, descricao) VALUES (4, 'Educação de qualidade');
INSERT INTO ods (id, descricao) VALUES (5, 'Igualdade de gênero');
INSERT INTO ods (id, descricao) VALUES (6, 'Água potável e saneamento');
INSERT INTO ods (id, descricao) VALUES (7, 'Energia limpa e acessível');
INSERT INTO ods (id, descricao) VALUES (8, 'Trabalho decente e crescimento econômico');
INSERT INTO ods (id, descricao) VALUES (9, 'Indústria, inovação e infraestrutura');
INSERT INTO ods (id, descricao) VALUES (10, 'Redução das desigualdades');
INSERT INTO ods (id, descricao) VALUES (11, 'Cidades e comunidades sustentáveis');
INSERT INTO ods (id, descricao) VALUES (12, 'Consumo e produção responsáveis');
INSERT INTO ods (id, descricao) VALUES (13, 'Ação contra a mudança global do clima');
INSERT INTO ods (id, descricao) VALUES (14, 'Vida na água');
INSERT INTO ods (id, descricao) VALUES (15, 'Vida terrestre');
INSERT INTO ods (id, descricao) VALUES (16, 'Paz, justiça e instituições eficazes');
INSERT INTO ods (id, descricao) VALUES (17, 'Parcerias e meios de implementação');


INSERT INTO company (id, name) VALUES (1, 'CHOAM Duna');
INSERT INTO company (id, name) VALUES (2, 'Acme Corp.');
INSERT INTO company (id, name) VALUES (3, 'Sirius Cybernetics Corp.');
INSERT INTO company (id, name) VALUES (4, 'Oscorp');
INSERT INTO company (id, name) VALUES (5, 'Indústrias Rico');
INSERT INTO company (id, name) VALUES (6, 'Soylent Corp');
INSERT INTO company (id, name) VALUES (7, 'Very Big Corp. of America');
INSERT INTO company (id, name) VALUES (8, 'Frobozz Magic Co.');
INSERT INTO company (id, name) VALUES (9, 'Warbucks Industries');
INSERT INTO company (id, name) VALUES (10, 'Tyrell Corp.');
INSERT INTO company (id, name) VALUES (11, 'Empresas Wayne');
INSERT INTO company (id, name) VALUES (12, 'Virtucon');
INSERT INTO company (id, name) VALUES (13, 'Globex');
INSERT INTO company (id, name) VALUES (14, 'Corporações Umbrella');
INSERT INTO company (id, name) VALUES (15, 'Indústrias Wonka');
INSERT INTO company (id, name) VALUES (16, 'Indústrias Stark');
INSERT INTO company (id, name) VALUES (17, 'Clampett Oil');
INSERT INTO company (id, name) VALUES (18, 'Oceanic Airlines');
INSERT INTO company (id, name) VALUES (19, 'Cyberdyne Systems Corp.');


INSERT INTO company_has_ods (company_id, ods_id) VALUES (1, 3);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (1, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (1, 5);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (1, 10);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (1, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (1, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (1, 8);

INSERT INTO company_has_ods (company_id, ods_id) VALUES (2, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (2, 11);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (2, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (2, 16);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (2, 17);

INSERT INTO company_has_ods (company_id, ods_id) VALUES (3, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (3, 7);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (3, 9);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (3, 13);

INSERT INTO company_has_ods (company_id, ods_id) VALUES (4, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (4, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (4, 7);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (4, 9);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (4, 15);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (4, 17);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (4, 8);


INSERT INTO company_has_ods (company_id, ods_id) VALUES (5, 2);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (5, 3);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (5, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (5, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (5, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (5, 15);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (5, 17);


INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 2);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 11);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 15);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (6, 17);



INSERT INTO company_has_ods (company_id, ods_id) VALUES (7, 2);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (7, 3);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (7, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (7, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (7, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (7, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (7, 17);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (7, 9);


INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 11);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 13);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 14);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 15);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 16);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 17);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 9);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (8, 3);



INSERT INTO company_has_ods (company_id, ods_id) VALUES (9, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (9, 3);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (9, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (9, 7);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (9, 9);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (9, 13);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (9, 16);


INSERT INTO company_has_ods (company_id, ods_id) VALUES (10, 3);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (10, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (10, 5);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (10, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (10, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (10, 10);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (10, 12);




INSERT INTO company_has_ods (company_id, ods_id) VALUES (11, 3);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (11, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (11, 5);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (11, 10);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (11, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (11, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (11, 8);

INSERT INTO company_has_ods (company_id, ods_id) VALUES (12, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (12, 11);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (12, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (12, 16);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (12, 17);

INSERT INTO company_has_ods (company_id, ods_id) VALUES (13, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (13, 7);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (13, 9);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (13, 13);

INSERT INTO company_has_ods (company_id, ods_id) VALUES (14, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (14, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (14, 7);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (14, 9);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (14, 15);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (14, 17);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (14, 8);


INSERT INTO company_has_ods (company_id, ods_id) VALUES (15, 2);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (15, 3);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (15, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (15, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (15, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (15, 15);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (15, 17);


INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 2);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 11);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 15);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (16, 17);



INSERT INTO company_has_ods (company_id, ods_id) VALUES (17, 2);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (17, 3);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (17, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (17, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (17, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (17, 9);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (17, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (17, 17);


INSERT INTO company_has_ods (company_id, ods_id) VALUES (18, 1);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (18, 2);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (18, 4);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (18, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (18, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (18, 15);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (18, 17);


INSERT INTO company_has_ods (company_id, ods_id) VALUES (19, 2);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (19, 6);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (19, 8);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (19, 9);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (19, 12);
INSERT INTO company_has_ods (company_id, ods_id) VALUES (19, 17);