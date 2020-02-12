package fungsi;
/**
 *
 * @author Prameswari
 */
public class pertanyaan1 {
    static void deret(){            
    int [] arr=new int [5];
    arr[0]=0;
    arr[1]=1;
    
    for(int i=2;i<5;i++){
        arr[i]=arr[i-2]+arr[i-1];  
    }
    System.out.println("Deret Fibonacci :");
    for(int i=0;i<5;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
    public static void main(String[] args) {
        deret();  
    }
}