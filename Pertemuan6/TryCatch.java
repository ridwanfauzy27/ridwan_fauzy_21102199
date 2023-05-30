package com.Ridwan.PBO.Pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        int[] angka = {1,2,3,4,5};
        System.out.println(angka[6]);
        System.out.println("Akhir dari program");
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Index yang anda masukan melebihi batas");
    }
}
