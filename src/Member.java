/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {
    private static final int MIN_PANJANG_TELP = 10;
    private static final String PAKET_BASIC = "Basic";
    private static final String PAKET_PREMIUM = "Premium";
    private static final String PAKET_VIP = "VIP";
    
    public static final String DEFAULT_NAMA = "Member Tanpa Nama";
    public static final String DEFAULT_TELP = "08000000000";
    public static final String DEFAULT_TANGGAL = "01-01-2026";
    public static final String DEFAULT_PAKET = PAKET_BASIC;

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    
    /**
 * Membuat member baru dengan mengisi semua atribut
 * melalui setter agar setiap data divalidasi.
 *
 * @param nama nama lengkap member
 * @param noTelepon nomor telepon aktif
 * @param tanggalDaftar tanggal bergabung
 * @param jenisPaket jenis paket keanggotaan
 */
public Member(String nama, String noTelepon,
              String tanggalDaftar, String jenisPaket) {
    setNama(nama);
    setNoTelepon(noTelepon);
    setTanggalDaftar(tanggalDaftar);
    setJenisPaket(jenisPaket);
}
    /**
 * Membuat member baru dengan paket Basic secara default.
 *
 * @param nama nama lengkap member
 * @param noTelepon nomor telepon aktif
 * @param tanggalDaftar tanggal bergabung
 */
public Member(String nama, String noTelepon, String tanggalDaftar) {
    this(nama, noTelepon, tanggalDaftar, PAKET_BASIC);
}


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("[Penolakan Validasi] Nama gagal diubah: Nama tidak boleh kosong atau hanya berisi spasi.");
            if (this.nama == null) {
                this.nama = DEFAULT_NAMA;
            }

            
            return;
        }
        this.nama = nama;
    }

    public String getNoTelepon() { return noTelepon; }
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null || !noTelepon.startsWith("0") || noTelepon.length() < MIN_PANJANG_TELP) {
            System.out.println("[Penolakan Validasi] Nomor telepon '" + noTelepon + "' ditolak: Wajib diawali angka 0 dan minimal 10 digit.");
            if (this.noTelepon == null) { this.noTelepon = DEFAULT_TELP; }
            return;
        }
        this.noTelepon = noTelepon;
    }
