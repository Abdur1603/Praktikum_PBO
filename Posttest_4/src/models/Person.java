package models;

public class Person {
    protected int id;
    protected String nama;

    public Person(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void display() {
        System.out.println("ID: " + id + ", Nama: " + nama);
    }
}
