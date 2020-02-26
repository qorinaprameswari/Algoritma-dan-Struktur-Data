/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

/**
 *
 * @author Prameswari
 */
public class ModifikasiNilaiAlgoritma {
    public String namaMhs[];
    public int jmlh;
    public double rata[];
    public double nilai;

    public ModifikasiNilaiAlgoritma(int jmlh) {
        this.namaMhs = new String[jmlh];
        this.nilai= 0;
        this.rata = new double [jmlh];
        this.jmlh=jmlh;
    }
    
    double rataDC(double arr[], int a, int b){
        if(a==b){
            return arr[1];
        }
        else if(a<b){
            int nilai= (a+b)/2;
            double anilai=rataDC(arr, a, nilai-1);
            double bnilai = rataDC(arr, nilai+1, b);
            return bnilai+anilai + arr[nilai];
        }
        return 0;
}
}
