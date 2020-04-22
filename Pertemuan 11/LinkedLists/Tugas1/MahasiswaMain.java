/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MahasiswaMain {
    public static void menu(){
        System.out.println("=========DAFTAR MAHASISWA========");
        System.out.println("1. Tambah data");
        System.out.println("2. Hapus data");
        System.out.println("3. Pencarian data");
        System.out.println("4. Daftar Mahasiswa");
        System.out.println("5. EXIT");
        System.out.print("Masukkan menu yang anda pilih : ");
    }
    public static void hapus(){
        System.out.println("1. Index");
        System.out.println("2. Keyboard");
        System.out.println("3. Clear");
        System.out.println("Masukkan pilihan menu yang anda inginkan: ");
    }
    public static void mencari(){
        System.out.println("1. Index");
        System.out.println("2. Keyboard");
        System.out.println("Masukkan pilihan menu yang anda inginkan: ");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        DaftarMahasiswa mhs=new DaftarMahasiswa();
        
        try{
            boolean x = true;
            while(x){
                menu();
                int pilih = sc.nextInt();
                System.out.println();
                int i =0;
                switch(pilih){
                    case 1:
                        String nim,nama,alamat;
                        System.out.print("Masukkan NIM\t\t: ");
                        nim = sc.next();
                        System.out.print("Masukkan Nama\t\t: ");
                        nama = sc.next();
                        System.out.print("Masukkan Alamat\t\t: ");
                        alamat = sc.next();
                        System.out.println("");
                        mhs.add(nim,nama,alamat);
                        break;
                    case 2:
                        hapus();
                        i = sc.nextInt();
                        System.out.println();
                        if(i==1){
                            System.out.println("====Hapus Index====");
                            System.out.print("Masukkan Index: ");
                            int n = sc.nextInt();
                            mhs.remove(n);
                        }else if(i==2){
                            System.out.println("====Hapus Value====");
                            System.out.print("Masukkan NIM: ");
                            String n = sc.next();
                            int cari = mhs.cari(n);
                            mhs.remove(n);
                        }else if(i==3){
                            mhs.clear();
                        }else{
                            System.out.println("Inputan yang anda masukkan salah");
                        }
                        System.out.println("");
                        break;
                    case 3:
                        mencari();
                        i = sc.nextInt();
                        System.out.println();
                        if(i==1){
                            System.out.println("====Cari Index====");
                            System.out.print("Masukkan Index: ");
                            int n = sc.nextInt();
                            mhs.get(n);
                        }else if(i==2){
                            System.out.println("====Cari NIM====");
                            System.out.print("Masukkan NIM: ");
                            String n = sc.next();
                            int cari = mhs.cari(n);
                            mhs.get(cari);
                        }else{
                            System.out.println("Inputan yang anda masukkan salah");
                        }
                        System.out.println("");
                        break;
                    case 4:
                        mhs.print();
                        System.out.println("");
                        break;
                    case 5:
                        x = false;
                        break;
                }  
            }
            
        }
        catch(Exception e){
                    System.out.println(e.getMessage());
         }
    }
}    
 