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
public class Tiket {
    String nama, NIK, noduduk; int harga;
    Tiket next;

    public Tiket(String nm, String nik, int hrg, Tiket next){
        nama = nm;
        NIK = nik;
        harga = hrg;
        this.next=next;
    }
    public void cetak(){
        System.out.println("Nama\t: "+nama);
        System.out.println("NIK\t: "+NIK);
        System.out.println("Harga\t: "+harga);
        System.out.println();
    } 
}
