package com.Ridwan.PBO.Pertemuan4;

public class Manager extends Pegawai{

    public void bonus(int bonus){
        System.out.println("Pegawai dengan nama"+nama+"("+nip+") mendapat bonus sebesar Rp "+bonus);
    }
    public void extraInfo(){
        System.out.println("Jabatan Pegawai : Manager");
    }
    public void bonus(){
        System.out.println("Error : harap masukan jumlah bonusnya!");
    }
}
