import java.util.Scanner;

public class Lista2ExCinco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1, n2;
        String operacao;

        System.out.printf("Informe o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.printf("Informe o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.println(
                "Digite a operação que desja realizar de acordo com a tabela a baixo:\n + | Soma\n - | Subtração\n * | Multiplicação\n / | Divisão\n ^ | Potenciação\n");

        operacao = scanner.next();

        if (operacao.equals("+")) {
            System.out.printf(n1 + " + " + n2 + " = " + (n1 + n2));
        } else if (operacao.equals("-")) {
            System.out.printf(n1 + " - " + n2 + " = " + (n1 - n2));
        } else if (operacao.equals("*")) {
            System.out.printf(n1 + " * " + n2 + " = " + (n1 * n2));
        } else if (operacao.equals("/")) {
            System.out.printf(n1 + " / " + n2 + " = " + (n1 / n2));
        } else if (operacao.equals("^")) {
            System.out.printf(n1 + " ^ " + n2 + " = " + Math.pow(n1, n2));
        } else {
            System.out.println("Operação inválida, digite novamente.");
        }

        scanner.close();

    }

}