package perulangan;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class pertanyaan2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Masukkan Saldo :");
        int a=sc.nextInt();
        for(int i=1;i<13;i++){
            a=a+a*2/100;
        System.out.println("Saldo Bulan Ke-" + i +" : " +a);
        }
    }
}