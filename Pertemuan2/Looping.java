package com.Ridwan.PBO.Pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Perulangan for ke-" + 1);
        }
        System.out.println("Selesai Perulangan for");

        int j = 0;
        while (j < 10) {
            System.out.println("Perulangan while ke-" + j);
            j++;
        }
        System.out.println("Selesai Perulangan while");

        int k = 0;
        do {
            System.out.println("Perulangan do-while ke-" + k);
            k++;
        } while (k < 10);
        System.out.println("Selesai Perulangan do-while");
    }
}
