/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas8;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class TanahModifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah Tanah: ");
        int n = sc.nextInt();
        TanahModif[] tm =new TanahModif[n];
        
        for(int a=0;a<n;a++){
            tm[a] = new TanahModif();
            System.out.println("Tanah "+a);
            System.out.print("Panjang Tanah: ");
            tm[a].panjang = sc.nextInt();
            System.out.print("Lebar Tanah: ");
            tm[a].lebar = sc.nextInt();   
        }
        for(int a=0;a<n;a++){
            System.out.print("Luas Tanah "+a+" : ");
            tm[a].Luas();
        }
        double max = tm[0].luas;
        int x=0;
        for(int a=0;a<n;a++){
            if(tm[a].luas>max){
                max = tm[a].luas;
                x = a;
            }
        }
        System.out.println("Tanah Terluas : "+max);
        System.out.print("Yang terluas adalah tanah ke : "+x);
        System.out.println();
        
    }
    
}
