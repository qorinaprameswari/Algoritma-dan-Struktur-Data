package array;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class pertanyaan1 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int []array = new int[15];
    
    for(int i=0;i<array.length;i++){
        System.out.print("Masukkan Angka :");
        array[i]=sc.nextInt();
    }
    System.out.println("Bilangan Genap");
    for(int i=0;i<array.length;i++){
        if(array[i]%2==0){
        System.out.print(array[i]);
        System.out.println(" ");
        }
    }
    System.out.println("Bilangan Ganjil");
    for (int i = 0; i <array.length; i++) {
        if(array[i]%2==1){
        System.out.print(array[i]);
        System.out.println(" ");
        }
    }
    System.out.println();
    }
}
    