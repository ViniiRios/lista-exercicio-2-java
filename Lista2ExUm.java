import java.util.Scanner;

public class Lista2ExUm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3;
        double media;

        System.out.printf("Insira o 1° número: ");
        n1 = scanner.nextInt();
        System.out.printf("Insira o 2° número: ");
        n2 = scanner.nextInt();
        System.out.printf("Insira o 3° número: ");
        n3 = scanner.nextInt();

        if ((n1 > n2) && (n1 > n3)) {
            System.out.printf("O número " + n1 + " é maior");
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.printf("O número " + n2 + " é maior");
        } else {
            System.out.printf("O número " + n3 + " é maior");
        }
        if ((n1 < n2) && (n1 < n3)) {
            System.out.printf("\nO número " + n1 + " é menor");
        } else if ((n2 < n1) && (n2 < n3)) {
            System.out.printf("\nO número " + n2 + " é menor");
        } else {
            System.out.printf("\nO número " + n3 + " é menor");
        }

        media = ((n1 + n2 + n3) / 3);
        System.out.printf("\nA média aritimética desses valores é: %.2f", media);

        scanner.close();

    }

}