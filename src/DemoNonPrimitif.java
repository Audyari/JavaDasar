import java.util.ArrayList;

public class DemoNonPrimitif {
    public static void main(String[] args) {

        // ========== 1. STRING ==========
        System.out.println("=== STRING ===");
        String nama = "Audyari";
        System.out.println("Nama: " + nama);
        System.out.println("Panjang: " + nama.length());
        System.out.println("Huruf ke-0: " + nama.charAt(0));

        // ========== 2. ARRAY ==========
        System.out.println("\n=== ARRAY ===");
        int[] umurArray = {17, 18, 19, 20};
        String[] namaArray = {"Budi", "Andi", "Cici"};

        System.out.println("Umur index 2: " + umurArray[2]);
        System.out.println("Nama index 1: " + namaArray[1]);

        // ========== 3. CLASS BUATAN SENDIRI ==========
        System.out.println("\n=== CLASS CUSTOM ===");
        Mahasiswa mhs1 = new Mahasiswa("Budi", 25);
        Mahasiswa mhs2 = new Mahasiswa("Andi", 30);

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();

        // ========== 4. ENUM ==========
        System.out.println("\n=== ENUM ===");
        Hari hariIni = Hari.SELASA;
        System.out.println("Hari ini: " + hariIni);
        System.out.println("Hari ke-" + hariIni.getUrutan());

        // ========== 5. COLLECTION (ArrayList) - pakai Wrapper! ==========
        System.out.println("\n=== COLLECTION (WAJIB PAKAI WRAPPER) ===");
        ArrayList<Integer> listUmur = new ArrayList<>();  // ❌ ArrayList<int> gak bisa!
        listUmur.add(17);
        listUmur.add(18);
        listUmur.add(19);

        System.out.println("List umur: " + listUmur);
        System.out.println("Umur index 1: " + listUmur.get(1));
    }
}

// Contoh CLASS CUSTOM
class Mahasiswa {
    String nama;
    int umur;

    // Constructor
    Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanInfo() {
        System.out.println("Mahasiswa: " + nama + ", umur " + umur);
    }
}

// Contoh ENUM
enum Hari {
    SENIN(1), SELASA(2), RABU(3), KAMIS(4), JUMAT(5), SABTU(6), MINGGU(7);

    private int urutan;

    Hari(int urutan) {
        this.urutan = urutan;
    }

    public int getUrutan() {
        return urutan;
    }
}