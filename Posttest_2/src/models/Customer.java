package models;

public class Customer {
    private int id;
    private String nama;
    private String alamat;

    public Customer(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void display() {
        System.out.println("ID: " + id + ", Nama Customer: " + nama + ", Alamat: " + alamat);
    }
}
