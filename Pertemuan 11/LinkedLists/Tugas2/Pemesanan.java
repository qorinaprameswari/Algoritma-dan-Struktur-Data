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
public class Pemesanan {
    int size;
     Tiket front,rear;

    public Pemesanan(){
        front=null;
        size=0;
    }
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
        System.out.println("Antrian terdepan: "); 
        front.cetak();
        } else{
            System.out.println("no duduk masih kosong");
        }
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("No duduk masih kosong");
        }else{
            Tiket tmp = front;
            while(tmp != null){
            tmp.cetak();
             tmp = tmp.next;
            }
            System.out.print("Jumlah no duduk = "+size);
        }
    }
    public void Enqueue(String nm, String nik, int harga){
        if(IsEmpty()){
            front = rear = new Tiket(nm, nik, harga, null);
        }else{
            Tiket tmp = front;
            while(tmp.next != null){
            tmp = tmp.next;
            }
            tmp.next = rear = new Tiket(nm, nik, harga, null);
        }
        size++;
    }
    public void Dequeue(){
        if(IsEmpty()){
            System.out.println("no duduk masih kosong");
        }else{
            Tiket temp = front; size--;
            if(IsEmpty()){
                front = rear = null;
            }else{
                front = temp.next;
            }
        }
    }
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Antrian paling belakang: ");
            rear.cetak();
        } else{
            System.out.println("no duduk masih kosong");
        }
    }
    public void peekPosition(String data){
        if(!IsEmpty()){
            int a=1;
            Tiket tmp = front;
            while(tmp.next != null){
                if(data.equalsIgnoreCase(tmp.noduduk)){
                    break;
                }
                a++;
                tmp = tmp.next;
            }
            System.out.println("no duduk "+data+" ada pada antrian ke-"+a+" : ");
            tmp.cetak();
        }
    }
    public void peekAt(int position){
        if(!IsEmpty()){
            int a=1;
            Tiket tmp = front;
            while(tmp.next != null){
                if(a==position){
                    break;
                }
                a++;
                tmp = tmp.next;
            }
            System.out.println("Data pada antrian ke-"+position+" : ");
            tmp.cetak();
        } else{
            System.out.println("Antrian masih kosong");
        }
    }
}
