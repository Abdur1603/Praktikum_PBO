package models;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Transaksi {
    
    private static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
    
    public static ArrayList<Transaksi> getDaftarTransaksi() {
    return daftarTransaksi;
    }
    private int idTransaksi;
    private String customer;
    private Map<String, DetailKue> daftarKue;
    private float totalHarga;

    public Transaksi(int idTransaksi, String customer) {
        this.idTransaksi = idTransaksi;
        this.customer = customer;
        this.daftarKue = new LinkedHashMap<>();
    }

    private class DetailKue {
        private String namaKue;
        private int jumlah;
        private float hargaSatuan;

        public DetailKue(String namaKue, float hargaSatuan, int jumlah) {
            this.namaKue = namaKue;
            this.jumlah = jumlah;
            this.hargaSatuan = hargaSatuan;
        }

        float getSubtotal() {
            return jumlah * hargaSatuan;
        }    
        public String getNamaKue() { return namaKue; }
        public float getHarga() { return hargaSatuan; }
        public int getJumlah() { return jumlah; }
    }
    
    public void tambahKue(String namaKue, int jumlah, float harga) {
        DetailKue dk = new DetailKue(namaKue, harga, jumlah);
        daftarKue.put(namaKue, dk);
    }
    
    public static void tambahTransaksi(Transaksi trx) {
        daftarTransaksi.add(trx);
    }
    
    public void hitungTotal() {
        totalHarga = 0;
        for (DetailKue dk : daftarKue.values()) {
            totalHarga += dk.getSubtotal();
        }
    }

    public String cetakNota() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Nota Transaksi ===\n");
        sb.append("ID Transaksi: ").append(idTransaksi).append("\n");
        sb.append("Customer: ").append(customer).append("\n");
        sb.append("Detail Pesanan:\n");

        for (Map.Entry<String, DetailKue> entry : daftarKue.entrySet()) {
            DetailKue dk = entry.getValue();
            sb.append("- ").append(dk.getNamaKue())
              .append(" | Harga: Rp").append(String.format("%.2f", dk.getHarga()))
              .append(" | Qty: ").append(dk.getJumlah()).append("\n");
        }

        sb.append("Total Harga: Rp").append(String.format("%.2f", totalHarga)).append("\n\n");
        return sb.toString();
    }

    public String getCustomer() {
        return customer;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public float getTotalHarga() {
        return totalHarga;
    }
}
