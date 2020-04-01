/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainModifPrak1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ModifPrak1 tumpukan= new ModifPrak1(4);
        char status='y';
        while(status=='y'){
            System.out.print("Masukkan Kalimat: ");
            String nilai = sc.next();
            tumpukan.push(nilai); 
            System.out.print("Tambah Kalimat lagi? (y/t): ");
            status = sc.next().charAt(0);
            System.out.println("");
        }
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();        
    }
}
