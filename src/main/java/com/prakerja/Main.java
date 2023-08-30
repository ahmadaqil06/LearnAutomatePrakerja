package com.prakerja;

import java.util.Scanner;

public class Main {

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");

        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan panjang alas segitiga: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = scanner.nextDouble();
            double luas = hitungLuasSegitiga(alas, tinggi);
            System.out.println("Luas segitiga: " + luas);
        } else if (pilihan == 2) {
            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = scanner.nextDouble();
            double luas = hitungLuasPersegiPanjang(panjang, lebar);
            System.out.println("Luas persegi panjang: " + luas);
        } else if (pilihan == 3) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();
            double luas = hitungLuasLingkaran(jariJari);
            System.out.println("Luas lingkaran: " + luas);
        } else {
            System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}