import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("5. Resto");
            System.out.println("6. Raiz");
            System.out.println("7. Potência");
            System.out.println("0. Sair");
            
            escolha = scanner.nextInt();

            double n1, n2, resultado;

            switch (escolha) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                case 1: 
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    resultado = n1 + n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2: 
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n1 = scanner.nextDouble();
                    resultado = n1 - n1;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3: 
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    if (n2 != 0) {
                        resultado = n1 / n2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Não permitido divisão por ZERO");
                    }
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    resultado = n1 * n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 5:
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    resultado = n1 % n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 6: 
                    System.out.print("Digite o número: ");
                    n1 = scanner.nextDouble();
                    if (n1 >= 0) {
                        resultado = Math.sqrt(n1);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Raiz quadrada de número negativo não é permitida.");
                    }
                    break;
                case 7: 
                    System.out.print("Digite o primeiro número: ");
                    n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = scanner.nextDouble();
                    resultado = Math.pow(n1, n2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    if (escolha != 0) {
                        System.out.println("Opção inválida.");
                    }
                    break;
            }

            if (escolha != 0) {
                System.out.println("----------------------------");
            }

        } while (escolha != 0); 
    }
}
