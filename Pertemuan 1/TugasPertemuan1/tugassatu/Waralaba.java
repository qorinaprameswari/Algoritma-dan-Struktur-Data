/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;
import java.util.Scanner;
public class Waralaba {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("SELAMAT DATANG DI RESTORAN WARALABA");
        System.out.println("=======================================");
        int menu,harga = 0,jumlah=0,total;
        System.out.println("Daftar Menu Paket");
        System.out.println("1.Paket Chiken");
        System.out.println("2.Paket Oke");
        System.out.print("Masukkan Pilihan = ");
        menu = input.nextInt();
        switch (menu){
            case 1 :
                System.out.println("1.Chiken A\tRp. 12.000");
                System.out.println("2.Chiken B\tRp. 15.000");
                System.out.println("3.Chiken C\tRp. 20.000");
                System.out.print("Masukkan Pilihan: ");
                menu = input.nextInt();
                System.out.print("Masukkan Jumlah Pesanan: ");
                jumlah = input.nextInt();
            switch (menu) {
                case 1:
                    harga = (int) 12000;
                    break;
                case 2:
                    harga = (int) 15000;
                    break;
                case 3:
                    harga = (int) 20000;
                    break;
                default:
                    System.out.println("Tidak Tersedia Menu Lain");
                    break;
            }
                total = harga*jumlah;
                System.out.println("Total Pembayaran :Rp. "+total);
                break;

            case 2 :
                System.out.println("1.Oke A\tRp. 10.000");
                System.out.println("2.Oke B\tRp. 12.000");
                System.out.println("3.Oke C\tRp. 15.000");
                System.out.print("Masukkan Pilihan: ");
                menu = input.nextInt();
                System.out.print("Masukkan Jumlah Pesanan: ");
                jumlah = input.nextInt();
            switch (menu) {
                case 1:
                    harga = (int) 10000;
                    break;
                case 2:
                    harga = (int) 12000;
                    break;
                case 3:
                    harga = (int) 15000;
                    break;
                default:
                    System.out.println("Tidak Tersedia Menu Lain");
                    break;
            }
                total = harga*jumlah;
                System.out.println("Total Pembayaran :Rp. "+total);
                break;
        }
    }
}


