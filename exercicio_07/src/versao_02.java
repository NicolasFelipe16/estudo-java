import java.util.Scanner;

public class versao_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===================================
                BOAS VINDAS!
                -----------------------------------
                - Digite quantos valores desejar
                - Para parar, digite -1
                - Os valores podem ser positivos e/ou negativos.
                ===================================
                
                ===================================""");

        boolean stop = false;
        int sum = 0;
        int c = 1;

        while (!stop) {
            System.out.printf("%dº valor: ", c);
            c++;

            int value = scanner.nextInt();
            if (value > 0) {
                sum += value;
            }

            if (value == -1) {
                break;
            }

        }
        System.out.printf("""
                -----------------------------------
                SOMA DOS VALORES POSITIVOS: %d 
                ===================================""", sum);
    }
}