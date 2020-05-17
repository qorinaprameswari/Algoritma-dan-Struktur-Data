/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int n = sc.nextInt();
        int[] data = new int[n];
        BinaryTreeArray bta = new BinaryTreeArray(data);
        for(int i=0;i<data.length; i++){
            System.out.print("Masukkan data ke-" + (i+1) + " : ");
            int dt = sc.nextInt();
            bta.add(dt, i);
            bta.updateData(data);
        }
        System.out.print("Pilih data digunakan sebagai root : ");
        int idxLast = sc.nextInt();
        bta.populateData(data, idxLast);
        System.out.print("In Order \t: ");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.print("Pre Order \t: ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.print("Post Order \t: ");
        bta.traversePostOrder(0);
        System.out.println("");
    } 
}