package models;

public class Supplier extends Person {
    private String kontak;  

    public Supplier(int id, String nama, String kontak) {
        super(id, nama);
        this.kontak = kontak;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    } 
    
    @Override
    public final void display() {
        System.out.println("UUID: " + getUniqueId());
        System.out.println("ID: " + id + ", Nama: " + nama);
        System.out.println("Kontak: " + kontak);
    }
}
