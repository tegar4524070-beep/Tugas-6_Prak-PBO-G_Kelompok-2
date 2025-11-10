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
}
