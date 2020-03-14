/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        DaftarTiket dt = new DaftarTiket();
        int jmltiket = 4;
        
        for(int a=0;a<jmltiket;a++){
            System.out.print("Nama Maskapai\t: ");
            String maskapai = input.nextLine();
            System.out.print("Destination\t: ");
            String destination = input.nextLine();
            System.out.print("Harga Tiket\t: ");
            float harga = input1.nextFloat();
            System.out.print("Transit Count\t: ");
            int transitCount = input1.nextInt();
            System.out.print("Flight Time\t: ");
            int flightTime = input1.nextInt();
            
            Tiket t = new Tiket(maskapai,destination,harga,transitCount,flightTime);
            dt.tambah(t);
        }
        System.out.println("Data Mahasiswa Sebelum Sorting");
        dt.tampil();
        System.out.println("Data Mahasiswa Setelah sorting desc berdasarkan Harga");
        dt.bubbleSort();
        dt.tampil();
        System.out.println("Data Mahasiswa Setelah Sorting asc berdasar Harga ");
        dt.selectionSort();
        dt.tampil();
                
    }
}
