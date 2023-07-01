import java.util.Scanner;
public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        int number = scanner.nextInt();
        System.out.println("Ouput : " + number);
        for (int i = 1; i <=number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
