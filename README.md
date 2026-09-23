# Minpro-2-PBO-Sistem-Manajemen-Klinik-Hewan

## Deskripsi Singkat Program

Sistem Manajemen Klinik Hewan merupakan program berbasis Java yang digunakan untuk mengelola data klinik hewan secara sederhana.

Program ini dapat digunakan untuk:
- Menambahkan data klinik
- Menampilkan data klinik
- Menghapus data klinik
- Memperbarui data klinik
- Menyimpan data hewan, pemilik, dan pemeriksaan menggunakan `ArrayList`

---

## Struktur Package

Program memiliki struktur package sebagai berikut:

<img width="349" height="272" alt="image" src="https://github.com/user-attachments/assets/81cca249-2c4c-434d-a618-c99573d362b6" />

1. Package com.mycompany.klinikhewan

Berisi class KlinikHewan.java yang digunakan sebagai class utama untuk menjalankan program.

Class ini berisi:

Menu utama program
Input pilihan menu
Perulangan program
Pemanggilan method pada class Service

2. Package model

Berisi class yang digunakan untuk menyimpan data dan mengatur proses program, yaitu:

Service : mengatur proses tambah, tampil, hapus, dan update data.
Hewan : superclass untuk data hewan.
Kucing : subclass dari Hewan.
Anjing : subclass dari Hewan.
Pemilik : menyimpan data pemilik hewan.
Pemeriksaan : menyimpan data pemeriksaan hewan.

---

## Alur Program

Saat program dijalankan, sistem akan menampilkan menu utama:

<img width="424" height="242" alt="image" src="https://github.com/user-attachments/assets/ac1d09ac-c1fd-4e0d-aa9d-655704201176" />

Pengguna dapat memilih menu sesuai kebutuhan.

### 1. Tambah Data

<img width="416" height="480" alt="image" src="https://github.com/user-attachments/assets/dba0b602-1b17-484e-9ee9-7802672116f1" />

Pada menu tambah data, pengguna memasukkan:

Data Pemilik:

- ID Data
- Nama Pemilik
- Nomor Telepon

Data Hewan:

- Nama Hewan
- Jenis Hewan
- Umur Hewan

Jika jenis hewan adalah:

- Kucing, maka pengguna mengisi status vaksin F3.
- Anjing, maka pengguna mengisi status vaksin rabies.
- Jenis hewan lainnya tidak meminta data vaksin tersebut.

Data Pemeriksaan:

- Keluhan
- Diagnosa

Setelah semua data valid, data akan disimpan ke dalam ArrayList.

### 2. Tampilkan Data

<img width="410" height="997" alt="image" src="https://github.com/user-attachments/assets/b04a3342-e3d4-4c76-a399-b4e2c3751b7c" />

Menu tampilkan data digunakan untuk menampilkan seluruh data yang sudah tersimpan.

Data yang ditampilkan meliputi:

ID Data
Data pemilik
Data hewan
Jenis hewan
Status vaksin untuk Kucing atau Anjing
Data pemeriksaan

Program juga sudah memiliki dummy data awal sehingga saat menu tampilkan data dijalankan, data sudah langsung tersedia tanpa harus melakukan input terlebih dahulu.


