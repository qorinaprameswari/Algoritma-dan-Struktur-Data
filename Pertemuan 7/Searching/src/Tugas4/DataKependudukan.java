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
public class DataKependudukan {
    public String[][] data;
    public static int jumDataBaris, jumDataKolom, brs = -1;

    public DataKependudukan(String[][] Data, int jmlDataBaris, int jmlDataKolom) {
        jumDataBaris = jmlDataBaris;
        jumDataKolom = jmlDataKolom;
        data = new String[jmlDataBaris][jmlDataKolom];
        for (int i = 0; i < jumDataBaris; i++) {
            for (int j = 0; j < jumDataKolom; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }

    public void FindSeqSearch(String cari) {
        for (int i = 0; i < jumDataBaris; i++) {
            if (data[i][0].equals(cari)) {
                brs = i;
                break;
            }
        }
    }

    public void TampilData() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data penduduk ke-" + (i+1));
            System.out.println("NIK\t: " + data[i][0]);
            System.out.println("Nama\t: " + data[i][1]);
            System.out.println("Alamat\t: " + data[i][2]);
            System.out.println("Jenis Kelamin\t: " + data[i][3]);
            System.out.println();
        }
    }

    public void TampilPencarian() {
        System.out.println("NIK\t: " + data[brs][0]);
        System.out.println("Nama\t: " + data[brs][1]);
        System.out.println("Alamat\t: " + data[brs][2]);
        System.out.println("Jenis Kelamin\t: " + data[brs][3]);
    }
    
}
