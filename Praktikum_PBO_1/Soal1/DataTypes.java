import java.util.*;
import java.math.BigInteger;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah test case: ");
        int T = sc.nextInt(); // Jumlah angka yang akan di uji
        System.out.println("Masukkan " + T + " angka untuk diuji:");
        
        // Batas tiap tipe data primitif
        BigInteger BYTE_MIN = BigInteger.valueOf(Byte.MIN_VALUE);        
        BigInteger BYTE_MAX = BigInteger.valueOf(Byte.MAX_VALUE);        
        BigInteger SHORT_MIN = BigInteger.valueOf(Short.MIN_VALUE);
        BigInteger SHORT_MAX = BigInteger.valueOf(Short.MAX_VALUE);  
        BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);     
        BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);     
        BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);       
        BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
        
        for (int i = 0; i < T; i++) {
            try {
                BigInteger n = sc.nextBigInteger();
                System.out.println("Input diterima: " + n);
                
                boolean canFit = false;
                System.out.println(n + " can be fitted in:");
                
                if (n.compareTo(BYTE_MIN) >= 0 && n.compareTo(BYTE_MAX) <= 0) {
                    System.out.println("* byte");
                    canFit = true;
                }
                if (n.compareTo(SHORT_MIN) >= 0 && n.compareTo(SHORT_MAX) <= 0) {
                    System.out.println("* short");
                    canFit = true;
                }
                if (n.compareTo(INT_MIN) >= 0 && n.compareTo(INT_MAX) <= 0) {
                    System.out.println("* int");
                    canFit = true;
                }
                if (n.compareTo(LONG_MIN) >= 0 && n.compareTo(LONG_MAX) <= 0) {
                    System.out.println("* long");
                    canFit = true;
                }
                
                if (!canFit) {
                    System.out.println(n + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
        
        sc.close();
    }
}

