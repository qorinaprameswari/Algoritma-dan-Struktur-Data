/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu1;

import minggu2.Barang;

/**
 *
 * @author Prameswari
 */
public class BarangMain {
    public static void main(String[] args){
        Barang b1 = new Barang();// untuk menampilkan import tekan alt + enter
        
        
        b1.namaBarang = "Consair 2 GB";
        b1.jenisBarang = "DDR";
        b1.stok = 10;
        b1.hargaSatuan = 25000;
        
        b1.tambahStok(1);
        b1.kurangStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 Buah : " +hargaTotal);
        
        Barang b2 = new Barang("Logitech","Wireless Mouse",15000,25);
        b2.tampilBarang();
    }
}
