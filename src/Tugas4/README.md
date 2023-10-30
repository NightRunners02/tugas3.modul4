# Luas Permukaan Tabung Calculator

Kelas ini menyediakan perhitungan luas permukaan tabung berdasarkan jari-jari dan tinggi yang diberikan.

## Deskripsi

Kelas `LuasTabung` memiliki metode `hitungLuasTabung` yang memungkinkan perhitungan luas permukaan tabung berdasarkan rumus matematis yang sesuai. Jari-jari dan tinggi diperlukan sebagai parameter untuk menghitung luas permukaan tabung.

## Cara Menggunakan

Untuk menggunakan kelas `LuasTabung`:

1. Inisialisasi objek `LuasTabung`.
2. Panggil metode `hitungLuasTabung` dengan memberikan nilai jari-jari dan tinggi tabung.
3. Method `hitungLuasTabung` akan mengembalikan nilai luas permukaan tabung berdasarkan parameter yang diberikan.

Contoh penggunaan:

```java
double jariJari = 5.0; // Isi dengan jari-jari tabung
double tinggi = 10.0; // Isi dengan tinggi tabung

LuasTabung luasTabungCalculator = new LuasTabung();
double luas = luasTabungCalculator.hitungLuasTabung(jariJari, tinggi);

System.out.println("Luas permukaan tabung dengan jari-jari " + jariJari +
        " dan tinggi " + tinggi + " adalah: " + luas);
