/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruteforce;

/**
 *
 * @author Prameswari
 */
public class Soal1 {
    private static void match(char[]text,char[]pattern){
        int cek = 0;
        int j;
        for(int i=0;i<text.length-pattern.length;i++){
            j=0;
            while(j<pattern.length && text[i+j] == pattern[j]){
                j++;
            }
            if(j>= pattern.length){
                cek++;
            }
        }
        if(cek>0){
            System.out.println("DATA COCOK");
        }else{
            System.out.println("DATA TIDAK COCOK");
        }
    } 
    public static void main(String[] args){
        char[]x = {'S','E','M'};
        char[]y = {'S','E','M','A','N','G','A','T'};
        match(y,x);
        
    }
    
    
}
