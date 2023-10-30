package Tugas2;
/**
 * Kelas ini menghitung luas permukaan tabung.
 */

class LuasTabung {

    /**
     * Menghitung luas permukaan tabung berdasarkan jari-jari dan tinggi.
     *
     * @param jariJari Jari-jari tabung.
     * @param tinggi   Tinggi tabung.
     * @return Luas permukaan tabung.
     */

    public double hitungLuasTabung(double jariJari, double tinggi) {
        // Luas permukaan tabung = 2 * luas alas + luas selimut
        double luasAlas = Math.PI * jariJari * jariJari; // Luas lingkaran (alas)
        double luasSelimut = 2 * Math.PI * jariJari * tinggi; // Luas selimut tabung
        return 2 * luasAlas + luasSelimut;
    }
    /**
     * Metode main untuk menguji perhitungan luas tabung.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */

    public static void main(String[] args) {
        double jariJari = 5.0; // Contoh jari-jari
        double tinggi = 10.0; // Contoh tinggi

        LuasTabung luasTabungCalculator = new LuasTabung();
        double luas = luasTabungCalculator.hitungLuasTabung(jariJari, tinggi);

        System.out.println("Luas permukaan tabung dengan jari-jari " + jariJari +
                " dan tinggi " + tinggi + " adalah: " + luas);
    }
}

