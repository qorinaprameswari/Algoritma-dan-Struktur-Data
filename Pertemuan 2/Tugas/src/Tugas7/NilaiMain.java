/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class NilaiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int n = sc.nextInt();
        Nilai[] nl = new Nilai[n];
        
        for(int a=0;a<n;a++){
            nl[a] = new Nilai();
            System.out.println("Mahasiswa "+a);
            System.out.print("Nilai 1 : ");
            nl[a].nilai1 = sc.nextDouble();
            System.out.print("Nilai 2 : ");
            nl[a].nilai2 = sc.nextDouble();
            
        }
        for(int a=0;a<n;a++){
            System.out.print("Nilai Terbaik Mahasiswa "+a+" : ");
            nl[a].Nilai();
        }
        
    }
    
}
