# **AppCalculateAverage**
Aplicação em Java para cadastro de veículos e cálculo da média de combustível informada. Mostrará também, o custo por KM/Rodado e custo total com combustível.

Será aplicado nesta projeto: encapsulamento, herança, , construtores, polimorfismo, interface, classes, métodos, listas, pilha e escolha de nomes (classes, variáveis métodos e objetos).
Procurei fazer tudo em inglês para praticar escrita e leitura. A tradução foi realizada com o Google Tradutor em sua maioria pois meu conhecimento ainda é básico no idioma. É necessário alguns ajustes, pois algumas frases ficaram com um entendimento diferente.

Será atualizado com frequência, buscando praticar os novos conceitos aprendidos durante o curso do Senac e fora dele.
Vou refatorar o código, sempre que possível, procurando otimizar ao máximo seu desempenho e legibilidade.

--------------------
##### JÁ FOI IMPLEMENTADO:
- Classes
- Herança
- Polimorfismo
- Encapsulamento
- Interface
- Métodos
- Listas
- Pilha
-------------------
### O QUE FALTA DESENVOLVER:
> Criar a validação de usuário e senha, antes de acessar a aplicação.

> Formatar a exibição dos dados na impressão.

-------------------
### **DESCRIÇÃO DAS CLASSES:**

##### > AppCalculateAverage
        Classe principal, onde consta o menu principal e submenus.
##### > Vehicles
        Classe modelo para a criação dos veículos (será adicionada a possibilidade de cadastro de novos veículos (motos, caminhões), 
        hoje é possível apenas cadastro genérico. Dentro dela, está a lista que armazena os veículos cadastrados, construtores e um 
        método padrão para impressão em tela.
##### > Users
        Classe para o cadastro de usuários. Nela contém construtores e métodos padrão. Uma lista para o armazenamento dos usuários 
        cadastrados. 
##### > FuelSupply
        Classe responsável pelo cadastro e armazenamento dos abastecimentos. Tem uma lista para o armazenamento dos abastecimentos
        e uma pilha para guardar o último km informado no abastecimento. É feito a chamada do método que calcula a média, que está
        na classe Average.
##### > Average
        Classe que recebe o modelo de cálculo da classe interface CalculateAverage e faz o cálculo da média, atráves dos valores 
        recebidos por parâmetro da classe FuelSupply e retorna a média.
##### > Cars
        Classe responsável pelo cadastro de veículos, métodos e construtores. Possui vinculo por herança com a classe Vehicles.
##### > CalculateAverage
        Interface com o método para cálculo da média.
##### > PrintUserData
        Interface com o padrão de impressão de dados.
##### > RegisterVehicles
        Interface com o padrão para cadastro de veículos.
        
