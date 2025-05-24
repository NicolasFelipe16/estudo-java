import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===================================
                BOAS VINDAS!
                -----------------------------------""");

        System.out.print("Peso (Kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Altura (cm): ");
        double height = scanner.nextDouble();

        double imc = weight / (height/100 * height/100);

        System.out.println("-----------------------------------");
        System.out.printf("Seu IMC é %.2f e isso significa que ", imc);

        if (imc < 18.5) {
            System.out.println("você está abaixo do peso indicado.");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("você está no peso normal indicado.");
        } else if (imc > 25 && imc < 29.9) {
            System.out.println("você está acima no peso normal indicado.");
        } else if (imc > 30) {
            System.out.println("você tem obesidade.");
        }

        System.out.println("===================================");
    }
}