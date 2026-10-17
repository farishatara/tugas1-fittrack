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
