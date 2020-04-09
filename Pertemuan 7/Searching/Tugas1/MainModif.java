/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
/**
 *
 * @author Prameswari
 */
public class MainModif {
    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};
        Searching pencarian = new Searching(data, 8);
        
        System.out.println("isi Array : ");
        pencarian.TampilData();
        int cari = 30;
        System.out.println("=============================");
        int awal = 0;
        int akhir = data.length - 1;
        
        System.out.println("Sorting dengan Merge Sort");
        MergeSort mSort = new MergeSort();
        System.out.println("Data Awal");
        mSort.printArray(data, awal, akhir);
        mSort.mergeSort(data, awal, akhir);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data, awal, akhir);
        
        System.out.println("============================");
        System.out.println("Menggunakan Binary Search");
        int posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.Tampilposisi(cari, posisi);
    }    
}
