/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainMahasiswa {
    public static void menu(){
        System.out.println("Menu dengan double linked list");
        System.out.println("===============================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Sorting");
        System.out.println("9. Keluar");
        System.out.println("===============================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa m = new Mahasiswa();
        boolean status = true;
        
        try{
            while(status){
                menu();
                System.out.print(">>");
                int menu = sc.nextInt();
                System.out.println("===============================");
                int nilai,ind;
                String nama;
                
                switch(menu){
                    case 1 :
                        System.out.println("Masukkan Data: ");
                        System.out.print("Nama Mahasiswa: ");
                        nama = sc.next();
                        System.out.print("Nilai Mahasiswa: ");
                        nilai=sc.nextInt();
                        m.addFirst(nilai, nama);
                        break;
                    case 2 :
                        System.out.println("Masukkan Data: ");
                        System.out.print("Nama Mahasiswa: ");
                        nama = sc.next();
                        System.out.print("Nilai Mahasiswa: ");
                        nilai = sc.nextInt();
                        m.addLast(nilai, nama);
                        break;
                    case 3 :
                        System.out.println("Masukkan Data: ");
                        System.out.print("Nama Mahasiswa: ");
                        nama = sc.next();
                        System.out.print("Nilai Mahasiswa: ");
                        nilai = sc.nextInt();
                        System.out.print("Masukkan index data: ");
                        ind = sc.nextInt();
                        m.add(nilai, nama, ind);
                        break; 
                    case 4 :
                        m.removeFirst();
                        break;
                    case 5 :
                        m.removeLast();
                        break;
                    case 6 :
                        System.out.print("Masukkan posisi indeks data: ");
                        ind = sc.nextInt();
                        m.remove(ind);
                        break;
                    case 7 :
                        m.print();
                        break;
                    case 8 :
                        m.sorting();
                        break;
                    case 9 :
                        status = false;
                    default :
                        System.out.println("Inputan salah"); break;
                }
                System.out.println("");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}