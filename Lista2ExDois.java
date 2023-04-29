import java.util.Scanner;

public class Lista2ExDois {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int troco, compra, valorPago;

        System.out.printf("Digite o valor da compra: ");
        compra = scanner.nextInt();
        System.out.printf("Digite o valor pago: ");
        valorPago = scanner.nextInt();

        troco = valorPago - compra;

        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;

        while (troco >= 50) {
            troco -= 50;
            nota50++;
        }
        System.out.printf("\nNotas de R$ 50,00: %d", nota50);
        while (troco >= 20) {
            troco -= 20;
            nota20++;
        }
        System.out.printf("\nNotas de R$ 20,00: %d", nota20);
        while (troco >= 10) {
            troco -= 10;
            nota10++;
        }
        System.out.printf("\nNotas de R$ 10,00: %d", nota10);
        while (troco >= 5) {
            troco -= 5;
            nota5++;
        }
        System.out.printf("\nNotas de R$ 5,00: %d", nota5);
        while (troco >= 2) {
            troco -= 2;
            nota2++;
        }
        System.out.printf("\nNotas de R$ 2,00: %d", nota2);
        while (troco >= 1) {
            troco -= 1;
            nota1++;
        }
        System.out.printf("\nNotas de R$ 1,00: %d", nota1);
        while (valorPago < compra) {
            System.out.println("\nValor insuficiente para realizar a compra.");
            break;
        }

        scanner.close();

    }

}