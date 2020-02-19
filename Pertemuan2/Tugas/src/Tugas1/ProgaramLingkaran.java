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
public class ProgaramLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran L1 = new Lingkaran();
        
        System.out.println("Masukkan Jari-jari: ");
        L1.r = sc.nextInt();
        System.out.println("Luas Lingkaran: " +L1.hitungLuas());
        System.out.println("Keliling Lingkaran : " +L1.hitungKeliling());
   
        
    }
    
}
