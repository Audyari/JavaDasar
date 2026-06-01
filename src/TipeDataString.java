public class TipeDataString {
    public static void main(String[] args) {

        // ========== CARA MEMBUAT STRING ==========
        System.out.println("=== MEMBUAT STRING ===");

        // Cara 1: String literal (PALING UMUM)
        String nama = "Budi Santoso";
        String kota = "Jakarta";


        // Cara 2: Menggunakan new String() (jarang dipake)
        String alamat = new String("Jl. Mawar No. 123");

        System.out.println("Nama: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Alamat: " + alamat);


        // ========== MENGGABUNG STRING (KONKATENASI) ==========
        System.out.println("\n=== MENGGABUNG STRING ===");

        String firstName = "Budi";
        String lastName = "Santoso";

        // Pakai operator +
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);  // Budi Santoso

        // Bisa juga gabung dengan tipe lain
        int umur = 25;
        String info = nama + " berumur " + umur + " tahun";
        System.out.println(info);  // Budi Santoso berumur 25 tahun


        // ========== METHOD-METHOD STRING ==========
        System.out.println("\n=== METHOD STRING ===");

        String teks = "Hello, World!";

        // 1. length() - panjang string
        System.out.println("Panjang: " + teks.length());  // 13

        // 2. charAt() - ambil karakter di posisi tertentu
        System.out.println("Karakter index 0: " + teks.charAt(0));  // H
        System.out.println("Karakter index 7: " + teks.charAt(7));  // W

        // 3. substring() - ambil sebagian string
        System.out.println("Substring 0-5: " + teks.substring(0, 5));  // Hello
        System.out.println("Substring 7-12: " + teks.substring(7, 12)); // World

        // 4. toUpperCase() / toLowerCase() - ubah huruf
        System.out.println("Uppercase: " + teks.toUpperCase());  // HELLO, WORLD!
        System.out.println("Lowercase: " + teks.toLowerCase());  // hello, world!

        // 5. contains() - cek apakah mengandung teks tertentu
        System.out.println("Contains 'World'? " + teks.contains("World"));  // true
        System.out.println("Contains 'Java'? " + teks.contains("Java"));    // false

        // 6. equals() - bandingkan isi string (CASE SENSITIVE!)
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        System.out.println("str1 equals str2: " + str1.equals(str2));  // false
        System.out.println("str1 equals str3: " + str1.equals(str3));  // true

        // 7. equalsIgnoreCase() - bandingkan tanpa peduli huruf besar/kecil
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));  // true

        // 8. indexOf() - cari posisi pertama suatu karakter/string
        System.out.println("Posisi 'W': " + teks.indexOf('W'));  // 7
        System.out.println("Posisi 'World': " + teks.indexOf("World"));  // 7

        // 9. replace() - ganti karakter/string
        String ganti = teks.replace("World", "Java");
        System.out.println("Setelah replace: " + ganti);  // Hello, Java!

        // 10. trim() - hapus spasi di awal dan akhir
        String denganSpasi = "   Budi   ";
        System.out.println("Sebelum trim: '" + denganSpasi + "'");
        System.out.println("Setelah trim: '" + denganSpasi.trim() + "'");

        // 11. split() - potong string jadi array
        String kalimat = "saya suka belajar Java";
        String[] kata = kalimat.split(" ");
        System.out.print("Hasil split: ");
        for (String k : kata) {
            System.out.print("[" + k + "] ");
        }
        System.out.println();


        String namaDepan = "Audyari";
        int alamatMemori = System.identityHashCode(namaDepan);
        System.out.println("Alamat Memori: " + alamatMemori);

        String namaBelakang = "Wiyono";
        String FullName = namaDepan + " " + namaBelakang;

        System.out.println("Full name: " + FullName);
    }
}