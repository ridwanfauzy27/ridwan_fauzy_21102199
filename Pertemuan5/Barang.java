package com.Ridwan.PBO.Pertemuan5;

public class Barang {
    String nama;
    int harga;
    public Barang(){}
    public Barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    //Method
    public void showInfo(){
        System.out.println("Nama Barang :" + this.nama);
        System.out.println("Harga Barang :" + this.harga);
        System.out.println();
    }
}
