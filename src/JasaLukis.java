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
public int getHarga() {
            return harga;
        }
    }

    // === Method Anggota 3 ===
    public Pemesanan buatPemesanan(String namaPelanggan, String jenisBarang, String desainLukisan, int harga) {
        Pemesanan p = new Pemesanan(namaPelanggan, jenisBarang, desainLukisan, harga);
        return p;
    }

    // === Main Anggota 3 ===
    public static void main(String[] args) {
        String[] barang = {"Sepatu Nike", "Tas Gucci", "Jaket Adidas"};
        JasaLukis jasa = new JasaLukis("Melaney Art Studio", "Jl. Kemang Raya No.5", barang);

        jasa.tampilkanInfoJasa();

        // Buat pesanan pelanggan
        Pemesanan p1 = jasa.buatPemesanan("Tegar", "Sepatu Nike", "Motif Api Ungu", 250000);
        Pemesanan p2 = jasa.buatPemesanan("Reza", "Tas Gucci", "Es Beku", 300000);
        Pemesanan p3 = jasa.buatPemesanan("Revan", "Sepatu Adidas", "Mobil", 400000);

        // Tampilkan detail pesanan
        p1.tampilkanDetailPemesanan();
        p2.tampilkanDetailPemesanan();
        p3.tampilkanDetailPemesanan();

        // Hitung total biaya
        int total = p1.getHarga() + p2.getHarga()+ p3.getHarga();
        System.out.println("Total Biaya Semua Pesanan: Rp " + total);
    }
}