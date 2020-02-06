/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasketiga;
import java.util.Scanner;
public class kalimat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = 0;
        int i = 0;
        int s = 0;
        int p = 0;
        char array[] ={'M','I','S','S','I','S','S','I','P','I'};
        
        for(int a=0; a<array.length;a++){
            if (array[a] == 'M'){
                m += 1;
            }else if (array[a] == 'I') {
                i +=1;  
            }else if (array[a] == 'S') {
                s +=1; 
            }else if (array[a] == 'P') {
                p +=1;  
            }else{
                
            }
        }
        System.out.println("Nilai M : "+m);
        System.out.println("Nilai I : "+i);
        System.out.println("Nilai S : "+s);
        System.out.println("Nilai P : "+p);
    }
}
