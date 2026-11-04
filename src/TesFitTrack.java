/**
 * Class pengujian (driver class) untuk menjalankan sistem pendataan 
 * keanggotaan Gym FitTrack, termasuk skenario uji validasi dan array.
 */
public class TesFitTrack {
  
    /**
     * Method utama untuk menjalankan program aplikasi FitTrack.
     * 
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN SISTEM KEANGGOTAAN GYM FITTRACK ===\n");
      
        // 1. Ciptakan minimal 4 objek Member dan simpan dalam satu array
        Member[] daftarMember = new Member[4];

        daftarMember[0] = new Member("Andi Saputra", "081234567890", "15-08-2026", "Basic");
        daftarMember[1] = new Member("Siti Rahma", "085698765432", "20-08-2026", "Premium");
        daftarMember[2] = new Member("Budi Santoso", "081122334455", "22-08-2026", "VIP");
        daftarMember[3] = new Member("Dewi Lestari", "089988776655", "25-08-2026"); // Menggunakan constructor tanpa paket

        System.out.println("--- Skenario 1: Membuat Objek Member dan Menyimpan dalam Array ---");
        System.out.println(daftarMember.length + " objek Member berhasil dibuat (3 jenis paket berbeda, 1 tanpa paket).");

        
        // 2. Sengaja memasukkan data yang melanggar aturan validasi saat instansiasi
        System.out.println("/n--- Skenario 2: Data Melanggar Validasi ---");
        Member memberError = new Member("   ", "12345", "26-08-2026", "Gold");

         // 3. Menguji setter dengan nilai tidak valid pada objek yang sudah jadi
        System.out.println("\n--- Skenario 3: Uji Setter dengan Nilai Salah ---");
        System.out.println("Nilai awal nomor telepon Andi: " + daftarMember[0].getNoTelepon());

        daftarMember[0].setNoTelepon("12345"); // Ditolak, nilai lama dipertahankan
        
        System.out.println("Nilai akhir nomor telepon Andi: " + daftarMember[0].getNoTelepon());

        // 4. Mencetak seluruh objek Member dari array menggunakan perulangan for dan toString()
        System.out.println("\n--- Skenario 4: Cetak Menggunakan Perulangan For ---");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + daftarMember[i].toString());
        }
        
        System.out.println("Data Error Terisolasi: " + memberError.toString());
    }
}
