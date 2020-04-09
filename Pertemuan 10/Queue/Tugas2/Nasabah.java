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
public class Nasabah {
    String noRekening;
    String nama;
    public Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    } 
 
    void print(){
        System.out.println("Nama Nasabah : " + nama); 
        System.out.println("Nomor Rekening : " + noRekening); 
    }
    
}
