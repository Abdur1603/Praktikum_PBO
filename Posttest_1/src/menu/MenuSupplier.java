package menu;

import models.Supplier;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuSupplier {
    private static ArrayList<Supplier> daftarSupplier = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void tampilkanMenu() {
        int pilihan;
        do {
            System.out.println("\n=== MENU SUPPLIER ===");
            System.out.println("1. Tambah Supplier");
            System.out.println("2. Lihat Supplier");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambahSupplier();
                case 2 -> lihatSupplier();
                case 3 -> System.out.println("Kembali ke menu utama...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }

    private static void tambahSupplier() {
        System.out.print("ID Supplier: ");
        int id = input.nextInt();
        input.nextLine();

        for (Supplier s : daftarSupplier) {
            if (s.id == id) {
                System.out.println("Error: ID Supplier sudah ada!");
                return;
            }
        }

        System.out.print("Nama Supplier: ");
        String nama = input.nextLine();
        System.out.print("Kontak Supplier: ");
        String kontak = input.nextLine();

        daftarSupplier.add(new Supplier(id, nama, kontak));
        System.out.println("Supplier berhasil ditambahkan!");
    }

    private static void lihatSupplier() {
        if (daftarSupplier.isEmpty()) {
            System.out.println("Belum ada data supplier.");
            return;
        }
        for (Supplier s : daftarSupplier) s.display();
    }

    public static ArrayList<Supplier> getDaftarSupplier() {
        return daftarSupplier;
    }
}
