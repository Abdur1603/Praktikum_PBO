package models;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Person {

    public static ArrayList<Kue> daftarKue = new ArrayList<>();

    public Admin(String username, String password) {
        super(username, password);
    }

    public static void tambahKue(Kue kue) {
        daftarKue.add(kue);
    }

    public void editKue(int idKue, float hargaBaru) {
        for (Kue k : daftarKue) {
            if (k.getIdKue() == idKue) {
                k.updateHarga(hargaBaru);
                System.out.println("Harga kue " + k.getNamaKue() + " telah diubah.");
                return;
            }
        }
        System.out.println("Kue dengan ID " + idKue + " tidak ditemukan.");
    }

    public void hapusKue(int idKue) {
        for (Kue k : daftarKue) {
            if (k.getIdKue() == idKue) {
                daftarKue.remove(k);
                System.out.println("Kue " + k.getNamaKue() + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kue dengan ID " + idKue + " tidak ditemukan.");
    }

    public void lihatPesanan(List<Transaksi> daftarTransaksi) {
        System.out.println("Daftar Pesanan:");
        for (Transaksi trx : daftarTransaksi) {
            trx.cetakNota();
        }
    }

    public static ArrayList<Kue> tampilkanDaftarKue() {
        return daftarKue;
    }

}
