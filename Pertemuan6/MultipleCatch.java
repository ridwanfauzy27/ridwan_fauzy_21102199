package com.Ridwan.PBO.Pertemuan6;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Masukkan angka : ");
            int angka1 = input.nextInt();

            System.out.println("Masukkan angka pembagi : ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil +" (Dibulatkan)");
        }
        catch (ArithmeticException | IndexOutOfBoundsException e){
            System.out.println("Error : " + e);
        }
        System.out.println("Akhir dari program");
    }
}
