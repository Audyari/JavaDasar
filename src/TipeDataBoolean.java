public class TipeDataBoolean {
    public static void main(String[] args) {

        // ========== DEKLARASI BOOLEAN ==========
        System.out.println("=== DEKLARASI BOOLEAN ===");

        boolean isJavaFun = true;
        boolean isRaining = false;
        boolean isSunday = true;

        System.out.println("Java itu menyenangkan? " + isJavaFun);  // true
        System.out.println("Sedang hujan? " + isRaining);          // false
        System.out.println("Hari Minggu? " + isSunday);            // true


        // ========== BOOLEAN DARI OPERASI PERBANDINGAN ==========
        System.out.println("\n=== BOOLEAN DARI PERBANDINGAN ===");

        int umur = 17;
        boolean isDewasa = umur >= 18;
        boolean isAnak = umur < 18;

        System.out.println("Umur: " + umur);
        System.out.println("Apakah dewasa? " + isDewasa);  // false
        System.out.println("Apakah anak-anak? " + isAnak);  // true

        int nilai = 85;
        boolean lulus = nilai >= 75;
        boolean remedial = nilai < 75;

        System.out.println("Nilai: " + nilai);
        System.out.println("Lulus? " + lulus);      // true
        System.out.println("Remedial? " + remedial); // false


        // ========== OPERASI LOGIKA ==========
        System.out.println("\n=== OPERASI LOGIKA ===");

        boolean cuacaCerah = true;
        boolean punyaPayung = false;

        // AND (&&) → SEMUA harus true biar hasilnya true
        boolean bisaJalan = cuacaCerah && punyaPayung;
        System.out.println("Cerah && Punya payung = " + bisaJalan);  // false

        // OR (||) → SALAH SATU true, hasilnya true
        boolean bisaJalan2 = cuacaCerah || punyaPayung;
        System.out.println("Cerah || Punya payung = " + bisaJalan2);  // true

        // NOT (!) → MEMBALIK nilai
        boolean tidakCerah = !cuacaCerah;
        System.out.println("!Cerah = " + tidakCerah);  // false


        // ========== BOOLEAN DI IF STATEMENT ==========
        System.out.println("\n=== BOOLEAN DI IF ===");

        int nilaiUjian = 80;

        if (nilaiUjian >= 75) {
            System.out.println("Selamat! Anda LULUS! 🎉");
        } else {
            System.out.println("Maaf, REMEDIAL ya... 😢");
        }

        // Bisa juga langsung pake variabel boolean
        boolean isLulus = nilaiUjian >= 75;
        if (isLulus) {
            System.out.println("(Dari variabel boolean) LULUS!");
        }
    }
}