package models;

public class Kue {
    private int idKue;
    private String namaKue;
    private float harga;
    private int stok;

    public Kue(int id, String nama, float harga, int stok) {
        this.idKue = id;
        this.namaKue = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void updateStok(int stokBaru) {
        this.stok = stokBaru;
    }

    public void updateHarga(float hargaBaru) {
        this.harga = hargaBaru;
    }

    public float getHarga() {
        return harga;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public int getIdKue() {
        return idKue;
    }

    public int getStok() {
        return stok;
    }
    
    public void setHarga(float harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

}
