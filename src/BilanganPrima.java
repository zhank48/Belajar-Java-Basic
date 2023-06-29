import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputBilangan, cek=0;
        System.out.println("Masukkan Angka : ");
        inputBilangan = scanner.nextInt();
        for (int i=2; i<inputBilangan; i++) {
            if (inputBilangan%i == 0) {
                cek++;
            }
        }
        if (cek == 0) {
            System.out.println("Input : " + inputBilangan);
            System.out.println("Output : Bilangan Prima");
        }else {
            System.out.println("Input : " + inputBilangan);
            System.out.println("Output : Bukan Bilangan Prima");
        }
    }
}
