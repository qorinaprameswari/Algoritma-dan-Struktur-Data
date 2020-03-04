/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFDC;
/**
 *
 * @author Prameswari
 */
public class Fibonacci {
    public int FibonacciBF(int a){
        int b[];//O(1)
        b = new int [(int)a+2];//O(1)
        b[0] = 0;//O(1)
        b[1] = 1;//O(1)
        for(int i=2;i<=a;i++){//O(n)
            b[i] = b[i-1]+b[i-2];//O(1)
        }
        return b[(int)a];//O(1)
    }
    //Notasi Big O
    //O(1+1+1+1+n*1+1)
    //0(4+n+1)
    //O(n)
    public int FibonacciDC(int a){
        if(a<=0 || a<=1){//O(1)
            return a;//O(1)
        } else{
            return FibonacciDC(a-1)+ FibonacciDC(a-2);//O(k^n)
        }
    }
    //Notasi Big O
    //O(1+1+k^n)
    //O(k^n)
}
