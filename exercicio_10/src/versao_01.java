import java.util.ArrayList;
import java.util.Scanner;

public class versao_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===================================
                BOAS VINDAS!
                ===================================
                
                ===================================""");

        ArrayList<String> emails = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dº e-mail: ", i);
            String email = scanner.nextLine();
            emails.add(email);
        }

        System.out.println("""
                E-MAILS TERMINADOS EM '@empresa.com':
                -----------------------------------""");

        for (String email: emails) {
            email = email.replaceAll(" ", "");

            if (email.endsWith("@empresa.com")) {
                System.out.println(email);
            }
        }
        System.out.println("===================================");
    }
}