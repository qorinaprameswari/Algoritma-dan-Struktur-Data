/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1_2_3;

import java.util.Scanner;

/**
 *
 * @author Prameswari
 */
public class MainNilaiAlgoritma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------NILAI MAHASISWA-------------");
        System.out.println("Masukkan Jumlah Mahasiswa: ");
        int jumlah = sc.nextInt();
        NilaiAlgoritma[] na = new NilaiAlgoritma[jumlah];

        for (int a = 0; a < jumlah; a++) {
            na[a] = new NilaiAlgoritma();
            System.out.println("Mahasiswa ke-" + (a + 1));
            na[a].namaMhs = sc.nextLine();
            System.out.print("Masukkan Nama Mahasiswa: ");
            na[a].namaMhs = sc.nextLine();
            System.out.print("Masukkan Nilai Tugas: ");
            na[a].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis: ");
            na[a].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS: ");
            na[a].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS: ");
            na[a].nilaiUAS = sc.nextInt();
            System.out.println("=========================================");
            System.out.println("Nilai Akhir Mahasiswa ke-" + (a + 1) + " : " + na[a].hitungTotalNilai(na[a].nilaiTugas, na[a].nilaiKuis, na[a].nilaiUTS, na[a].nilaiUAS));
        }
        Rata2 rt = new Rata2();
        System.out.println("=================================================");
        System.out.println("Nilai Total Mata Kuliah Algoritma");
        for(int a=0;a<jumlah;a++){
            System.out.println("Nama Mahasiswa ke-"+(a+1)+" : "+na[a].namaMhs);
            System.out.println("Nilai Total: "+na[a].hitungTotalNilai(na[a].nilaiTugas, na[a].nilaiKuis, na[a].nilaiUTS, na[a].nilaiUAS));
            rt.total += na[a].hitungTotalNilai(na[a].nilaiTugas, na[a].nilaiKuis, na[a].nilaiUTS, na[a].nilaiUAS);
        }
        System.out.println("=================================================");
        System.out.println("Rata-rata Nilai Mahasiswa: "+rt.hitungRata(jumlah));
        }
    }
