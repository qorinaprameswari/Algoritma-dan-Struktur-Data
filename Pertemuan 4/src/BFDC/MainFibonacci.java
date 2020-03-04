/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFDC;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//O(1)
        Fibonacci fc = new Fibonacci();//O(1)
        
        System.out.print("Masukkan Range Nilai a: ");//O(1)
        int a = sc.nextInt();//O(1)
        for(int i=0;i<a;i++){//O(n)
            System.out.print(fc.FibonacciBF(i)+" , ");//O(1)
        }
        System.out.println();//O(1)
        for(int i=0;i<a;i++){//O(n)
            System.out.print(fc.FibonacciDC(i)+" , ");//O(1)
        }
        System.out.println();//O(1)
    }
    //Notasi Big 0
    //O(1+1+1+1+n*1+1+n*1+1)
    //O(6+2n)
    //O(n)
}
