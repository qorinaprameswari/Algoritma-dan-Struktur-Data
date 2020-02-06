/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskelima;
import java.util.Scanner;
public class luasBidang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1.Menghitung Luas Segitiga");
            System.out.println("2.Menghitung Luas Segiempat");
            System.out.println("3.Menghitung Luas Lingkaran");
            System.out.println("4.Berhenti");
            System.out.println("Pilihan Menu: ");
            menu = sc.nextInt();
            switch(menu){
                case 1 :
                    LuasSegitiga();
                    break;
                case 2 :
                    LuasSegiempat();
                    break;
                case 3 :
                    LuasLingkaran();
                    break;
                case 4 :
                    System.out.println("Penghitungan Telah Selesai");
                default :
                    System.out.println("Menu tidak tersedia");
        
            }
        } while(menu !=4);
    }
    static void LuasSegitiga(){
        Scanner sc = new Scanner(System.in);
        double luas,alas,tinggi;
        System.out.print("Masukkan alas Segitiga: ");
        alas = sc.nextLong();
        System.out.println("Masukkan Tinggi : ");
        tinggi = sc.nextLong();
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = "+luas);
    }
    static void LuasSegiempat(){
        Scanner sc = new Scanner(System.in);
        int sisi,luas;
        System.out.println("Masukkan Sisi: ");
        sisi = sc.nextInt();
        luas = sisi * sisi;
        System.out.println("LuasSegiempat: "+luas);
    }
    static void LuasLingkaran(){
        Scanner sc = new Scanner(System.in);
        double jari2,luas;
        System.out.println("Masukkan jari2 : ");
        jari2 = sc.nextLong();
        luas  = 3.14 *(jari2*jari2);
        System.out.println("Luas Lingkaran : "+luas);
    }
}
