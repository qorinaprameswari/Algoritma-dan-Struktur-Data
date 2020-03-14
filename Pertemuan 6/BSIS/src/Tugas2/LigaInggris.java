/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Prameswari
 */
public class LigaInggris {
    String nama;
    int jmlpoin;
    int agregat;
    int jmlMain;
    
    public LigaInggris(String n,int jp,int gd ,int jm){
        nama = n;
        jmlpoin = jp;
        agregat = gd;
        jmlMain = jm;
    }

    LigaInggris() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void tampil(){
        System.out.println("Nama Primier League: "+nama);
        System.out.println("Permainan: "+jmlMain);
        System.out.println("Agregat: "+agregat);
        System.out.println("Poin: "+jmlpoin);
    }
    
}
