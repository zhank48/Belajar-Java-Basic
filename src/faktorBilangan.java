import java.util.Scanner;
public class faktorBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int angka;
        System.out.println("Masukkan Angka : ");
        angka = scanner.nextInt();
        int deret = 0;
        for (int i = 1; i <= angka ; i++) {
            deret++;
            if (angka % deret == 0) {
                System.out.println(deret + " ");
            }
        }
        //Sumber https://gist.github.com/dhanyn10/bd46277ede4f4487327f80fc00e673b7
    }
}
