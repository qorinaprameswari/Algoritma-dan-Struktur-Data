/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideconquer;

/**
 *
 * @author Prameswari
 */
public class Soal2 {
    private static void DevideConquer(int numDisc,char source,char destination,char spare){
        if(numDisc == 1){
            System.out.println("Pindah Gelang 1 Dari Tower "+source+" Ke Tower "+destination);
            return;
        }
        DevideConquer(numDisc-1,source,spare,destination);
        System.out.println("Pindah Gelang "+numDisc+" Dari Tower "+source+" Ke Tower "+destination);
        DevideConquer(numDisc-1,spare,destination,source);
    }
    public static void main(String[] args){
        int n=4;
        DevideConquer(n,'A','C','B');
    }
}
