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
public class KalimatTerbalik {
    public int size=3;
    public int top=-1;
    public String data[]=new String[3];
    
    public boolean IsFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(String dt){
        if(!IsFull()){
            top++;
            data[top]=dt;
        }else{
            System.out.println("Isis Stack Penuh!");
        }
    }
    public void tampil(){
        System.out.print("Kaimat Terbalik: ");
        for(int i=top;i>=0;i--){
            System.out.print(data[i]+" ");
        }
        System.out.println("");

}
}
