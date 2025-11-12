public class JasaLukis {
    private String namaJasa;
    private String alamat;
    private String[] daftarBarang;

    public JasaLukis(String namaJasa, String alamat, String[] daftarBarang) {
        this.namaJasa = namaJasa;
        this.alamat = alamat;
        this.daftarBarang = daftarBarang;
    }

    public void tampilkanInfoJasa() {
        System.out.println("=== Informasi Jasa Lukis ===");
        System.out.println("Nama Jasa   : " + namaJasa);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Daftar Barang Branded yang Dapat Dilukis:");
        for (String barang : daftarBarang) {
            System.out.println("- " + barang);
        }
        System.out.println();
    }
        // anggota 2
    public class Pemesanan {
        private String namaPelanggan;
        private String jenisBarang;
        private String desainLukisan;
        private int harga;

        public Pemesanan(String namaPelanggan, String jenisBarang, String desainLukisan, int harga) {
            this.namaPelanggan = namaPelanggan;
            this.jenisBarang = jenisBarang;
            this.desainLukisan = desainLukisan;
            this.harga = harga;
        }

        public void tampilkanDetailPemesanan(){
            System.out.println("~~~~~ Detail Pemesanan ~~~~~");
            System.out.println("Nama Pelanggan          : " + namaPelanggan);
            System.out.println("Jenis Barang            : " + jenisBarang);
            System.out.println("Desain Lukisan          : " + desainLukisan);
            System.out.println("Harga                   : " + harga);
        }
}
