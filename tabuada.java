import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual tabuada você quer ? ");
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = x * i;
            System.out.println(x + " x " + i + " = " + resultado);
        }
    }
}
