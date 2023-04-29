import java.util.Scanner;

public class Lista2ExTres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double X1, X2, Xx1, Xx2, delta;
        double A, B, C;

        System.out.println("Informe uma equação de 2° grau:\n Ax^2 * Bx * C = 0");

        System.out.print("Insira o coeficiente A: ");
        A = scanner.nextDouble();
        System.out.print("Insira o coeficiente B: ");
        B = scanner.nextDouble();
        System.out.print("Insira o coeficiente C: ");
        C = scanner.nextDouble();

        delta = (B * B) - (4 * A * C);

        if (A == 0 && B == 0) {
            System.out.println("Coeficientes informados incorretamente!!! ");
        } else if (A == 0 && B != 0) {
            System.out.println("Essa é uma equação de primeiro grau. ");
            X1 = -C / B;

            System.out.printf("O resultado da equação é: %.2f ", X1);
        } else if (delta < 0) {
            System.out.println("Essa equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.println("Essa equação possui duas raízes reais iguais.");
            X2 = -B / 2 * A;

            System.out.printf("\nO resultado da equação é %.2f ", X2);
        } else if (delta > 0) {
            System.out.println("Essa equação possui duas raízes reais diferentes.");
            Xx1 = (-B + Math.sqrt(delta)) / 2 * A;
            Xx2 = (-B - Math.sqrt(delta)) / 2 * A;
            System.out.printf("\nO resultado da 1° raiz dessa equação é: %.2f e o resultado da 2° raiz é: %.2f", Xx1,
                    Xx2);
        } else {
            System.out.println("ERROR");
        }

        scanner.close();

    }

}