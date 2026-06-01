import java.util.*;

public class DemoVar {
    public static void main(String[] args) {
        
        // ========== CONTOH 1: TIPE DASAR ==========
        System.out.println("=== TIPE DASAR ===");
        var nama = "Budi Santoso";        // String
        var umur = 25;                    // int
        var tinggi = 175.5;               // double
        var aktif = true;                 // boolean

        System.out.println("Nama: " + nama + " (String)");
        System.out.println("Umur: " + umur + " (int)");
        System.out.println("Tinggi: " + tinggi + " (double)");
        System.out.println("Aktif: " + aktif + " (boolean)");

        // ========== CONTOH 2: COLLECTION ==========
        System.out.println("\n=== COLLECTION ===");
        var list = new ArrayList<String>();     // ArrayList<String>
        list.add("Java");
        list.add("Python");

        var map = new HashMap<String, Integer>(); // HashMap<String, Integer>
        map.put("Budi", 90);
        map.put("Andi", 85);

        System.out.println("List: " + list);
        System.out.println("Map: " + map);

        // ========== CONTOH 3: FOR LOOP ==========
        System.out.println("\n=== FOR LOOP ===");
        var angka = List.of(1, 2, 3, 4, 5);
        for (var item : angka) {
            System.out.print(item + " ");
        }
        System.out.println();

        // ========== CONTOH 4: YANG ERROR ==========
        System.out.println("\n=== YANG ERROR (DI-COMMENT) ===");

        // var x;  // ❌ ERROR: harus inisialisasi
        // var y = null;  // ❌ ERROR: null gak jelas tipenya
        // var z = () -> {};  // ❌ ERROR: lambda butuh target type

        // var test = new ArrayList<>();  // ⚠️ HATI-HATI! tipenya ArrayList<Object>

        // ========== CONTOH 5: final var ==========
        System.out.println("\n=== final var ===");
        final var APP_NAME = "Belajar Java";
        // APP_NAME = "Ganti";  // ❌ ERROR: final variable gak bisa diubah
        System.out.println("App: " + APP_NAME);

        // ========== CONTOH 6: Java 11+ Lambda pake var ==========
        System.out.println("\n=== Lambda dengan var (Java 11+) ===");
        var names = List.of("Alice", "Bob", "Charlie");
        names.forEach((var name) -> System.out.println("Halo, " + name));


    }
}