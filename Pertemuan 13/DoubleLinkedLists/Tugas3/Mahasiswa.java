/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Prameswari
 */
public class Mahasiswa {
    Node head;
    int size;

    public Mahasiswa(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int nilai, String nama){ 
        if(isEmpty()){
            head = new Node(null,nilai,nama,null);
        }else{
            Node newNode = new Node(null, nilai, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int nilai, String nama){
        if(isEmpty()){
            addFirst(nilai, nama);
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, nilai, nama, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int nilai,String nama, int index)throws Exception{
        if(isEmpty()){
            addFirst(nilai, nama);
        }else if (index <0 || index > size){
            throw new Exception("Nilai index diluar batas");
        }else{
            Node current = head;
            int i=0;
            while (i<index){
                current =current.next;
                i++;
            }
            if(current.prev==null){
                Node newNode = new Node(null, nilai, nama, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, nilai, nama, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public void removeFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong tidak daopat dihapus!");
        }else if(size == 1){
            removeLast();
        }else{
          head = head.next;
          head.prev = null;
          size--;  
        }
    }
    public void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if(head.next == null){
            head =null;
            size--; 
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index)throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        }else if(index == 0){
            removeFirst();
        }else{
            Node current = head;
            int i=0;
            while(i<index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev= null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void sorting(){
        Node tmp = null, id = null;
        int tmpNilai = 0;
        String tmpNama;
        for(tmp=head; tmp.next!=null; tmp=tmp.next){
            for(id=tmp.next; id!=null; id=id.next){
                if(tmp.nilai < id.nilai){
                    tmpNilai = tmp.nilai;
                    tmpNama = tmp.nama;
                    tmp.nilai = id.nilai;
                    tmp.nama = id.nama;
                    id.nilai = tmpNilai;
                    id.nama = tmpNama;
                }
            }
        }
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while(tmp != null){
                System.out.println("Nama Mahasiswa: "+tmp.nama);
                System.out.println("Nilai Mahasiswa: "+tmp.nilai);
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked List Kososng");
        }
    }
}
