/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Prameswari
 */
public class Mahasiswa {
    public String NIM, nama, alamatTinggal; 
    Mahasiswa next;

    public Mahasiswa(String NM, String nama, String alamatTinggal, Mahasiswa next){
        NIM = NM;
        this.nama = nama;
        this.alamatTinggal = alamatTinggal;
        this.next = next;
    }
    public void print(){
        System.out.println("NIM : "+NIM);
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamatTinggal);
    }
}
    