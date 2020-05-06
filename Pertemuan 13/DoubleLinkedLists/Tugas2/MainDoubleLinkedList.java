/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainDoubleLinkedList {
    public static void menu(){
        System.out.println("DOUBLE LINK LIST DENGAN MENU");
        System.out.println("===============================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Sorting");
        System.out.println("10. Keluar");
        System.out.println("===============================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        boolean status = true;
        
        try{
           while(status){
               menu();
                System.out.print(">>");
                int menu = sc.nextInt();
                System.out.println("===============================");
                int data,ind;
                
                switch(menu){ 
                    case 1 :
                        System.out.print("Masukkan Data: ");
                        data = sc.nextInt();
                        dll.addFirst(data);
                        break;
                    case 2 :
                        System.out.print("Masukkan Data: ");
                        data = sc.nextInt();
                        dll.addLast(data);
                        break;
                    case 3 :
                        System.out.print("Masukkan Data: ");
                        data = sc.nextInt();
                        System.out.print("Masukkan posisi index data: ");
                        ind = sc.nextInt();
                        dll.add(data, ind);
                        break;
                    case 4 :
                        dll.removeFirst();
                        break;
                    case 5 :
                        dll.removeLast();
                        break;
                    case 6 :
                        System.out.print("Masukkan posisi indekx data: ");
                        ind = sc.nextInt();
                        dll.remove(ind);
                        break;
                    case 7 :
                        dll.print();
                        break;
                    case 8 :
                        System.out.print("Masukkan data yang ingin dicari: ");
                        data = sc.nextInt();
                        ind = dll.get(data); 
                        if(ind > -1){
                            System.out.println("Data: "+ data+"ditemukan pada indeks ke: "+ind);
                        }
                        else{
                            System.out.println("Data yang Anda cari tidak ada!");
                        }
                        break;
                    case 9 :
                        dll.sorting();
                        break;
                    case 10 :
                        status = false;
                        break;
                    default :
                        System.out.println("Inputan salah");
                        break;
                }
                System.out.println("");
            }
        }
        catch (Exception e){ 
            System.out.println(e.getMessage());
        }
    }
}