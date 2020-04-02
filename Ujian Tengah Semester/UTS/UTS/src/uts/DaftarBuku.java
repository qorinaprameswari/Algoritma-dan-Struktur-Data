/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Prameswari
 */
public class DaftarBuku {
    Buku listbk[] = new Buku[4];
    int idx;
    public int[] data;
    public int jumData;
    public double tinggiBuku;
    int listBuku;
   
    

    DaftarBuku(int[] data, int i) {
       
    }

    DaftarBuku() {
         
    }
    
    void tambah(Buku b){
        if(idx<listbk.length){
            listbk[idx] = b;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil(){
        for(Buku bk : listbk){
            bk.tampil1();
            int jmlhBuku = 0;
            for (int i = 0; i < jmlhBuku; i++) {
            System.out.print(listbk[i] + " ");

        }
        System.out.println();
            System.out.println("--------------------------");
        }
    }
    void bubbleSortA(){
        for(int a=0;a<listbk.length-1;a++){
            for(int b=1;b<listbk.length-1;b++){
                if(listbk[b].jmlhBuku>listbk[b-1].jmlhBuku){
                    Buku tmp = listbk[b];
                    listbk[b] = listbk[b-1];
                    listbk[b-1] =tmp;
                }
            }
        }
    }
    void bubbleSortB(){
         for(int a=0;a<listbk.length-1;a++){
            for(int b=1;b<listbk.length-1;b++){
                if(listbk[b].jmlhBuku<listbk[b-1].jmlhBuku){
                    Buku tmp = listbk[b];
                    listbk[b] = listbk[b-1];
                    listbk[b-1] =tmp;
                }
            }
        }
    }
   public int BinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return BinarySearch(cari, left, mid - 1);
            } else {
                return BinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

   public void TampilData(){
     for(int i=0; i<jumData; i++){
       System.out.print(data[i] + " ");
     }
     System.out.println();
   }
   
   public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    int BinarySearch(int cari) {
        return 0;
        
    }
    
    
    
    }

