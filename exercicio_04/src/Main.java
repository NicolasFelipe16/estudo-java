import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasEightCharacters;
        boolean hasUpperCase;
        boolean hasANumber;

        System.out.println("""
                ===================================
                BOAS VINDAS!
                ===================================""");

        while (true) {
            hasEightCharacters = false;
            hasUpperCase = false;
            hasANumber = false;


            System.out.println("\n===================================");
            System.out.print("Digite a senha: ");
            String password = scanner.nextLine();

            if (password.length() >= 8) {
                hasEightCharacters = true;
            }

            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);

                if (Character.isUpperCase(character)) {
                    hasUpperCase = true;
                }

                if (Character.isDigit(character)) {
                    hasANumber = true;
                }
            }

            System.out.println("-----------------------------------");

            if (!hasEightCharacters) {
                System.out.println("A senha deve conter 8 caracteres.");
            }

            if (!hasUpperCase) {
                System.out.println("A senha deve conter uma letra maiúscula.");
            }
            if (!hasANumber) {
                System.out.println("A senha deve conter um número.");
            }

            if (hasEightCharacters && hasUpperCase && hasANumber) {
                break;
            }

            System.out.println("===================================");
        }

        System.out.println("SENHA VÁLIDA!");
        System.out.println("===================================");

    }
}