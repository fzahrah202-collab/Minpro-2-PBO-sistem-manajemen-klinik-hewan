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

Berisi class `KlinikHewan.java` yang digunakan sebagai class utama untuk menjalankan program.

Class ini berisi:

- Menu utama program
- Input pilihan menu
- Perulangan program
- Pemanggilan method pada class Service

2. Package model

Berisi class yang digunakan untuk menyimpan data dan mengatur proses program, yaitu:

- `Service` : mengatur proses tambah, tampil, hapus, dan update data.
- `Hewan` : superclass untuk data hewan.
- `Kucing` : subclass dari Hewan.
- `Anjing` : subclass dari Hewan.
- `Pemilik` : menyimpan data pemilik hewan.
- `Pemeriksaan` : menyimpan data pemeriksaan hewan.

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

- ID Data
- Data pemilik
- Data hewan
- Jenis hewan
- Status vaksin untuk Kucing atau Anjing
- Data pemeriksaan

Program juga sudah memiliki dummy data awal sehingga saat menu tampilkan data dijalankan, data sudah langsung tersedia tanpa harus melakukan input terlebih dahulu.

### 3. Hapus Data

<img width="406" height="268" alt="image" src="https://github.com/user-attachments/assets/8d842646-7209-4a24-a41e-d94145c04995" />

Pengguna memasukkan ID Data yang ingin dihapus.

Program akan mencari ID tersebut di dalam ArrayList.

Jika ID ditemukan, maka data:

- Hewan
- Pemilik
- Pemeriksaan

akan dihapus.

Jika ID tidak ditemukan, program akan menampilkan pesan bahwa data tidak ditemukan.

### 4. Update Data

<img width="409" height="640" alt="image" src="https://github.com/user-attachments/assets/f6a7f27f-bd61-4164-9a51-d381f2f6ce4d" />

Pengguna memasukkan ID Data yang ingin diperbarui.

Jika ID ditemukan, pengguna dapat memperbarui:

- Nama pemilik
- Nomor telepon
- Nama hewan
- Umur hewan
- Status vaksin F3 untuk Kucing
- Status vaksin rabies untuk Anjing
- Keluhan
- Diagnosa

Setelah proses selesai, data akan diperbarui di dalam ArrayList.

### 5. Keluar

Jika pengguna memilih menu 5, program akan berhenti dan menampilkan pesan:

<img width="713" height="386" alt="image" src="https://github.com/user-attachments/assets/3e455974-803a-44ad-9436-33006779a434" />

## Penerapan Konsep PBO
### 1. Access Modifier

Program menerapkan access modifier untuk mengatur akses terhadap atribut dan method.

Contohnya pada class `Hewan`:

<img width="411" height="141" alt="image" src="https://github.com/user-attachments/assets/3e653675-2f78-464a-9910-64ad3c5af0b3" />

Atribut dibuat menggunakan private sehingga tidak dapat diakses secara langsung dari class lain.

Method seperti constructor, getter, setter, dan tampilkanInfo() menggunakan access modifier public agar dapat digunakan sesuai kebutuhan program.

### 2. Encapsulation

Encapsulation diterapkan dengan membuat atribut class menggunakan private dan menyediakan getter serta setter untuk mengakses atau mengubah data.

Contoh pada class `Hewan`:

<img width="409" height="520" alt="image" src="https://github.com/user-attachments/assets/1e694390-3c29-46b5-b6a7-64464dee0740" />

Dengan demikian, data tidak diakses secara langsung dari luar class, tetapi melalui method getter dan setter.

Encapsulation juga diterapkan pada class:

- `Hewan`
- `Kucing`
- `Anjing`
- `Pemilik`
- `Pemeriksaan`

### 3. Inheritance

Inheritance diterapkan dengan menggunakan class Hewan sebagai superclass dan memiliki dua subclass, yaitu Class `Kucing` dan `Anjing`.
Class `Kucing` dan `Anjing` menggunakan keyword extends:

<img width="436" height="36" alt="image" src="https://github.com/user-attachments/assets/4f3fac81-a5e5-400a-889a-dca2f6f75db2" />

<img width="434" height="42" alt="image" src="https://github.com/user-attachments/assets/1f1660d7-5b80-4af2-b2f8-3ff24b5a48b5" />

