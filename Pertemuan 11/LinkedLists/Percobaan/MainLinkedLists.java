/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainLinkedLists {
    public static void menu(){
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Cari");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
        }
        public static void subMenuTambah(){
            System.out.println("1. First");
            System.out.println("2. Index");
            System.out.println("3. Last");
            System.out.print("Masukkan pilihan : ");
        }
        public static void subMenuHapus(){
            System.out.println("1. Index");
            System.out.println("2. Key");
            System.out.println("3. Clear");
            System.out.print("Masukkan pilihan : ");
        }
        public static void subMenuCari(){
            System.out.println("1. Index");
            System.out.println("2. Key");
            System.out.print("Masukkan pilihan : ");
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList data = new LinkedList();
        
        try{
          boolean x = true;
          while(x){
              menu();
              int pilih = sc.nextInt();
              int i =0;
                switch(pilih){
                  case 1:
                      subMenuTambah();
                      i = sc.nextInt();
                      if(i==1){
                          System.out.print("Masukkan nilai: ");
                          int n = sc.nextInt();
                          data.addFirst(n);
                      }else if(i==2){
                          System.out.print("Nilai yang cari: ");
                          int c = sc.nextInt();
                          System.out.print("Masukkan nilai: ");
                          int n = sc.nextInt();
                          data.addByValue(n, c);
                      }else if(i==3){
                          System.out.print("Masukkan nilai: ");
                          int n = sc.nextInt();
                          data.addLast(n);
                      }else{
                          System.out.println("Inputan yang anda masukkan salah");
                      }
                      break; 
                      
                  case 2:
                      subMenuHapus();
                      i =sc.nextInt();                      
                      if(i==1){
                          System.out.print("Masukkan index: ");
                          int n = sc.nextInt();
                          data.remove(n);
                    }else if(i==2){
                          System.out.print("Masukkan nilai: ");
                          int n = sc.nextInt();
                          data.removeByValue(n);
                      }else if(i==3){
                          data.clear();
                      }else{
                          System.out.println("Inputan yang anda masukkan salah");
                      }
                      break;
                      
                  case 3:
                      subMenuCari();
                      i =sc.nextInt();                      
                      if(i==1){
                          System.out.print("Masukkan index: ");
                          int n = sc.nextInt();
                          data.get(n);
                      }else if(i==2){
                          System.out.print("Masukkan nilai: ");
                          int n = sc.nextInt();
                          data.ByValue(n);
                      }else{
                          System.out.println("Inputan yang anda massukkan salah");
                      }
                      break;  
                  case 4:
                      x = false;
                      break;
                    }
                }
          data.addFirst(7);
          data.addFirst(2);
          data.addFirst(1);
          data.print();
            
          System.out.print("Nilai yang dicari : ");
          int dicari=sc.nextInt();
          data.removeByValue(dicari);
          data.print();
          System.out.print("Nilai yang ingin di tambahkan : ");
          int tambah=sc.nextInt();
          data.addByValue(tambah, dicari);
          data.print();

          data.add(8, 1);
          data.print();
          data.addFirst(1);
          data.print();
          data.remove(1);
          data.print();
          data.clear();
          data.print();
                }catch (Exception e){
                  System.out.println(e.getMessage());
        }
    }
}