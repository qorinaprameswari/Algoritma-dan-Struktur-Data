/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author Prameswari
 */
public class LinkedList {
    Node head;
    int size;
  
    public LinkedList(){
      head=null;
      size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int item){
        head = new Node(item, head);
        size++; 
    }
    public void add(int item, int index) throws Exception{
        if(index < 0 || index > size){
            throw new Exception("Nilai indek diluar batas");
        }
        if(isEmpty() || index== 0){
            addFirst(item);
        }else{
            Node tmp = head;
            for (int i=1;i<index;i++){
                tmp=tmp.next;
            }
            Node next= (tmp == null) ? null : tmp.next;
            tmp.next=new Node(item, next);
        }
        size++;
    }
    public void addLast(int item){
        if (isEmpty()){
            addFirst(item);
        }else{
            Node tmp=head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next=new Node(item, null);
        }
        size++;
    }
    public int getFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("LingkedList Kosong");
        }
        return head.data;
    }
    public int getLast() throws Exception{
        if(isEmpty()) {
            throw new Exception("LingkedList Kosong");
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get(int index)throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for ( int i=0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void remove(int index)throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        }else if(index == 0){
            removeFirst();
        }else{
            Node prev = head;
            Node cur = head.next;
            for (int i=1; i<index; i++){
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void removeFirst()throws Exception {
        head = head.next;
        size--;
    }
    public void clear(){
        head=null;
        size=0;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while(tmp != null){
                System.out.println(tmp.data+"\t");
                tmp=tmp.next;
        }
            System.out.println("");
        }else{
            System.out.println("LingkedList Kosong");
        }
    }
    public void addByValue(int item, int Cari){
        if(isEmpty()){
            System.out.println("LinkedList Kosong");
        }else{
            Node tmp = head;
            int ket = 0;
            while(tmp != null){
               if(tmp.data==Cari){
                ket=1;
                break;
            }
            tmp=tmp.next;
        }
        if(ket==0){
            System.out.println("Data tidak ditemukan");
        }else{
            Node tmpNext = tmp.next;
            tmp.next = new Node(item, tmpNext);
            size++;
            }
        }
    }
        public void removeByValue(int Cari)throws Exception{
        if(isEmpty()){
            throw new Exception("Nilai index di luar batas");
        }else{
            Node tmpCari = head;
            int index = 0;
            while(tmpCari !=  null){
                if(tmpCari.data == Cari){                    
                    break;
                }
                index++;
                tmpCari = tmpCari.next;
            }
            
            if(index == 0){
                removeFirst();
            } else{
                Node prev = head;
                                Node cur = head.next;
                for(int i=1; i<index; i++){
                    prev = cur;
                    cur = prev.next;
                }
                prev.next = cur.next;
                size--;
            }
        }
    }
    void ByValue(int n) {
    }
}

