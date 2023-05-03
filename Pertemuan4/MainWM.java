package com.Ridwan.PBO.Pertemuan4;

import java.util.Scanner;

public class MainWM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WarungMakan wm = new WarungMakan();
        Menu m = new Menu();
        Menu m1 = new Menu();
        Menu m2 = new Menu();
        Menu m3 = new Menu();

        wm.nama_warung = "Warung Tunggal Rasa";
        wm.alamat = "Puri Indah";
        wm.no_telp = "08522341234";

        m1.no_makanan = 1;
        m1.nama_makanan = "Nasi Goreng";
        m1.harga = 10000;
        m1.stok = 10;

        m2.no_makanan = 2;
        m2.nama_makanan = "Nasi Goreng Spesial";
        m2.harga = 15000;
        m2.stok = 4;

        m3.no_makanan = 3;
        m3.nama_makanan = "Nasi Goreng Spesial + Telur";
        m3.harga = 20000;
        m3.stok = 20;

        wm.detailWarung();
        m1.detaiMakanan();
        m2.detaiMakanan();
        m3.detaiMakanan();

        System.out.print("Masukan Nomor Makanan    : ");
        m.no_makanan = input.nextInt();
        if (m.no_makanan == 1) {

            System.out.print("Masukan Jumlah Pesanan : ");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalHarga();
            wm.cekStok(m1);

        } else if (m.no_makanan == 2) {
            System.out.print("Masukan Jumlah Pesanan : ");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalHarga();
            wm.cekStok(m2);

        } else if (m.no_makanan == 3) {
            System.out.print("Masukan Jumlah Pesanan : ");
            wm.beliMakanan(m3, input.nextInt());
            m3.totalHarga();
            wm.cekStok(m3);

        }

        input.close();
        }
}

