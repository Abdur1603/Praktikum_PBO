package models;

public class Customer extends Person {
    private String alamat;

    public Customer(int id, String nama, String alamat) {
        super(id, nama);
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public final void display() {
        System.out.println("UUID: " + getUniqueId());
        System.out.println("ID: " + id + ", Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
