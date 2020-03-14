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
public class DaftarTiket {
    Tiket listTiket[] = new Tiket[4];
    int idx;
    
    void tambah(Tiket t){
        if(idx<listTiket.length){
            listTiket[idx] = t;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
        
    }
    void tampil(){
        for(Tiket t : listTiket){
            t.tampil();
            System.out.println("--------------------------");
        }
    }
    void bubbleSort(){
        for(int a=0;a<listTiket.length-1;a++){
            for(int b=1;b<listTiket.length-1;b++){
                if(listTiket[b].harga<listTiket[b-1].harga){
                    Tiket tmp = listTiket[b];
                    listTiket[b] = listTiket[b-1];
                    listTiket[b-1] =tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int a=0;a<listTiket.length-1;a++){
            int idxmin =a;
            for(int b=a+1;b<listTiket.length;b++){
                if(listTiket[b].harga<listTiket[idxmin].harga){
                    idxmin=b;
                }
            }
            Tiket tmp = listTiket[idxmin];
            listTiket[idxmin] = listTiket[a];
            listTiket[a]=tmp;
        }
    }
    
}
