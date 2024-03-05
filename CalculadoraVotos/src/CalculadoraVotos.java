public class CalculadoraVotos {

    private int totalEleitores;
    private int votosValidos;
    private int votosBrancos;
    private int votosNulos;

    public CalculadoraVotos(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    public double calcularPercentualVotosValidos() {
        return ((double) votosValidos / totalEleitores) * 100;
    }

    public double calcularPercentualVotosBrancos() {
        return ((double) votosBrancos / totalEleitores) * 100;
    }

    public double calcularPercentualVotosNulos() {
        return ((double) votosNulos / totalEleitores) * 100;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        CalculadoraVotos calculadora = new CalculadoraVotos(1000, 800, 150, 50);

        System.out.println("Percentual de votos válidos: " + calculadora.calcularPercentualVotosValidos() + "%");
        System.out.println("Percentual de votos brancos: " + calculadora.calcularPercentualVotosBrancos() + "%");
        System.out.println("Percentual de votos nulos: " + calculadora.calcularPercentualVotosNulos() + "%");
    }
}
