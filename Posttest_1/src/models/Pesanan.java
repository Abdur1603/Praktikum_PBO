package models;

public class Pesanan {
    public int idCustomer;
    public String namaCustomer;
    public int idTabung;
    public String jenisTabung;
    public int jumlahPesan;

    public Pesanan(int idCustomer, String namaCustomer, int idTabung, String jenisTabung, int jumlahPesan) {
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.idTabung = idTabung;
        this.jenisTabung = jenisTabung;
        this.jumlahPesan = jumlahPesan;
    }

    public void display() {
        System.out.println("Customer: " + namaCustomer + " (ID: " + idCustomer + ")");
        System.out.println("Tabung Gas: " + jenisTabung + " (ID: " + idTabung + ")");
        System.out.println("Jumlah Dipesan: " + jumlahPesan);
        System.out.println("-----------------------------------");
    }
}
