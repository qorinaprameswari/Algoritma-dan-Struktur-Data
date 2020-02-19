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
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Tanah: ");
        int n = sc.nextInt();
        Tanah [] tn = new Tanah[n];
        
        for(int a=0;a<n;a++){
            tn[a] = new Tanah();
            System.out.println("Tanah "+a);
            System.out.print("Panjang Tanah: ");
            tn[a].panjang = sc.nextDouble();
            System.out.print("Lebar Tanah: ");
            tn[a].lebar = sc.nextDouble();
        }
        for(int a=0;a<n;a++){
            System.out.println("Luas Tanahn ke-"+a);
            tn[a].Luas();
        }
        
    }
    
}
