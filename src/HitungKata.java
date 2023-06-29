import java.util.Scanner;
public  class HitungKata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat: ");
        String input =scanner.nextLine();

        int hurufVokal = 0;
        int hurufKonsonan = 0;
        int totalKarakter = 0;

        input = input.toLowerCase();

        for (int i = 0; i <input.length(); i++) {
            char huruf = input.charAt(i);
            if (huruf >= 'a' && huruf <= 'z') {
                totalKarakter++;
                if (huruf == 'a' || huruf =='e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
                    hurufVokal++;
                }else {
                    hurufKonsonan++;
                }
            }
        }
        System.out.println("Jumlah Huruf Vokal: " + hurufVokal);
        System.out.println("Jumlah Huruf Konsonan: " + hurufKonsonan);
        System.out.println("Total Jumlah Huruf: " + totalKarakter);

        scanner.close();
    }
}