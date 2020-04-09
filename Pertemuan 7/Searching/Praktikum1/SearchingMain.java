/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Prameswari
 */
public class SearchingMain {
    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};
        Searching pencarian = new Searching(data,8);
        System.out.println("==================================");
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("==================================");
        int cari = 30;
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        if(posisi != -1){
            System.out.println("Data: "+cari+" ditemukan pada indeks "+posisi);
        }else{
            System.out.println("Data: "+cari+"tidak ditemukan");
        }
    }
    
}
