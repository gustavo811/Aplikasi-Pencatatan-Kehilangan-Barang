# Aplikasi LostFOundApp
# LostFoundApp

## Deskripsi
Deskripsi Aplikasi

LostFoundApp merupakan aplikasi desktop berbasis bahasa pemrograman Java yang dirancang untuk membantu proses pencatatan dan pengelolaan data barang hilang. Aplikasi ini memungkinkan pengguna untuk memasukkan informasi barang yang hilang, menyimpannya secara permanen ke dalam file, serta menampilkan kembali data tersebut dalam bentuk daftar dan riwayat.

Aplikasi ini dibuat sebagai sarana pembelajaran konsep Object-Oriented Programming (OOP), penggunaan Java Swing untuk antarmuka grafis, serta penerapan file handling menggunakan format CSV sebagai media penyimpanan data.

##Tujuan Pengembangan

- Tujuan utama pengembangan LostFoundApp adalah:

- Menerapkan konsep OOP dalam pengembangan aplikasi Java

- Memahami penggunaan GUI berbasis Java Swing

- Mengimplementasikan proses baca dan tulis data ke file

- Membuat aplikasi desktop sederhana namun fungsional

## Fitur
- Input data barang hilang
- Menyimpan data ke file CSV
- Menampilkan daftar barang hilang

## Struktur Project
LostFoundApp
├── BarangHilang.java
├── DataManager.java
├── DashboardFrame.java
├── FormFrame.java
├── ListFrame.java
├── HistoryFrame.java
├── MainApp.java
└── data_barang_hilang.csv

## Cara Menjalankan
1. Buka project di IntelliJ IDEA
2. Jalankan class `MainApp`
3. Aplikasi akan tampil

## Teknologi
- Java
- Java Swing
- CSV

##Penjelasan Class

- MainApp
Merupakan class utama yang berfungsi sebagai titik awal (entry point) aplikasi. Class ini menjalankan aplikasi dengan memanggil tampilan dashboard.

= BarangHilang
Class model yang merepresentasikan data barang hilang. Class ini menyimpan atribut barang dan menyediakan method untuk mengonversi data ke format CSV.

- DataManager
Class yang bertanggung jawab dalam pengelolaan data, khususnya proses membaca data dari file CSV dan menyimpan data ke dalam file.

- DashboardFrame
Merupakan tampilan utama aplikasi yang berfungsi sebagai menu navigasi ke fitur lainnya.

- FormFrame
Digunakan sebagai form input data barang hilang oleh pengguna.

- ListFrame
Menampilkan daftar barang hilang yang tersimpan dalam sistem.

- HistoryFrame
Menampilkan riwayat data barang hilang yang telah dicatat.
