import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dua string
        System.out.println("Masukkan string A : ");
        String A = sc.nextLine();
        System.out.println("Masukkan string A : ");
        String B = sc.nextLine();

        // 1. Jumlah panjang kedua string
        int totalLength = A.length() + B.length();
        System.out.println("Panjang total : " + totalLength);

        // 2. Apakah A lebih besar secara leksikografis dibanding B?
        if (A.compareTo(B) > 0) {
            System.out.println("Apakah A lebih besar secara leksikografis dibanding B? Yes");
        } else {
            System.out.println("Apakah A lebih besar secara leksikografis dibanding B? No");
        }

        // 3. Kapitalisasi huruf pertama A dan B, lalu cetak
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println("Kapitalisasi huruf pertama : " + capA + " " + capB);

        sc.close();
    }
}
