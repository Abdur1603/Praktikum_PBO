package models;

public class Pesanan {
    private int idCustomer;
    private String namaCustomer;
    private int idTabung;
    private String jenisTabung;
    private int jumlahPesan;

    public Pesanan(int idCustomer, String namaCustomer, int idTabung, String jenisTabung, int jumlahPesan) {
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.idTabung = idTabung;
        this.jenisTabung = jenisTabung;
        this.jumlahPesan = jumlahPesan;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public int getIdTabung() {
        return idTabung;
    }

    public void setIdTabung(int idTabung) {
        this.idTabung = idTabung;
    }

    public String getJenisTabung() {
        return jenisTabung;
    }

    public void setJenisTabung(String jenisTabung) {
        this.jenisTabung = jenisTabung;
    }

    public int getJumlahPesan() {
        return jumlahPesan;
    }

    public void setJumlahPesan(int jumlahPesan) {
        this.jumlahPesan = jumlahPesan;
    }

    public void display() {
        System.out.println("Customer: " + namaCustomer + " (ID: " + idCustomer + ")");
        System.out.println("Tabung Gas: " + jenisTabung + " (ID: " + idTabung + ")");
        System.out.println("Jumlah Dipesan: " + jumlahPesan);
        System.out.println("-----------------------------------");
    }
}
