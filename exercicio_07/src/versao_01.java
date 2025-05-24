import java.util.Scanner;

public class versao_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===================================
                BOAS VINDAS!
                ===================================""");

        System.out.print("Deseja digitar quantos valores?\nR: ");
        int amount = scanner.nextInt();

        System.out.println("""
                -----------------------------------
                ** Os valores podem ser positivos e/ou negativos.
                -----------------------------------""");

        int sum = 0;

        for (int i = 1; i <= amount; i++) {
            System.out.printf("%dº valor: ", i);
            int value = scanner.nextInt();
            if (value > 0) {
                sum += value;
            }
        }

        System.out.printf("""
                -----------------------------------
                SOMA DOS VALORES POSITIVOS: %d 
                ===================================""", sum);
    }
}