Kedua subclass tersebut mewarisi atribut dan method yang dimiliki oleh superclass Hewan.

Selain atribut yang diwariskan, masing-masing subclass memiliki atribut khusus:

**Kucing**

<img width="434" height="45" alt="image" src="https://github.com/user-attachments/assets/b9da4c96-c970-465e-ad69-8f47bd6f9b4a" />

Atribut tersebut digunakan untuk menyimpan status vaksin F3 pada kucing.

**Anjing**

<img width="453" height="39" alt="image" src="https://github.com/user-attachments/assets/b692ae30-3753-497a-a8c5-694ea53d9d88" />

Atribut tersebut digunakan untuk menyimpan status vaksin rabies pada anjing.

### 4. Validasi Input

Program menerapkan validasi input untuk mencegah data yang tidak sesuai masuk ke dalam sistem.

Validasi yang diterapkan antara lain:

## Validasi angka

Program menggunakan hasNextInt() untuk memastikan input tertentu berupa angka.

Contohnya:

- Pilihan menu
- ID Data
- Umur hewan

Program juga memeriksa agar nilai tidak negatif.

Contoh:

<img width="540" height="79" alt="image" src="https://github.com/user-attachments/assets/55ae5595-bc02-4665-8169-e7885fcb1672" />

## Validasi data kosong

Program menggunakan isEmpty() untuk memastikan input teks tidak kosong.

Contohnya:

<img width="541" height="69" alt="image" src="https://github.com/user-attachments/assets/b8d64d8f-8a5c-4627-8f15-54af0bda3e00" />

## Validasi nomor telepon

Nomor telepon juga memiliki validasi panjang karakter, yaitu minimal 10 digit dan maksimal 13 digit.

<img width="540" height="121" alt="image" src="https://github.com/user-attachments/assets/57ccf6bf-7097-4ebf-947a-712b0eea9c58" />

## Validasi ID Data

Program melakukan pengecekan ID agar ID yang sama tidak dapat digunakan kembali.

Jika ID sudah terdaftar, program akan meminta pengguna memasukkan ID lain.

<img width="532" height="209" alt="image" src="https://github.com/user-attachments/assets/ca101ba4-ef21-4558-aab5-88d34ff31f2a" />

### 5. Dummy Data

Program memiliki dummy data awal yang dimasukkan ke dalam ArrayList melalui constructor pada class Service.

Contohnya:

<img width="542" height="78" alt="image" src="https://github.com/user-attachments/assets/f58568d8-1afd-48af-9e54-193a5b5f8163" />

Dummy data tersebut digunakan agar ketika program pertama kali dijalankan dan pengguna memilih menu Tampilkan Data, data sudah langsung tersedia tanpa harus melakukan input terlebih dahulu.

### Nilai Tambah
### Polymorphism

Program menerapkan polymorphism melalui method overriding.

Pada superclass `Hewan` terdapat method:

<img width="457" height="79" alt="image" src="https://github.com/user-attachments/assets/ddc97ecd-41ca-4c87-b1a4-921b1344db43" />

Method tersebut kemudian dioverride oleh subclass `Kucing`:

<img width="475" height="98" alt="image" src="https://github.com/user-attachments/assets/e39c5746-7106-4a36-9a7e-01baccf351ff" />

dan subclass `Anjing`:

<img width="482" height="83" alt="image" src="https://github.com/user-attachments/assets/fc8e7cb6-5dd7-4b4a-a77a-f908931cc007" />

Pemanggilan polymorphism dilakukan pada class Service:

<img width="456" height="42" alt="image" src="https://github.com/user-attachments/assets/b47d1c17-59b6-4e34-9cff-99d1259e33f1" />


<img width="444" height="113" alt="image" src="https://github.com/user-attachments/assets/fc20397e-7da1-4411-9ddb-3e2246ec1ef6" />

Walaupun variabel menggunakan tipe Hewan, method yang dijalankan akan menyesuaikan objek sebenarnya.

Jika objek merupakan Kucing, maka tampilkanInfo() milik Kucing akan dijalankan.

Jika objek merupakan Anjing, maka tampilkanInfo() milik Anjing akan dijalankan.

Dengan demikian, program menerapkan polymorphism melalui method overriding.


