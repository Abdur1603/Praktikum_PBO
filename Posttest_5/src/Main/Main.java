package Main;

import menu.MenuTabung;
import menu.MenuSupplier;
import menu.MenuCustomer;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Menu Supplier");
            System.out.println("2. Menu Tabung Gas");
            System.out.println("3. Menu Customer");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> MenuSupplier.tampilkanMenu();
                case 2 -> {
                    if (MenuSupplier.getDaftarSupplier().isEmpty()) {
                        System.out.println("Gagal masuk ke Menu Tabung! Tambahkan supplier terlebih dahulu.");
                    } else {
                        MenuTabung.tampilkanMenu(MenuSupplier.getDaftarSupplier());
                    }
                }
                case 3 -> MenuCustomer.tampilkanMenu();
                case 4 -> System.out.println("Terima kasih! Program selesai.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}




