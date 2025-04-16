package models;

public class TabungGas {
    private int id;
    private String jenis;
    private int kapasitas;
    private int jumlahIsi;
    private boolean tersedia;
    private int idSupplier;
    private String namaSupplier;

    public TabungGas(int id, String jenis, int kapasitas, int jumlahIsi, int idSupplier, String namaSupplier) {
        this.id = id;
        this.jenis = jenis;
        this.kapasitas = kapasitas;
        this.jumlahIsi = jumlahIsi;
        this.tersedia = jumlahIsi > 0;
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getJumlahIsi() {
        return jumlahIsi;
    }

    public void setJumlahIsi(int jumlahIsi) {
        this.jumlahIsi = jumlahIsi;
        updateKetersediaan();
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void updateKetersediaan() {
        this.tersedia = jumlahIsi > 0;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public void display() {
        System.out.println("ID: " + id + ", Jenis: " + jenis + ", Kapasitas: " + kapasitas + ", Jumlah Isi: " + jumlahIsi + "/" + kapasitas +
                ", Tersedia: " + (tersedia ? "Ya" : "Tidak") + ", Supplier: " + namaSupplier);
    }
}