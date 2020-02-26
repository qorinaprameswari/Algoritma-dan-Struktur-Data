/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class ProgramJajargenjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jajargenjang [] jg = new Jajargenjang[2];
        
        for(int a=0; a<2; a++){
            jg[a] = new Jajargenjang();
            System.out.println("Jajargenjang ke-"+a);
            System.out.print("Panjang Jajargenjang: ");
            jg[a].panjang = sc.nextDouble();
            System.out.print("Tinggi Jajargenjang: ");
            jg[a].tinggi = sc.nextDouble();
            System.out.print("Panjang Miring Jajargenjang: ");
            jg[a].miring = sc.nextDouble();
        }
        for(int a=0;a<2;a++){
            System.out.println("==========================================");
            System.out.println("Jajargenjang ke-"+a);
            System.out.println("Panjang Jajargenjang: "+jg[a].panjang);
            System.out.println("Tinggi Jajargenjang: "+jg[a].tinggi);
            System.out.println("Panjang Miring Jajargenjang: "+jg[a].miring);
            System.out.println("==========================================");
        }
        for(int a=0;a<2;a++){
            System.out.println("Luas Jajargenjang ke-"+a);
            jg[a].Luas();
            System.out.println("Keliling Jajargenjang ke-"+a);
            jg[a].Keliling();
        }
    }
    
}
