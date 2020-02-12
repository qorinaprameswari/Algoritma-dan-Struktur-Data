package array;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class pertanyaan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] array1=new int[4][5];
        int total=0;
       
        for(int a=0;a<4;a++){
            for(int b=0;b<5;b++){
               System.out.print("Masukkan array ke-["+a+"]["+b+"] : ");
               array1[a][b]=sc.nextInt();
               total+=array1[a][b];
           }
           System.out.println("Total: "+total);
       }
    }
}
