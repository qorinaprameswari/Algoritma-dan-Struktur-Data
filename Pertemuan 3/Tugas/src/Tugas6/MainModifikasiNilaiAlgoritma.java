/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainModifikasiNilaiAlgoritma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah mahasiswa : ");
        int n= sc.nextInt();
        
        ModifikasiNilaiAlgoritma arr= new ModifikasiNilaiAlgoritma(n);
        for(int i=0;i<n; i++){
            System.out.println("Masukkan nama mahasiswa " + (i+1) + " : ");
            arr.namaMhs[i]=sc.nextLine();
            System.out.print("Masukkan nilai : ");
            arr.rata[i] = sc.nextInt();
            System.out.println();
        }
        for(int i=0; i<arr.jmlh;i++){
            System.out.println("nilai " + arr.namaMhs[i]+" : "+ arr.rata[i]);
        }
        System.out.println();
        System.out.println("rata-rata nilai mahasiswa : "+ String.format("%.2f", arr.rataDC(arr.rata, 0, arr.jmlh)));
    }
    
}
