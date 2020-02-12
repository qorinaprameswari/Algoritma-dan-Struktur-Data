package pemilihan;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class pertanyaan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nilaiTugas,nilaiUts,nilaiUas;
        double nilaiakhir,nT = 0,nUts = 0,nUas = 0;
        
        System.out.print("Masukkan Nilai Tugas :");
        nilaiTugas=sc.nextInt();
        if(nilaiTugas>0 && nilaiTugas<=100){ 
        nT =0.20*nilaiTugas;
        }else{
            System.out.println("nilai yang anda masukkan lebih dari 100");
        }
        System.out.print("Masukkan Nilai UTS :");
        nilaiUts = sc.nextInt();
        if(nilaiUts>0 && nilaiUts<=100){  
        nUts=0.35*nilaiUts;
        } else{
            System.out.println("nilai yang anda masukkan lebih dari 100");
        }
        System.out.print("Masukkan Nilai UAS :");
        nilaiUas = sc.nextInt(); 
        if(nilaiUas>0 && nilaiUas<=100){  
        nUas=0.45*nilaiUas;
        } else{
            System.out.println("nilai yang anda masukkan lebih dari 100");
        }
        nilaiakhir=nT + nUts + nUas ;
        System.out.println("Nilai Akhir : " + nilaiakhir);
      }
    } 

