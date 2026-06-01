

public class KonversiTipeDataNumber {



    public static void main(String[] args) {

        // ========== WIDENING (Otomatis, AMAN) ==========
        System.out.println("=== WIDENING CASTING (Otomatis) ===");

        byte umur = 25;
        int umurInt = umur;                    // byte → int (otomatis)
        long umurLong = umurInt;                  // byte → long (otomatis)
        double umurDouble = umurLong;              // byte → double (otomatis)

        System.out.println("byte 25 → int: " + umurInt);        // 25
        System.out.println("byte 25 → double: " + umurDouble);  // 25.0


        // ========== NARROWING (Manual, HARUS CASTING) ==========
        System.out.println("\n=== NARROWING CASTING (Manual) ===");

        long populasiDunia = 8_000_000_000L;
        int populasiInt = (int) populasiDunia;   // WAJIB (int)

        System.out.println("long 8.000.000.000 → int: " + populasiInt);
        // Hasil: -1.794.967.296 (OVERFLOW! karena terlalu besar)

        int angka = 100;
        byte angkaByte = (byte) angka;           // WAJIB (byte), meski nilainya muat
        System.out.println("int 100 → byte: " + angkaByte);     // 100 (aman karena muat)

        int angkaBesar = 200;
        byte angkaBesarByte = (byte) angkaBesar;
        System.out.println("int 200 → byte: " + angkaBesarByte);
        // Hasil: -56 (OVERFLOW! karena 200 > 127)


        // ========== LOSS OF PRECISION ==========
        System.out.println("\n=== LOSS OF PRECISION ===");

        double phi = 3.141592653589793;
        int phiInt = (int) phi;                  // desimal ILANG!
        float phiFloat = (float) phi;            // presisi berkurang

        System.out.println("double " + phi);
        System.out.println("→ int: " + phiInt);      // 3 (ilang desimal)
        System.out.println("→ float: " + phiFloat);  // 3.1415927 (presisi berkurang)


        // ========== TAMBAHAN: char ke int ==========
        System.out.println("\n=== EKSTRA: char → int ===");

        char huruf = 'A';
        int kodeAscii = huruf;                   // char → int (otomatis!)
        System.out.println("char 'A' → int: " + kodeAscii);  // 65 (kode ASCII)

        String namaSaya = getNama();
        System.out.println(namaSaya);

    }

    public static String getNama() {
        return "Budi";
    }


}