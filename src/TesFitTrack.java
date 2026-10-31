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
        
      // 2. Sengaja memasukkan data yang melanggar aturan validasi saat instansiasi
        System.out.println("--- Skenario 2: Data Melanggar Validasi ---");
        Member memberError = new Member("   ", "12345", "26-08-2026", "Gold");
