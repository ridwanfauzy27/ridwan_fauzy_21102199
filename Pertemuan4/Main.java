package com.Ridwan.PBO.Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Pegawai pegawai = new Pegawai();

        manager.nip = 181910024;
        manager.nama = "Basuki";

        pegawai.nip = 191220032;
        pegawai.nama = "Ahmad";

        manager.showInfo();
        manager.extraInfo();
        manager.bonus(1000000);

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
