import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===================================
                BOAS VINDAS!
                ===================================
                
                ===================================""");

        System.out.print("Digite uma frase: ");
        String phrase = scanner.nextLine();

        String[] words = phrase.split("\\s+");

        int words_amount = 0;

        for (int i = 0; i < words.length; i++) {
            words_amount++;
        }

        System.out.printf("""
                -----------------------------------
                A frase possui %d palavras
                ===================================
                """, words_amount);

    }
}