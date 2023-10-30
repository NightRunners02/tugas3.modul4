package Tugas1;

import java.util.Scanner;

public class AutoCompleteAndTemplates {
    private double angka1;
    private double angka2;


    public AutoCompleteAndTemplates(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public double tambah() {
        return angka1 + angka2;
    }

    public double kurang() {
        return angka1 - angka2;
    }

    public double kali() {
        return angka1 * angka2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        AutoCompleteAndTemplates calculator = new AutoCompleteAndTemplates(angka1, angka2);

        System.out.println("Hasil Penambahan: " + calculator.tambah());
        System.out.println("Hasil Pengurangan: " + calculator.kurang());
        System.out.println("Hasil Perkalian: " + calculator.kali());
    }
}






