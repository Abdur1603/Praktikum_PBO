package models;

public class Supplier {
    public int id;
    public String nama;
    public String kontak;

    public Supplier(int id, String nama, String kontak) {
        this.id = id;
        this.nama = nama;
        this.kontak = kontak;
    }

    public void display() {
        System.out.println("ID: " + id + ", Nama Supplier: " + nama + ", Kontak: " + kontak);
    }
}
