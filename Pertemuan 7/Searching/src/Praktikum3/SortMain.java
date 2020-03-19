/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

/**
 *
 * @author Prameswari
 */
public class SortMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        int awal = 0;
        int akhir = data.length - 1;
        System.out.println("Sorting dengan Merge Sort");
        MergeSorting mSort = new MergeSorting();
        System.out.println("Data Awal");
        mSort.printArray(data, awal, akhir);
        mSort.mergeSort(data, awal, akhir);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data, awal, akhir);
    }
    
}
