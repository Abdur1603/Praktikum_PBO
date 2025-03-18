package models;

public class Customer {
    public int id;
    public String nama;
    public String alamat;

    public Customer(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void display() {
        System.out.println("ID: " + id + ", Nama Customer: " + nama + ", Alamat: " + alamat);
    }
}
