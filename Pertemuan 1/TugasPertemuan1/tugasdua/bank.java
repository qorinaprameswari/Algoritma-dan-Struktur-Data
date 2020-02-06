/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdua;
public class bank {
    public static void main(String[] args){
        double bunga = 0.02,uang =1000000;
        int bulan = 0;
        
        System.out.printf("Saldo saat ini:Rp%,.2f\n",uang);
        for(bulan =0;uang <1500000;bulan++){
            uang += uang*bunga;
        }
        System.out.printf("Dalam waktu : %d bulan\n",bulan);
        System.out.printf("Uang Anda :Rp%,.2f\n",uang);
    }
}
