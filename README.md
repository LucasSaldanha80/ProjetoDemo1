ProjectX

Consiste em uma rede social voltada para prestadores de serviço, onde pode ser utilizada como um portifólio e uma central de busca por profisionais autônomos.
  

Experimental social network to share knowledge and content acquired in the training.
✍️ API Requirements

Must to have

 Comunicar com uma API externa (desenvolvida pelo colaborador ou por terceiros).
 Persistir dados num BD relacional (não relacional é "nice to have").
 Apresentar alguns testes unitários e funcionais.

Nice to have

 Organização do código.
 Logging.
 Segurança (ex: JWT).
 Cache.
📝 Design Patterns
Model
Data holder, receives information from Controller, validates or not and returns the appropriate answer.

Detentor dos dados, recebe as informações do Controller, valida ou não e retorna a resposta adequada.

Controller
Provides communication between the data holder and the customer.

Fornece a comunicação entre o detentor dos dados e o cliente.

Repository
Data consultation and manipulation interface, used to create a control and security barrier between the application and the data.

Interface de consulta e manipulação dos dados, utilizado para criar uma barreira de controle e segurança entre a aplicação e os dados.

DTO
Used to transfer data between software subsystems.

Utilizado para transferir dados entre subsistemas do software.

Form
Utilizado para transferir dados entre subsistemas do software.

Utilizado para transferir dados entre subsistemas do software.

📚 Features

Publication
 CREATE
 READ
 UPDATE
 DELETE
 
Comment

 CREATE
 UPDATE
 DELETE
💻 Setup

Clone and open in Eclipse IDE
Install maven dependencies using IDE auto import or using the command mvn install
Browse http://localhost:8080
