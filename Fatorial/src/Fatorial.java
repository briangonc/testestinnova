import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    public static BigInteger calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(calcularFatorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        scanner.close();

        System.out.println("Fatorial de " + numero + ": " + calcularFatorial(numero));
    }
}
