# Desafio Hackathon Green Software


## Backend - Springboot

## Enunciado

O grupo Green Software Foundation está mapeando o grau de maturidade das empresas com ligação aos seus parceiros quanto aos Objetivos de Desenvolvimento Sustentável e entrou em contato com nossos Gestores solicitando algumas features com grande <Urgência>!

Pela seu bom histórico de atuação em projetos anteriores, você foi um dos especialistas selecionados para entregar esta tarefa dentro do prazo!
Porém como você já está alocado em um projeto e tem suas atividades e agendas cheias, será necessário trabalhar neste projeto fora do horário de trabalho! ;)

Em nosso projeto temos uma API que já disponibiliza dados de Empresas e seus ODS's, e também uma listagem de ODS's do banco.





# A Green Software Foundation precisa das seguintes novas features:

1. Nossa API precisa disponibilizar uma API para pesquisar em nossos bancos de dados, quais empresas tem um determinado ODS em comum.
Em outras palavras, precisamos implementar **um novo endpoint** que recebe como parâmetro o ID de um ODS e retorna uma lista de empresas que tem relacionamento com esse ODS ordenado em ordem alfabética pelo nome da empresa.

2. Nossa API precisa disponibilizar uma API para inserir uma nova empresa, este endpoint deverá receber um JSON no mesmo formato que o nosso endpoint de pesquisa retorna de consulta (ver: <http://localhost:8080/api/companies/{id}?id=1>), sendo possível inserir apenas uma empresa por vez, juntamente com sua lista de ODSs.

3. Nossa API deve retornar uma lista customizada de notícias publicadas pelo IBGE relacionadas a sustentabilidade, cada item da lista deve conter os seguintes atributos:
* id;
* data_publicacao;
* introducao;
* link.
Em outras palavras, precisamos construir um endpoint que retora uma lista de notícias com os atributos acima.

Obs: As notícias não virão da nossa base de dados, para obter as notícias devemos utilizar a seguinte API do IBGE: <http://servicodados.ibge.gov.br/api/v3/noticias/?busca=sustentabilidade> (atributo: items).



## Considerações:

* É requisito que o projeto execute corretamente;
* É requisito manter a documentação do Swagger atualizada;
* Serão considerados os itens apresentados no último Tech Talks;
* Serão considerados estruturas de pastas e organização do projeto;
* Buscar criar componentes/classes reutilizáveis;
* Buscar utilização os princípios do SOLID;
* Padrões de projeto serão um diferencial;
* Testes unitários não foram solicitados, mas são bem vindos!




# Comandos e dicas

## Ambiente testado
Maven 3.6.3
Java 1.8

## Compilar
mvn package

## Executar (pela IDE de preferência ou com linha de comando abaixo)
java -jar .\target\hackathon-springboot-0.0.1-SNAPSHOT.jar

## H2 Console (o banco já vem com mock mínimo para trabalhar)
<http://localhost:8080/h2-console/>

* url=jdbc:h2:mem:testdb
* username=sa
* password=password


## Swagger url
<http://localhost:8080/swagger-ui.html#>
