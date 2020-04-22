/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PEMESANAN TIKET KERETA API
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class TiketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pemesanan p = new Pemesanan();
        boolean status = true;
        
        while(status){
            System.out.println("====Menu Pemesanan Tiket====");
            System.out.println("1. Tambah Pemesanan Tiket");
            System.out.println("2. Hapus pesanan");
            System.out.println("3. Cari");
            System.out.println("4. Daftar pesanan Tiket");
            System.out.println("5. Keluar");
            System.out.println("Masukkan pilihan menu: ");
            int select = sc.nextInt();
            System.out.println();
            
            switch(select){
                case 1:
                    System.out.print("Nama \t\t: ");
                    String nm = sc.next();
                    System.out.print("NIK \t\t: ");
                    String nik = sc.next();
                    System.out.print("Harga total \t: ");
                    int total = sc.nextInt();
                    p.Enqueue(nm, nik, total);
                    break;
                case 2:
                    System.out.println("Pesanan Tiket selesai: ");
                    p.peek();
                    p.Dequeue(); 
                    break;
                case 3:
                    System.out.println("1. Cari antrian terdepan");
                    System.out.println("2. Cari antrian terakhir");
                    System.out.println("3. Cari berdasarkan urutan");
                    System.out.println("4. Cari berdasarkan nomor duduk");
                    System.out.println("Masukkan pilihan : ");
                    int sCari = sc.nextInt();
                    System.out.println();
                    if(sCari==1){
                        p.peek();
                    }else if(sCari==2){
                        p.peekRear();
                    }else if(sCari==3){
                        System.out.println("Masukkan Nomor Urut: ");
                        int u = sc.nextInt();
                        p.peekAt(u);
                    }else if(sCari==4){
                        System.out.println("Masukkan Nomor Duduk: ");
                        String nd = sc.next();
                        p.peekPosition(nd);
                    }else{
                        System.out.println("Inputan yang anda masukkan salah");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Pemesanan Tiket: ");
                    p.print();
                    break;
                case 5:
                    status = false;
                    break;
            }
            System.out.println("");
        }
    }
}
