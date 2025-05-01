package models;

import java.util.UUID;

public abstract class Person {
    protected int id;
    protected String nama;
    protected final String uniqueId = UUID.randomUUID().toString();
    
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
    
    public final String getUniqueId() {
        return uniqueId;
    }

    public abstract void display();
}
