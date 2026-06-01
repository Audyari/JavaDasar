public class TipeDataChar {
    public static void main(String[] args) {

        // ========== CARA PAKAI CHAR ==========
        System.out.println("=== DASAR CHAR ===");

        char hurufA = 'A';        // ✅ single quotes!
        char hurufKecil = 'b';
        char angkaSebagaiChar = '5';  // ini char '5', BUKAN angka 5!
        char spasi = ' ';         // spasi juga bisa
        char asterisk = '*';       // simbol juga bisa

        System.out.println("hurufA: " + hurufA);              // A
        System.out.println("hurufKecil: " + hurufKecil);      // b
        System.out.println("angkaSebagaiChar: " + angkaSebagaiChar);  // 5
        System.out.println("asterisk: " + asterisk);          // *


        // ========== PERBEDAAN char vs String ==========
        System.out.println("\n=== char vs String ===");

        char satuHuruf = 'X';           // ✅ boleh
        // char salah = "X";            // ❌ ERROR! double quotes buat String

        String banyakHuruf = "XYZ";     // ✅ boleh
        // String salah = 'X';          // ❌ ERROR! single quotes buat char

        System.out.println("char: " + satuHuruf);     // X
        System.out.println("String: " + banyakHuruf); // XYZ


        // ========== CHAR KE INT (DAPET KODE ASCII) ==========
        System.out.println("\n=== char → int (Kode ASCII/Unicode) ===");

        char huruf = 'A';
        int kodeAscii = huruf;  // widening casting (otomatis!)

        System.out.println("char 'A' = " + huruf);
        System.out.println("kode ASCII-nya = " + kodeAscii);  // 65

        char hurufLain = 'a';
        System.out.println("char 'a' = " + hurufLain);        // a
        System.out.println("kode ASCII-nya = " + (int) hurufLain);  // 97

        char angkaChar = '9';
        System.out.println("char '9' = " + angkaChar);        // 9
        System.out.println("kode ASCII-nya = " + (int) angkaChar);  // 57 (BUKAN 9!)


        // ========== INT KE CHAR (KEBALIKAN) ==========
        System.out.println("\n=== int → char (Narrowing, WAJIB casting!) ===");

        int kode = 66;
        char hasilChar = (char) kode;  // WAJIB casting!

        System.out.println("int 66 → char: " + hasilChar);  // B

        // Looping dari A sampai Z
        System.out.print("Huruf A-Z: ");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();  // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    }
}