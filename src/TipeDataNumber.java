public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer types
        byte umur = 25;               // -128 s/d 127
        short jarak = 30000;          // -32.768 s/d 32.767
        int populasi = 1000000;       // paling umum dipakai
        long populasiDunia = 8_000_000_000L;  // wajib kasih L di akhir

        // Floating point types
        float tinggi = 175.5f;        // wajib kasih f di akhir
        double phi = 3.14159265359;   // default untuk desimal

        // Casting (konversi tipe)
        int angka = 100;
        byte angkaByte = (byte) angka;  // eksplisit casting

        double nilaiDouble = 123.456;
        int nilaiInt = (int) nilaiDouble; // hasilnya 123 (desimal hilang)

        System.out.println("Umur: " + umur);
        System.out.println("Jarak: " + jarak);
        System.out.println("Populasi: " + populasi);
        System.out.println("Tinggi: " + populasiDunia);


        System.out.println("Tinggi: " + tinggi);
        System.out.println("Nilai Double: " + phi);

        System.out.println("Nilai Int: " + angkaByte);
        System.out.println("Nilai int dari double: " + nilaiInt);

    }
}
