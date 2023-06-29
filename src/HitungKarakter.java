import java.util.Scanner;

public class HitungKarakter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Karakter X dan O :" );
        String input = scanner.nextLine();
        boolean hasil = hitungXO(input);
        System.out.println(hasil);
    }

    public static boolean hitungXO(String input){
        int hitungX = 0;
        int hitungO = 0;
        for(int i = 0; i < input.length(); i++){
            char huruf = Character.toLowerCase(input.charAt(i));
            if(huruf == 'x'){
                hitungX++;
            }else if(huruf == 'o') {
                hitungO++;
            }
        }
        return hitungX == hitungO;
    }
}
