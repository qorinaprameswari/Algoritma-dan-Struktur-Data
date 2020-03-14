/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Prameswari
 */
public class DaftarLigaInggris {
    LigaInggris listLI[] = new LigaInggris[20];
    int idx;
    
    void tambah(LigaInggris li){
        if(idx<listLI.length){
            listLI[idx] = li;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil(){
        for(LigaInggris li : listLI){
            li.tampil();
            System.out.println("--------------------------");
        }
    }
    void insertionsSortA(){
        int a,b;
        for(a=1;a<listLI.length;a++){
            LigaInggris temp = new LigaInggris();
            temp = listLI[a];
            b =a;
            while((b>0) && (listLI[b-1].jmlpoin>temp.jmlpoin)){
                listLI[b]=listLI[b-1];
                b--;
            }
            listLI[b]=temp;
        }
    }
    void insertionSortB(){
        int a,b;
        for(a=1;a<listLI.length;a++){
            LigaInggris temp = new LigaInggris();
            temp = listLI[a];
            b =a;
            while((b>0) && (listLI[b-1].jmlpoin<temp.jmlpoin)){
                listLI[b]=listLI[b-1];
                b--;
            }
            listLI[b]=temp;
        }
    }
    
}
