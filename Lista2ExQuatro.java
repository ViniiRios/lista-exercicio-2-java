import java.util.Scanner;

public class Lista2ExQuatro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operacao;
        double perimetro, area, volume, raio;
        double pi = 3.14159;

        System.out.printf(
                "1- Calcular e imprimir o perímetro do círculo. \n2- Calcular e imprimir a área do círculo. \n3- Calcular e imprimir o volume da esfera.\nEscolha a operação de acordo com as opções acima: ");
        operacao = scanner.nextInt();
        System.out.printf("Digite o raio de um círculo ou esfera: ");
        raio = scanner.nextDouble();

        if (operacao == 1) {
            perimetro = 2 * pi * raio;
            System.out.printf("O perímetro do círculo é %.2f", perimetro);
        } else if (operacao == 2) {
            area = pi * Math.pow(raio, 2);
            System.out.printf("A area do círculo é %.2f", area);
        } else if (operacao == 3) {
            volume = 4 / 3 * pi * Math.pow(raio, 3);
            System.out.printf("O volume da esfera é %.2f", volume);
        } else {
            System.out.println("Digito inválido, por favor informe um dos números correspondentes.");

        }

        scanner.close();

    }

}