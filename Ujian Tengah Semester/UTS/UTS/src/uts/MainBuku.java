/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        DaftarBuku bk = new DaftarBuku();
        int jmlhBuku = 4;
        int[] data = null;
        DaftarBuku pencarian = new DaftarBuku(data, 8);
        System.out.println("Isi Array : ");
        
        
        for(int a=0;a<4;a++){
            System.out.print("Judul Buku\t: ");
            String judul = input.nextLine();
            input.nextLine();
            System.out.print("Jumlah Halaman\t: ");
            jmlhBuku = input1.nextInt();
            System.out.print("Ukuran Buku\t: ");
            double tinggiBuku = input.nextDouble();   
        }
        System.out.println("Data Mahasiswa Sebelum Sorting");
        bk.tampil();
        System.out.println("Data Mahasiswa Setelah sorting desc berdasarkan Jumlah Halaman: ");
        bk.bubbleSortA();
        bk.tampil();
        System.out.println("Data Mahasiswa Setelah Sorting asc berdasar Harga Jumlah Halaman: ");
        bk.bubbleSortB();
        bk.tampil();
     
        System.out.print("Judul yang ingin dicari : ");
        int cari = input.nextInt();
        int posisi = pencarian.BinarySearch(cari);

        pencarian.TampilPosisi(cari, posisi);
        System.out.println("=================================");
        System.out.println("Menggunakan binary search");
        posisi = pencarian.BinarySearch(cari, 0, data.length - 1);
        pencarian.TampilPosisi(cari, posisi); 
            }
        }
        
    
        

    


