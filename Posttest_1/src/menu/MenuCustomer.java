package menu;

import models.Customer;
import models.TabungGas;
import models.Pesanan;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuCustomer {
    private static ArrayList<Customer> daftarCustomer = new ArrayList<>();
    private static ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void tampilkanMenu() {
        int pilihan;
        do {
            System.out.println("\n=== MENU CUSTOMER ===");
            System.out.println("1. Tambah Customer");
            System.out.println("2. Lihat Customer");
            System.out.println("3. Buat Pesanan Gas");
            System.out.println("4. Lihat Pesanan Customer");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambahCustomer();
                case 2 -> lihatCustomer();
                case 3 -> buatPesanan();
                case 4 -> lihatPesanan();
                case 5 -> System.out.println("Kembali ke menu utama...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tambahCustomer() {
        System.out.print("ID Customer: ");
        int id = input.nextInt();
        input.nextLine();

        for (Customer c : daftarCustomer) {
            if (c.id == id) {
                System.out.println("Error: ID Customer sudah ada!");
                return;
            }
        }

        System.out.print("Nama Customer: ");
        String nama = input.nextLine();
        System.out.print("Alamat Customer: ");
        String alamat = input.nextLine();

        daftarCustomer.add(new Customer(id, nama, alamat));
        System.out.println("Customer berhasil ditambahkan!");
    }

    static void lihatCustomer() {
        if (daftarCustomer.isEmpty()) {
            System.out.println("Belum ada data customer.");
            return;
        }
        for (Customer c : daftarCustomer) c.display();
    }

    static void buatPesanan() {
        if (daftarCustomer.isEmpty()) {
            System.out.println("Belum ada customer. Tambahkan customer terlebih dahulu.");
            return;
        }

        ArrayList<TabungGas> daftarTabung = MenuTabung.getDaftarTabung();
        if (daftarTabung.isEmpty()) {
            System.out.println("Belum ada tabung gas tersedia. Tambahkan tabung gas terlebih dahulu.");
            return;
        }

        System.out.print("Masukkan ID Customer yang ingin memesan: ");
        int idCustomer = input.nextInt();
        input.nextLine();

        Customer customerTerpilih = null;
        for (Customer c : daftarCustomer) {
            if (c.id == idCustomer) {
                customerTerpilih = c;
                break;
            }
        }

        if (customerTerpilih == null) {
            System.out.println("Customer tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan ID Tabung Gas yang ingin dipesan: ");
        int idTabung = input.nextInt();
        input.nextLine();

        TabungGas tabungTerpilih = null;
        for (TabungGas t : daftarTabung) {
            if (t.id == idTabung) {
                tabungTerpilih = t;
                break;
            }
        }

        if (tabungTerpilih == null) {
            System.out.println("Tabung gas tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan jumlah gas yang ingin dipesan: ");
        int jumlahPesan = input.nextInt();

        if (jumlahPesan > tabungTerpilih.jumlahIsi) {
            System.out.println("Pesanan gagal! Jumlah gas isi tidak mencukupi.");
            return;
        }

        tabungTerpilih.jumlahIsi -= jumlahPesan;
        tabungTerpilih.updateKetersediaan();
        
        Pesanan pesananBaru = new Pesanan(idCustomer, customerTerpilih.nama, idTabung, tabungTerpilih.jenis, jumlahPesan);
        daftarPesanan.add(pesananBaru);

        System.out.println("Pesanan berhasil! " + customerTerpilih.nama + " memesan " + jumlahPesan + " gas.");
    }

    static void lihatPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        System.out.println("\n=== DAFTAR PESANAN ===");
        for (Pesanan p : daftarPesanan) {
            p.display();
        }
    }
}
