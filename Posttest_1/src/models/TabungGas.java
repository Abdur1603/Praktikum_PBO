package models;

public class TabungGas {
    public int id;
    public String jenis;
    public int kapasitas;
    public int jumlahIsi;
    public boolean tersedia;
    public int idSupplier;  // ID Supplier
    public String namaSupplier; // Nama Supplier

    public TabungGas(int id, String jenis, int kapasitas, int jumlahIsi, int idSupplier, String namaSupplier) {
        this.id = id;
        this.jenis = jenis;
        this.kapasitas = kapasitas;
        this.jumlahIsi = jumlahIsi;
        this.tersedia = jumlahIsi > 0;
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
    }

    public void updateKetersediaan() {
        this.tersedia = jumlahIsi > 0;
    }

    public void display() {
        System.out.println("ID: " + id + ", Jenis: " + jenis + ", Kapasitas: " + kapasitas + ", Jumlah Isi: " + jumlahIsi + "/" + kapasitas +
                ", Tersedia: " + (tersedia ? "Ya" : "Tidak") + ", Supplier: " + namaSupplier);
    }
}
