package perulangan;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class pertanyaan1 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan :");
        int a=sc.nextInt();
        for(int i=0;i<4;i++){
            a-=3;
            System.out.println(a);
        }
        System.out.println("Nilai Akhir : " +a);
        if(a%2==0){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }  
    }
}

    

