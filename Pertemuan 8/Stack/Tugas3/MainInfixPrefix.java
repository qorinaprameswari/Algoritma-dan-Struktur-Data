/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import java.util.Scanner;
/**
 *
 * @author Prameswari
 */
public class MainInfixPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Operasi Infix : ");
        String prefixOperasi = sc.nextLine();
        prefixOperasi = prefixOperasi.trim();
        int total = prefixOperasi.length();
        InfixPrefix ip = new InfixPrefix(total);
        String balikInput = ip.balik(prefixOperasi);
        String prefix = ip.konversi(balikInput);
        System.out.println("Operasi Prefix : " + ip.balik(prefix));
    }
    
}
