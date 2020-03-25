/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainSequentialSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = {
        {45, 78, 7, 200, 80},
        {90, 1, 17, 100, 50},
        {21, 2, 40, 18, 65}
        };
        
        SequentialSearch pencarian = new SequentialSearch(data, 3, 5);
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = sc.nextInt();
        
        System.out.println("==============================");
        System.out.println("Menggunakan Sequential Search");
        System.out.println("==============================");
        pencarian.FindSeqSearch(cari);
        if(pencarian.brs != -1 && pencarian.klm != -1){
            System.out.println("Data : " + cari + " ditemukan pada indeks ke-(" + pencarian.brs + ", " + pencarian.klm + ")");
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }
}
