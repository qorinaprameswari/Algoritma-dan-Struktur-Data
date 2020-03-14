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
public class Tiket {
    String maskapai,destination;
    float harga;
    int transitCount;
    int flightTime;
    
    Tiket(String m,String d,float h,int t,int f){
        maskapai = m;
        destination=d;
        harga = h;
        transitCount = t;
        flightTime = f;
               
    }
    void tampil(){
        System.out.println("Nama Maskapai: "+maskapai);
        System.out.println("Destination: "+destination);
        System.out.println("Harga Tiket: "+harga);
        System.out.println("Transit Count: "+transitCount);
        System.out.println("Flight Time: "+flightTime);
        
    }
    
}
