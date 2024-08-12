import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        double[] notas = new double[qtdNotas];

        double a = 0;
        double b = 0;

        for (int i = 0; i < qtdNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            a += notas[i]; 

            if (notas[i] > b) { 
                b = notas[i];
            }
        }

        double media = a / qtdNotas;

        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + b);
    }
}
