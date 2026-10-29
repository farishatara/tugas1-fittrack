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
