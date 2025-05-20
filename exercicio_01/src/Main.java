import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===================================
                BOAS VINDAS!
                -----------------------------------""");

        System.out.print("Digite o primeiro valor: ");
        int first_value = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int second_value = scanner.nextInt();

        int sum = first_value + second_value;
        int sub = first_value - second_value;
        int mul = first_value * second_value;
        double div = (double) first_value / second_value;

        System.out.println("""
                ===================================\n
                ===================================
                RESULTADOS:
                -----------------------------------""");

        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mul);

        if (second_value != 0) {
            System.out.println("Divisão: " + String.format("%.2f", div));
        } else {
            System.out.println("Divisão: Impossível dividir por zero");
        }

        System.out.println("===================================");
    }
}