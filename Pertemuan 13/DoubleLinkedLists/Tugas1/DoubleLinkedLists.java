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
public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int data){
        if(isEmpty()){
            head= new Node(null, data, null);
        }else{
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int data){
        if(isEmpty()){
            addFirst(data);
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int data, int index)throws Exception{
        if(isEmpty()){
            addFirst(data);
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
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while(  tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void removeFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if(size == 1){
            removeLast();
        }else{
            head = head.next; head.prev = null;
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
    public int get(int data){
        Node tmp =  head;
        int index = -1;
        while(tmp != null){
            index++;
            if(tmp.data == data){
                break;
            }
            tmp = tmp.next;
        }
        return index;
    }
}

