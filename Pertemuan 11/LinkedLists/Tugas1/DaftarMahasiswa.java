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
public class DaftarMahasiswa {
    Mahasiswa head;
    int size;
    
    public DaftarMahasiswa(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void add(String NM, String nama, String alamatTinggal){
        if(isEmpty()){
            head =  new Mahasiswa(NM,nama,alamatTinggal,head);
        }else{
            Mahasiswa tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new Mahasiswa(NM,nama,alamatTinggal,null);
        }
        size++;
    }
    public int cari(String valCari){
        int index = 1;
        if(isEmpty()){
            System.out.println("LinkedList Kosong");
        }else{
            Mahasiswa tmp = head;
            while(tmp != null){
                if(valCari.equalsIgnoreCase(tmp.NIM)){
                    break;
                }
                index++;
                tmp = tmp.next;
            }
        }
        return index;
    }
    public void getFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("LinkedLists Kosong");
        }else{
            head.print();
        }
    }
    public void getLast()throws Exception{
        if(isEmpty()){
            throw new Exception("LinkedList Kosong");
        }else{
            Mahasiswa tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;  
            }
            tmp.print();
        }
    }
    public void get(int index)throws Exception{
        if(isEmpty() || index > size){
            throw new Exception("Nilai index di luar batas");
        }else{
            int i=1;
            Mahasiswa tmp = head;
            while(tmp.next != null){
                if(i == index){
                    break;
                }
                i++;
                tmp = tmp.next;
            }
            tmp.print();
        }
    }
    public void remove(int index)throws Exception{
        if(isEmpty() || index > size){
            throw new Exception("Nilai index luas batas");
        }else if(index == 1){
            head = head.next;
            size--;
        }else{
            Mahasiswa prev = head;
            Mahasiswa cur = head.next;
            for(int i=2; i<index;i++){
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if(!isEmpty()){
            Mahasiswa tmp = head;
            while(tmp != null){
                tmp.print();
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("LinkedLists Kosong");
        }
    }

    void remove(String n) {
    }
}
