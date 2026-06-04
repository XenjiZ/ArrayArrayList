/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian1.array;

/**
 *
 * @author ninja
 */
public class LatihanMandiri {
    public static void main(String[] args) {
        double[] suhu = {70,60,50,40,30,20};
        System.out.println("Suhu Tertinggi : " + suhu[0] + " Suhu Terendah : " + suhu[5]);
        String[] hari = {"Senin", "Selasa","Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        System.out.println("Hari Lebih Dari 5 Huruf Adalah : " +  hari.length);
        if (hari.length > 5) {
            System.out.println(hari[1] + hari[6]);
        }
        
        else {
           System.out.println(hari[0] + hari[2] + hari[4] + hari[5] + hari[3]);
            }
        
        
        int[] angka = {4, 8, 15, 16, 23, 42};
         for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                System.out.println(angka[i]);
            }
        
    }
}
}
