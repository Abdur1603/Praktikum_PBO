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
    public void display() {
        super.display();
        System.out.println("Kontak: " + kontak);
    }
}
