import java.util.ArrayList;

public class versao_02 {
    public static void main(String[] args) {
        System.out.println("""
                ===================================
                BOAS VINDAS!
                ===================================
                
                ===================================""");

        ArrayList<String> emails = new ArrayList<>();

        emails.add("nicolas@empresa.com"); // @empresa.com
        emails.add("vinicius@empresa.com"); // @empresa.com
        emails.add("alura@alura.com");
        emails.add("java@empresa.com     "); // @empresa.com
        emails.add("email@empresa");
        emails.add("exemplo@empresa.com");
        emails.add("email@dominio.com");
        emails.add("empresa@empresa.com"); // @empresa.com
        emails.add("endereco@dominio.com");
        emails.add("teste@teste.com      ");

        System.out.println("""
                E-MAILS TERMINADOS EM '@empresa.com':
                -----------------------------------""");

        for (String email: emails) {
            email = email.replaceAll(" ", "");

            if (email.endsWith("@empresa.com")){
                System.out.println(email);
            }
        }
        System.out.println("===================================");
    }
}