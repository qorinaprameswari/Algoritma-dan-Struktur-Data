/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;
/**
 *
 * @author Prameswari
 */
public class PemilihanSuara {
    public String kandidat;
    public int suara,jumlahSuara=0,jumlahKandidat=4;
    public int kontrol=0,nilai=1,trm =0,trm2=0;
    
    public int arr[] = new int[1000];
    public int hitung(int js,int k1,int k2,int k3,int k4){
        if(nilai==5){
            nilai=1;
        }
        if(nilai == 1 && k1>0){
            arr[kontrol] = nilai;
            kontrol++;
            nilai++;
            return hitung(js,k1-1,k2,k3,k4);
        }else if(nilai == 2 && k2>0){
            arr[kontrol] = nilai;
            kontrol++;
            nilai++;
            return hitung(js,k1,k2-1,k3,k4);
        } else if(nilai == 3 && k3>0){
            arr[kontrol] = nilai;
            kontrol++;
            nilai++;
            return hitung(js,k1,k2,k3-1,k4);
        } else if(nilai == 4 && k4>0){
            arr[kontrol] = nilai;
            kontrol++;
            nilai++;
            return hitung(js,k1,k2,k3,k4-1);
        } else if(k1==0&&k2==0&&k3==0&&k4==0){
            if(arr[trm] == arr[trm+1] && trm+1<js){
                return arr[trm];
            }else if(trm+2<js){
                trm +=2;
                return hitung(js,k1,k2,k3,k4);
            }else{
                return 0;
            }
        }else{
            nilai++;
            return hitung(js,k1,k2,k3,k4);
        }
    }
    
   
}
