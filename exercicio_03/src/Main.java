import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();

        System.out.println("""
                ===================================
                BOAS VINDAS!
                -----------------------------------""");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            int value = scanner.nextInt();
            values.add(value);
        }

        System.out.print("""
                ===================================\n
                ===================================
                """);

        Collections.sort(values);
        System.out.println("VALORES: " + values + "\n-----------------------------------");

        int highest_value = values.getLast();
        System.out.println("MAIOR VALOR: " + highest_value + "\n-----------------------------------");

        int sum = 0;
        for (int value: values) {sum += value;}
        double average = (double) sum / values.size();
        System.out.println("MÉDIA: " + average + "\n===================================");
    }
}