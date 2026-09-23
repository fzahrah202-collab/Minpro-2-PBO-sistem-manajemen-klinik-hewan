package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    private ArrayList<Hewan> daftarHewan;
    private ArrayList<Pemilik> daftarPemilik;
    private ArrayList<Pemeriksaan> daftarPemeriksaan;

    private Scanner scanner;

    public Service(Scanner scanner) {
        this.daftarHewan = new ArrayList<>();
        this.daftarPemilik = new ArrayList<>();
        this.daftarPemeriksaan = new ArrayList<>();
        this.scanner = scanner;
        
        // Dummy data awal
        daftarHewan.add(new Kucing(1, "Milo", 2, "Sudah"));
        daftarPemilik.add(new Pemilik(1, "Fatim", "081234567890"));
        daftarPemeriksaan.add(new Pemeriksaan(1, "Tidak mau makan", "Gangguan pencernaan"));

    }
    
    //Tambah Data
    public void tambahData() {

        System.out.println("\n=== TAMBAH DATA KLINIK ===");

        int idData;
        
        while (true) {
            System.out.print("ID Data: ");
            idData = Integer.parseInt(scanner.nextLine());
            
            if (idData < 0) {
                System.out.println(">> ID tidak boleh negatif!");
            }
            else {
                boolean idSudahAda = false;
                
                for (Hewan h : daftarHewan) {
                    if (h.getIdData() == idData) {
                        idSudahAda = true;
                    }
                }
                
                if (idSudahAda) {
                    System.out.println(">> ID sudah terdaftar! Silahkan gunakan ID lain!");
                }
                else {
                    break;
                }
            }
                    
        }

        // Data Pemilik
        System.out.println("\n--- Data Pemilik ---");
        
        String namaPemilik;
        
        while (true) {
            System.out.print("Nama Pemilik: ");
            namaPemilik = scanner.nextLine();
            
            if (namaPemilik.isEmpty()) {
                System.out.println(">> Nama pemilik tidak boleh kosong!");
            }
            else {
                break;
            }
        }
        
        String noTelepon;
        
        while (true) {
            System.out.print("No. Telepon: ");
            noTelepon = scanner.nextLine();
            
            if (noTelepon.isEmpty()) {
                System.out.println(">> No. telepon tidak boleh kosong!");
            }
            else if (noTelepon.length() < 10) {
                System.out.println(">> No. telepon minimal 10 digit!");
            }
            else if (noTelepon.length() > 13) {
                System.out.println(">> No. telepon maksimal 13 digit!");
            }
            else {
                break;
            }
        }
        
        Pemilik pemilikBaru = new Pemilik(idData, namaPemilik, noTelepon);
        daftarPemilik.add(pemilikBaru);

        // Data Hewan
        System.out.println("\n--- Data Hewan ---");

        String namaHewan;
        
        while (true) {
            System.out.print("Nama Hewan: ");
            namaHewan = scanner.nextLine();
            
            if (namaHewan.isEmpty()) {
                System.out.println(">> Nama hewan tidak boleh kosong!");
            }
            else {
                break;
            }
        }
        
        String jenisHewan;
        
        while (true) {
            System.out.print("Jenis Hewan: ");
            jenisHewan = scanner.nextLine();
            
            if (jenisHewan.isEmpty()) {
                System.out.println(">> Jenis hewan tidak boleh kosong!");
            }
            else {
                break;
            }
        }
        
        int umur;
        
        while (true) {
            System.out.print("Umur Hewan: ");
            umur = Integer.parseInt(scanner.nextLine());
            
            if (umur < 0) {
                System.out.println(">> Umur tidak boleh negatif!");
            }
            else {
                break;
            }
        }
        
        Hewan hewanBaru;
        
        //Kucing
        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            
            String statusVaksinF3;
            
            while (true) {
              System.out.print("Status Vaksin F3: ");
              statusVaksinF3 = scanner.nextLine();
              
              if (statusVaksinF3.isEmpty()) {
                  System.out.println(">> Status vaksin F3 tidak boleh kosong!");
              }
              else {
                  break;
              }
            }
            
            hewanBaru = new Kucing(idData, namaHewan, umur, statusVaksinF3);
        }
        //Anjing
        else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            String statusVaksinRabies;
            
            while (true) {
                System.out.print("Status Vaksin Rabies: ");
                statusVaksinRabies = scanner.nextLine();
                
                if (statusVaksinRabies.isEmpty()) {
                    System.out.println(">> Status vaksin rabies tidak boleh kosong!");
                }
                else {
                    break;
                }
            }
            
            hewanBaru = new Anjing(idData, namaHewan, umur, statusVaksinRabies);
        }
        //Hewan Lain
        else {
            hewanBaru = new Hewan(idData, namaHewan, jenisHewan, umur);
        }
        
        daftarHewan.add(hewanBaru);

        // Data Pemeriksaan
        System.out.println("\n--- Data Pemeriksaan ---");

        String keluhan;
        
         while (true) {
             System.out.print("Keluhan: ");
             keluhan = scanner.nextLine();
             
             if (keluhan.isEmpty()) {
                 System.out.println(">> Keluhan tidak boleh kosong!");
             }
             else {
                 break;
             }
         }
         
         String diagnosa;
         
         while (true) {
             System.out.print("Diagnosa: ");
             diagnosa = scanner.nextLine();
             
             if (diagnosa.isEmpty()) {
                 System.out.println(">> Diagnosa tidak boleh kosong!");
             }
             else {
                 break;
             }

         }
         
         Pemeriksaan pemeriksaanBaru = new Pemeriksaan(idData, keluhan, diagnosa);
         
         daftarPemeriksaan.add(pemeriksaanBaru);
         System.out.println(">> Data klinik berhasil ditambahkan!");
    }
    // TAMPILKAN DATA
    public void tampilkanData() {

        if (daftarHewan.isEmpty()) {
            System.out.println("\nBelum ada data klinik.");
            return;
        }
        
        System.out.println("\n=== DATA KLINIK HEWAN ===");

        for (int i = 0; i < daftarHewan.size(); i++) {

            Hewan h = daftarHewan.get(i);
            Pemilik p = daftarPemilik.get(i);
            Pemeriksaan pm = daftarPemeriksaan.get(i);

            System.out.println("\n=========================");
            System.out.println("ID Data: " + h.getIdData());

            System.out.println("\n--- Data Pemilik ---");
            System.out.println("Nama Pemilik: " + p.getNamaPemilik());
            System.out.println("No. Telepon: " + p.getNoTelepon());

            System.out.println("\n--- Data Hewan ---");
            System.out.println("Nama Hewan: " + h.getNamaHewan());
            System.out.println("Umur Hewan: " + h.getUmur());
            
            // polymorphism
            h.tampilkanInfo();

            System.out.println("\n--- Data Pemeriksaan ---");
            System.out.println("Keluhan: " + pm.getKeluhan());
            System.out.println("Diagnosa: " + pm.getDiagnosa());

            System.out.println("=========================");
        }
    }

    // HAPUS DATA
    public void hapusData() {
        
        System.out.println("\nMasukkan ID Data: ");
        int idTarget = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < daftarHewan.size(); i++) {

            if (daftarHewan.get(i).getIdData() == idTarget) {

                daftarHewan.remove(i);
                daftarPemilik.remove(i);
                daftarPemeriksaan.remove(i);

                System.out.println(">> Data klinik berhasil dihapus!");
                return;
            }
        }

        System.out.println(">> Data tidak ditemukan!");
    }

    // UPDATE DATA
    public void updateData() {
        
        System.out.println("\nMasukkan ID Data: ");
        int idTarget = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < daftarHewan.size(); i++) {

            Hewan h = daftarHewan.get(i);

            if (h.getIdData() == idTarget) {

                Pemilik p = daftarPemilik.get(i);
                Pemeriksaan pm = daftarPemeriksaan.get(i);

                System.out.println("\n=== UPDATE DATA KLINIK ===");

                // Update Pemilik
                System.out.println("\n--- Data Pemilik ---");
                
                String namaPemilikBaru;
                
                while (true) {
                    System.out.print("Nama Pemilik Baru: ");
                    namaPemilikBaru = scanner.nextLine();
                    
                    if (namaPemilikBaru.isEmpty()) {
                        System.out.println(">> Nama pemilik tidak boleh kosong!");
                    }
                    else {
                        break;
                    }
                }
                
                String noTeleponBaru;
                
                while (true) {
                    System.out.print("No. Telepon Baru: ");
                    noTeleponBaru = scanner.nextLine();
                    
                    if (noTeleponBaru.isEmpty()) {
                        System.out.println(">> No. telepon tidak boleh kosong!");
                    }
                    else if (noTeleponBaru.length() < 10) {
                        System.out.println(">> No. telepon minimal 10 digit!");
                    }
                    else if (noTeleponBaru.length() > 13) {
                        System.out.println(">> No. telepon maksimal 13 digit!");
                    }
                    else {
                        break;
                    }
                }

                // Update Hewan
                System.out.println("\n--- Data Hewan ---");
                
                String namaHewanBaru;
                
                while (true) {
                    
                    System.out.print("Nama Hewan Baru: ");
                    namaHewanBaru = scanner.nextLine();
                    
                    if (namaHewanBaru.isEmpty()) {
                        System.out.println(">> Nama hewan tidak boleh kosong!");
                    }
                    else {
                        break;
                    }
                }
                
                int umurBaru;
                
                while (true) {
                    System.out.println("Umur Baru: ");
                    umurBaru = Integer.parseInt(scanner.nextLine());
                    
                    if (umurBaru < 0) {
                        System.out.println(">> Umur tidak boleh negatif!");
                    }
                    else {
                        break;
                    }
                }
                //Update data umum Hewan
                h.setNamaHewan(namaHewanBaru);
                h.setUmur(umurBaru);
                
                // Update Status Vaksin Kucing
                if (h instanceof Kucing) {
                    String statusVaksinF3Baru;
                    
                    while (true) {
                        System.out.println("Status Vaksin F3 Baru: ");
                        statusVaksinF3Baru = scanner.nextLine();
                        
                        if (statusVaksinF3Baru.isEmpty()) {
                            System.out.println(">> Status vaksin F3 tidak boleh kosong! ");
                        }
                        else {
                            break;
                        }
                    }
                    
                    Kucing kucing = (Kucing) h;
                    
                    kucing.setStatusVaksinF3(statusVaksinF3Baru);
                }
                //update vaksin anjing
                else if (h instanceof Anjing) {
                    String statusVaksinRabiesBaru;
                    
                    while (true) {
                        System.out.println("Status Vaksin Rabies Baru: ");
                        statusVaksinRabiesBaru = scanner.nextLine();
                        
                        if (statusVaksinRabiesBaru.isEmpty()) {
                            System.out.println(">> Status vaksin rabies tidak boleh kosong!");
                        }
                        else {
                            break;
                        }
                    }
                    
                    Anjing anjing = (Anjing) h;
                    
                    anjing.setStatusVaksinRabies(statusVaksinRabiesBaru);
                }
                
                // Update Pemeriksaan
                System.out.println("\n--- Data Pemeriksaan ---");

                String keluhanBaru;
                
                while (true) {
                    System.out.println("Keluhan Baru: ");
                    keluhanBaru = scanner.nextLine();
                    
                    if (keluhanBaru.isEmpty()) {
                        System.out.println(">> Keluhan tidak boleh kosong!");
                    }
                    else {
                        break;
                    }
                }
                
                String diagnosaBaru;
                
                while (true) {
                    System.out.println("Diagnosa Baru: ");
                    diagnosaBaru = scanner.nextLine();
                    
                    if (diagnosaBaru.isEmpty()) {
                        System.out.println("Diagnosa tidak boleh kosong!");
                    }
                    else {
                        break;
                    }
                }
                //Set data pemilik
                p.setNamaPemilik(namaPemilikBaru);
                p.setNoTelepon(noTeleponBaru);
                
                //Set data pemeriksaan
                pm.setKeluhan(keluhanBaru);
                pm.setDiagnosa(diagnosaBaru);
                
                System.out.println("\n>> Data klinik berhasil diperbarui!");
                return;
            }
        }

        System.out.println(">> Data tidak ditemukan!");
    }
}