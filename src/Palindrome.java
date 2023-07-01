import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Sebuah String: ");
        String input = scanner.nextLine();

        if (isPalindor(input)) {
            System.out.println("Input : " + input);
            System.out.println("Output: Palindorme ");
        } else {
            System.out.println("Input : " + input);
            System.out.println("Output: Bukan Palindorme ");
        }
        scanner.close();
    }

    public static boolean isPalindor(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

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