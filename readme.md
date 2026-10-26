Felippe Gabriel Araujo Alves 3° A ti
Miguel Augusto Pereira 3° A ti

 PROMPTS: Grupo ____

**Integrantes:**


**Prova:** POO

**Usamos IA?** (x) Sim  ( ) Não

**Qual ferramenta e modelo (se usaram):**

> Usamos a ferramenta do Claud Ia, Sonnet 5.5

## Registro, na ordem

### Prompt 1

**O prompt (cópia exata):**

> Faça um programa em Java para a locadora Estrada Livre, seguindo as regras do enunciado. Organize o projeto nos pacotes model e app, com as classes separadas em arquivos .java.
> Crie uma classe abstrata Veiculo com placa, modelo e valor da diária. Os atributos devem ser privados, e a classe deve ter um método abstrato para calcular o aluguel e um método para imprimir o resumo com placa e modelo.
> Crie a classe Carro, que herda de Veiculo e calcula o aluguel com 10% de seguro sobre o valor total das diárias.
> Crie a classe Moto, que herda de Veiculo e aplica 15% de desconto quando o aluguel for de cinco dias ou mais.
> Crie uma interface Recarregavel com o método para calcular o custo de recarga. A classe CarroEletrico deve herdar de Carro e implementar essa interface. O aluguel do carro elétrico deve incluir o cálculo normal do carro mais R$ 15,00 por dia de taxa de bateria. A recarga deve custar R$ 0,80 por kWh consumido por dia.
> Na classe de teste, demonstre que não é possível criar um Veiculo diretamente, deixando a linha comentada e explicando o motivo. Coloque um carro, uma moto e um carro elétrico na mesma lista e use um único laço para imprimir o resumo e o valor do aluguel, sem usar instanceof ou cast. Depois, percorra somente os veículos que implementam Recarregavel para mostrar o custo da recarga.
> Use os seguintes valores para conferir os resultados: carro com diária de R$ 150,00 por 3 dias, aluguel de 495.0; moto com diária de R$ 80,00 por 4 dias, aluguel de 320.0; moto com diária de R$ 80,00 por 5 dias, aluguel de 340.0; carro elétrico com diária de R$ 200,00, consumo de 10 kWh por dia e aluguel por 3 dias, aluguel de 705.0 e recarga de 24.0.
> Separe o código por arquivo, informe o nome de cada arquivo e explique brevemente como compilar e executar o programa. Confira os cálculos e garanta que o código esteja de acordo com todos os requisitos do enunciado.

**O que a IA devolveu (uma ou duas linhas):**
Explicou que provavelmente o JDK não estava instalado ou não estava no PATH e pediu para testar `java -version` e `javac -version`.

**O que fizemos com a resposta:** ( ) usamos como veio  (x) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):** 
Rodamos `java -version` para descobrir se o problema era o Java.

## Respostas finais, sem consultar a IA

Respondam com as suas palavras, nos últimos 5 minutos. Não copiem de lugar nenhum.

**Pergunta 1:**
1. O que significa dizer que uma classe é abstrata? Por que um veículo genérico não consegue fazer tudo que um carro ou uma moto faz?

**Pergunta 2:**
2. Se o código usa só o tipo Veiculo, como o Java sabe qual versão do método calcularAluguel deve executar para cada objeto? Como se chama esse conceito?

**Pergunta 3:**
3. Por que o método calcularRecarga não deveria ficar na classe Veiculo? O que daria errado se carros e motos também tivessem esse método, mesmo sem precisarem dele?




https://claude.ai/share/caba9c78-ab5a-4a98-81d0-9a84838cacb9