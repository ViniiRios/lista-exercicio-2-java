import java.util.Scanner;
import java.util.Random;

public class Lista2ExSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n1, n2, menor, maior, sorteio;

        System.out.print("Informe o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = scanner.nextInt();

        if (n1 < n2) {
            menor = n1;
            maior = n2;
        } else {
            menor = n2;
            maior = n1;
        }

        sorteio = random.nextInt(maior - menor + 1) + menor;

        if (sorteio % 2 == 0) {
            System.out.println("O número sorteado é: " + sorteio + ", e ele é par.");
        } else {
            System.out.println("O número sorteado é: " + sorteio + ", e ele é ímpar.");
        }

        scanner.close();
    }
}