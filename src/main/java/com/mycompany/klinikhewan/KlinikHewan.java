package com.mycompany.klinikhewan;

import model.Service;
import java.util.Scanner;

public class KlinikHewan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Service service = new Service(scanner);

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("\n==== SISTEM MANAJEMEN KLINIK HEWAN ====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.println("=======================================");

            int pilihan;

            while (true) {

                System.out.print("Pilih menu (1-5): ");

                if (scanner.hasNextInt()) {

                    pilihan = scanner.nextInt();
                    scanner.nextLine();

                    if (pilihan >= 1 && pilihan <= 5) {
                        break;
                    }
                    else {
                        System.out.println(">> Pilihan harus 1-5!");
                    }

                }
                else {

                    System.out.println(">> Pilihan harus berupa angka!");
                    scanner.nextLine();
                }
            }

            System.out.println("=======================================");

            switch (pilihan) {

                case 1 -> service.tambahData();

                case 2 -> service.tampilkanData();

                case 3 -> service.hapusData();

                case 4 -> service.updateData();

                case 5 -> {
                    berjalan = false;
                    System.out.println("\nSelamat Tinggal ^^");
                }

                default -> System.out.println("\nPilihan tidak valid!");
            }
        }

        scanner.close();
    }
}