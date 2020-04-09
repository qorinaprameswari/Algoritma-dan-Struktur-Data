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
public class ModifQueue {
     int max;
    int size;
    int front;
    int rear;
    int[] Q;
    
    public ModifQueue(int n){
        max = n;
        Create();
    }
    public void Create(){
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan: "+ Q[front]);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.print(Q[i]+" ");
                i = (i+1) % max;
            }
            System.out.println(Q[i]+" ");
            System.out.println("Jumlah Antrian = "+size);
        }
    }
    public void Enqueue(int data){
        if(IsFull()){
            System.out.println("Antrian sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max - 1){
                    rear =0;
                }else{
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    public int Dequeue(){
        int data =0;
        if(IsEmpty()){
            System.out.println("Antrian masih  kosong");
        }else{
            data = Q[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen paling belakang"+Q[rear]);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
     void peekPosition(int data){
        int count = 0;
        if(IsEmpty()){
            System.out.println("Antrian Kosong!");
        }else{
            int i = front;
            while(i!=rear){
                count++;
                if(data == Q[i]){
                    System.out.println("Data berada dalam Posisi : " + count);
                    break;
                }
                i = (i + 1) % max;
            }
        }
    }
    void peekAt(int position){
        boolean findIt = false;
        if (position > max) {
            System.out.println("( \"" + position + "\" melebihi jumlah antrian )");
        } else {
            if (IsEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                System.out.println("\nHasil pencarian antrian \"" + position + "\"");
                if (position == rear) {
                    System.out.println(Q[rear]);
                    findIt = true;
                } else {
                    for (int i = front; i != rear; i = (i + 1) % max) {
                        if (position == i) {
                            System.out.println(Q[i]);
                            findIt = true;
                        }
                    }
                }
            }
        }
        if (findIt == false) {
            System.out.println("\n<< Antrian \'" + position + "\'tidak tersedia. >>");
        }
    }
}
