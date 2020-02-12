package fungsi;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class pertanyaan2 {
    static int fibo(int a){
    if(a == 0 || a == 1){
      return a;
    } else {
      return (fibo(a-1) + fibo(a-2));
    }
  }
    public static void main(String[]args){
    int i, j = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah deret Bilangan Fibonacci: ");
    int n = sc.nextInt();
    System.out.print("Hasil Bilangan Fibonacci: ");
    for (i = 0; i < n; i++){
      System.out.print(fibo(j)+" ");
      j++;
    }
    System.out.println();
  }
}