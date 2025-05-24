import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===================================
                BOAS VINDAS!
                ===================================
                
                ===================================""");

        ArrayList<Double> above_average = new ArrayList<>();

        double grade = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%dº nota: ", i);
            grade = scanner.nextDouble();

            if (grade > 6) {
                above_average.add(grade);
            }
        }

        System.out.println("""
                -----------------------------------
                NOTAS MAIORES DO QUE 6: """ + above_average);
        System.out.println("===================================");
    }
}