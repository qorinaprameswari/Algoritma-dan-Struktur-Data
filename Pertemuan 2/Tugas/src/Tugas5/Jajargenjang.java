/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author Prameswari
 */
public class Jajargenjang {
    double panjang, tinggi,miring;
    double luas,keliling;
    
    void Luas(){
        luas = panjang * tinggi;
        System.out.println(luas);
    }
    void Keliling(){
        keliling = 2 *(panjang*miring);
        System.out.println(keliling);
    }
  
}
