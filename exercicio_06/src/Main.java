import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===================================
                BOAS VINDAS!
                ===================================""");

        System.out.print("Deseja obter a tabuada de qual valor?\nR: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, i * number);
        }

    }
}