import java.util.Scanner;
public class Exponentation {
    public static void main(String[] args) {
        Scanner angka = new Scanner (System.in);
        System.out.print("Input x : ");
        int x = angka.nextInt();
        System.out.print("Input n : ");
        int y = angka.nextInt();

        int hasil = x;
        for (int i = 1; i < y; i++) {
            hasil *= x;
        }
        System.out.println("Output : " + hasil);
    }
}
