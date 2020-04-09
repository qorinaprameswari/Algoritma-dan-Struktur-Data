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
public class Nasabah2 {
    int max, front, size, rear;
    Nasabah[] q;
    
        
    public Nasabah2(int m) {
        max = m;
        create();
    } 
    void create(){
        q = new Nasabah [max]; 
        size = 0;
        front = rear = -1;
    } 
 
    boolean isEmpty(){
        if (size == 0)
            return true;
        else 
            return false;
    } 
 
    boolean isFull(){
        if(size == max)
            return true; 
        else 
            return false;
    } 
 
    void enqueue(Nasabah nas){
        if(isFull()){
            System.out.println("Antrian sudah penuh!!");
        }else{
            if (isEmpty()){                 
                front = rear = 0;             
            }else{                 
                if(rear == max-1){                     
                    rear = 0;                 
                }else {                     
                    rear++;                 
                }             
            }             
            q[rear] = nas;             
            size++;
        }     
    } 
 
    Nasabah dequeue(){         
        Nasabah nas = null;         
        if(isEmpty()){             
            System.out.println("Antrian Kosong!");         
        }else{             
            nas = q[front];             
            size--;             
            if(isEmpty()){                 
                front = rear = -1;             
            }else{
                if(front == max -1){    
                    front = 0;      
                }else{   
                    front++;   
                }     
            }  
        }    
        return nas;
    } 
 
    void print(){
        if(isEmpty()){ 
            System.out.println("Antrian kosong!");   
        }else{   
            int i = front;
            while(i!=rear){  
                System.out.println(q[i].nama +" "+ q[i].noRekening); 
                i = (i+1)%max;      
            }
            System.out.println(q[i].nama + " " + q[i].noRekening);    
            System.out.println("Jumlah Antrian = " + size);  
        }  
    } 
 
    void printFront(){  
        int i = front;    
        System.out.println("Data Terdepan adalah : " + q[i].nama + " " +q[i].noRekening); 
    } 
 
    void printRear(){  
        int i = rear;    
        System.out.println("Data Terbelakang adalah : " + q[i].nama + " " +q[i].noRekening);} 
 
    void printPosition(String data){  
        int count =0;     
        if(isEmpty()){   
            System.out.println("Antrian kosong!");    
        }else{     
            int i = front;  
            while(i!=rear){   
                count++;     
                if (data.equalsIgnoreCase(q[i].nama)){   
                    System.out.println("Data berada dalam Posisi: " +count);
                    break;                 
                }                 
                i = (i+1)%max;             
            }                 
            System.out.println(q[i].nama + " " + q[i].noRekening);} 
    } 
 
    void printNasabah(int position){     
        int count =0;   
        if(isEmpty()){  
            System.out.println("Antrian kosong!");    
        }else{
            int i = front;  
            while(i!=rear){   
                count++;   
                if (position == count){    
                    System.out.println("Posisi ke -" + (i+1) + " : " +q[i].nama + " " + q[i].noRekening);
                    break;     
                }  
                i = (i+1)%max;
            }
            System.out.println(q[i].nama + " " + q[i].noRekening);   
        } 
    }    
}
  
