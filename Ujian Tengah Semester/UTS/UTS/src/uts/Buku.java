/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Prameswari
 */
public class Buku {
    public String judul;
    public int jmlhBuku;
    public double tinggiBuku;
    
    public Buku(String j,int jml,double t){
        j = judul;
        jml = jmlhBuku;
        t = tinggiBuku;
    }

    public void tampil1(){
        System.out.println("Judul Buku: "+judul);
        System.out.println("Jumlah Halaman: "+jmlhBuku);
        System.out.println("Ukuran Buku: "+tinggiBuku);
        
}
}
