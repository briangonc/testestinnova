# Calculadora de Votos

Projeto simples em Java para calcular percentuais de votos em relação ao total de eleitores.

## Configuração do Projeto

Certifique-se de ter o Java instalado em sua máquina.

1. Clone o repositório: `git clone https://github.com/briangonc/tinnova.git`
2. Acesse o diretório do projeto: `cd CalculadoraVotos`
3. Compile o código: `javac CalculadoraVotos.java`
4. Execute o exemplo: `java CalculadoraVotos`

## Uso da Classe

A classe `CalculadoraVotos` possui métodos para calcular os seguintes percentuais:
- Percentual de votos válidos em relação ao total de eleitores
- Percentual de votos em branco em relação ao total de eleitores
- Percentual de votos nulos em relação ao total de eleitores

Exemplo de Uso:

```java
CalculadoraVotos calculadora = new CalculadoraVotos(1000, 800, 150, 50);

System.out.println("Percentual de Votos Válidos: " + calculadora.calcularPercentualVotosValidos() + "%");
System.out.println("Percentual de Votos em Branco: " + calculadora.calcularPercentualVotosBrancos() + "%");
System.out.println("Percentual de Votos Nulos: " + calculadora.calcularPercentualVotosNulos() + "%");
