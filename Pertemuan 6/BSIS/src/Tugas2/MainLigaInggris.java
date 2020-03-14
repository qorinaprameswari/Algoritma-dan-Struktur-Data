/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainLigaInggris {
    public static void main(String[] args) {
        DaftarLigaInggris dlg = new DaftarLigaInggris();
        LigaInggris[] LI = new LigaInggris[20];
        
        LI[0] = new LigaInggris("Liver Pool",29,45,82);
        LI[1] = new LigaInggris("Manchester City",27,39,57);
        LI[2] = new LigaInggris("Leicester",28,26,50);
        LI[3] = new LigaInggris("Chelsea",29,9,48);
        LI[4] = new LigaInggris("Wolverhampton Wanderers",29,7,43);
        LI[5] = new LigaInggris("Sheffield United",28,5,43);
        LI[6] = new LigaInggris("Manchester United",28,12,42);
        LI[7] = new LigaInggris("Tottenham Hotspur",29,7,41);
        LI[8] = new LigaInggris("Arsenal",28,4,40);
        LI[9] = new LigaInggris("Bumley",29,-6,39);
        LI[10] = new LigaInggris("Crystal Palace",29,-6,39);
        LI[11] = new LigaInggris("Everton",29,-6,37);
        LI[12] = new LigaInggris("Newcastle United",29,-16,35);
        LI[13] = new LigaInggris("Southampton",29,-17,34);
        LI[14] = new LigaInggris("Brigton & Hove Albion",29,-8,29);
        LI[15] = new LigaInggris("West Ham United",29,-15,27);
        LI[16] = new LigaInggris("Watford",29,-17,27);
        LI[17] = new LigaInggris("AFC Boumemouth",29,-18,27);
        LI[18] = new LigaInggris("Aston Villa",27,-18,25);
        LI[19] = new LigaInggris("Norwich City",29,-27,21);
        
        for(int a=0;a<20;a++){
            dlg.tambah(LI[a]);
        }
        System.out.println("Daftar Liga Inggris Sebelum Sorting ");
        dlg.tampil();
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Asc ");
        dlg.insertionsSortA();
        dlg.tampil();
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Desc");
        dlg.insertionSortB();
        dlg.tampil();

    }
    
}
