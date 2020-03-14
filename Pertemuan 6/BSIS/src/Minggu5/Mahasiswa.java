/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;

/**
 *
 * @author Prameswari
 */
public class Mahasiswa {
    String nama;
    int thnMasuk; int umur;
    double ipk;

    

    public Mahasiswa(String n,int t,int u,double i){
        nama = n;
        thnMasuk = t;
        umur =u;
        ipk = i;
    }

    Mahasiswa() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun Masuk = "+thnMasuk);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
    
}
