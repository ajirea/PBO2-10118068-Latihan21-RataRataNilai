/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : program untuk menghitung rata-rata nilai berdasarkan
 * nilai nilai masukkan dan banyak mahasiswa
 */
public class PBO210118068Latihan21RataRataNilai {

    public static int nilai = 0;
    public static int banyakMhs;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMhs = scanner.nextInt();
        
        for(int i = 1; i <= banyakMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai += scanner.nextInt();
        }
        
        System.out.printf("%nMaka, Rata-rata Nilainya adalah %.1f%n",
                ((float)nilai/banyakMhs));
        System.out.println("Developed by : Satria Aji Putra");
    }
    
}
