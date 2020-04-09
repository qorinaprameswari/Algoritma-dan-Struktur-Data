/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainKalimatTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
               KalimatTerbalik stack =new KalimatTerbalik();
        
        String nilai[]={"","",""};
        System.out.print("Masukkan Kalimat: ");
        nilai[0]=sc.next();
        nilai[1]=sc.next();
        nilai[2]=sc.next();
        for(int i=0;i<nilai.length;i++){
            stack.push(nilai[i]);
    }
        stack.tampil();

    }
}
