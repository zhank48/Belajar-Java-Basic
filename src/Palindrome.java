import java.util.Scanner;
public class palindorome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Sebuah String: ");
        String input = scanner.nextLine();

        if (isPalindor( input)) {
            System.out.println("String Tersebut Adalah Palindorme ");
        }else {
            System.out.println("String Tersebut Bukan Palindorme ");
        }
        scanner.close();
    }

    public static boolean isPalindor(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1 ;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}