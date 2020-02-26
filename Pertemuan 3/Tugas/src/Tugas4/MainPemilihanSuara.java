/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainPemilihanSuara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Pemilihan Ketua Umum BEM Tahun 2020");
        System.out.println("=====================================");
        PemilihanSuara bem = new PemilihanSuara();
        PemilihanSuara[] ps = new PemilihanSuara[bem.jumlahKandidat];
        
        for(int a=0;a<bem.jumlahKandidat;a++){
            ps[a] = new PemilihanSuara();
            System.out.println("Nama Kandidat ke-"+(a+1)+" : ");
            ps[a].kandidat = sc.nextLine();
            System.out.println("================================");
        }
        
        for(int a=0;a<bem.jumlahKandidat;a++){
            System.out.println("Jumlah Suara Kandidat ke-"+(a+1)+" : ");
            ps[a].suara = sc.nextInt();
            bem.jumlahSuara += ps[a].suara;
        }
        System.out.println("===================================");
        int hasil = bem.hitung(bem.jumlahSuara,ps[0].suara,ps[1].suara,ps[2].suara,ps[3].suara);
        if(hasil==0){
            System.out.println("Masing-masing Kandidiat memiliki mayoritas yang hampir sama");
        } else{
            System.out.println("Ketua BEM yang terpilih adalah "+ps[hasil-1].kandidat);
        }
    }
    
}
