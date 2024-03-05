public class BubbleSort {

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparamos elementos adjacentes
                if (vetor[j] > vetor[j + 1]) {
                    // Trocamos os elementos se estiverem fora de ordem
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};

        System.out.println("Vetor não ordenado:");
        imprimirVetor(vetor);

        // Chama o algoritmo de ordenação
        bubbleSort(vetor);

        System.out.println("\nVetor ordenado:");
        imprimirVetor(vetor);
    }

    // Método auxiliar para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
