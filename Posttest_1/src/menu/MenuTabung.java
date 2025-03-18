package menu;

import models.TabungGas;
import models.Supplier;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuTabung {
    private static ArrayList<TabungGas> daftarTabung = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void tampilkanMenu(ArrayList<Supplier> daftarSupplier) {
        int pilihan;
        do {
            System.out.println("\n=== MENU TABUNG GAS ===");
            System.out.println("1. Tambah Tabung Gas");
            System.out.println("2. Lihat Tabung Gas");
            System.out.println("3. Update Tabung Gas");
            System.out.println("4. Hapus Tabung Gas");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambahTabung(daftarSupplier);
                case 2 -> lihatTabung();
                case 3 -> updateTabung();
                case 4 -> hapusTabung();
                case 5 -> System.out.println("Kembali ke menu utama...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tambahTabung(ArrayList<Supplier> daftarSupplier) {
        if (daftarSupplier.isEmpty()) {
            System.out.println("Gagal menambahkan tabung! Tambahkan supplier terlebih dahulu.");
            return;
        }

        System.out.print("ID Tabung: ");
        int id = input.nextInt();
        input.nextLine();

        for (TabungGas t : daftarTabung) {
            if (t.id == id) {
                System.out.println("Error: ID Tabung sudah ada!");
                return;
            }
        }

        System.out.print("Jenis Gas: ");
        String jenis = input.nextLine();
        System.out.print("Kapasitas (jumlah tabung): ");
        int kapasitas = input.nextInt();
        System.out.print("Jumlah Gas Isi: ");
        int jumlahIsi = input.nextInt();

        System.out.println("\nPilih Supplier:");
        for (Supplier s : daftarSupplier) {
            System.out.println(s.id + ". " + s.nama);
        }
        System.out.print("Masukkan ID Supplier: ");
        int idSupplier = input.nextInt();
        input.nextLine();

        Supplier supplierTerpilih = null;
        for (Supplier s : daftarSupplier) {
            if (s.id == idSupplier) {
                supplierTerpilih = s;
                break;
            }
        }

        if (supplierTerpilih == null) {
            System.out.println("Supplier tidak ditemukan! Tambah tabung dibatalkan.");
            return;
        }

        daftarTabung.add(new TabungGas(id, jenis, kapasitas, jumlahIsi, idSupplier, supplierTerpilih.nama));
        System.out.println("Tabung gas berhasil ditambahkan dari supplier " + supplierTerpilih.nama + "!");
    }

    static void lihatTabung() {
        if (daftarTabung.isEmpty()) {
            System.out.println("Belum ada data tabung gas.");
            return;
        }
        for (TabungGas t : daftarTabung) t.display();
    }

    static void updateTabung() {
        if (daftarTabung.isEmpty()) {
            System.out.println("Belum ada data tabung gas.");
            return;
        }
        System.out.print("Masukkan ID Tabung yang ingin diupdate: ");
        int id = input.nextInt();
        for (TabungGas t : daftarTabung) {
            if (t.id == id) {
                input.nextLine();
                System.out.print("Jenis Gas baru: ");
                t.jenis = input.nextLine();
                System.out.print("Kapasitas baru (jumlah tabung): ");
                t.kapasitas = input.nextInt();
                System.out.print("Jumlah Gas Isi: ");
                t.jumlahIsi = input.nextInt();
                t.updateKetersediaan();
                System.out.println("Tabung gas berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Tabung gas tidak ditemukan.");
    }

    static void hapusTabung() {
        if (daftarTabung.isEmpty()) {
            System.out.println("Belum ada data tabung gas.");
            return;
        }
        System.out.print("Masukkan ID Tabung yang ingin dihapus: ");
        int id = input.nextInt();
        daftarTabung.removeIf(t -> t.id == id);
        System.out.println("Tabung gas berhasil dihapus!");
    }

    public static ArrayList<TabungGas> getDaftarTabung() {
        return daftarTabung;
    }
}
