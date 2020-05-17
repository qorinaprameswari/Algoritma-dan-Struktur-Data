/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plh ;
        BinaryTree bt = new BinaryTree();
        do{
            System.out.println("================");
            System.out.println(" Menu BinaryTree ");
            System.out.println("================");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. Find Small");
            System.out.println("5. Find High");
            System.out.println("6. Traverse inOrder");
            System.out.println("7. Traverse preOrder");
            System.out.println("8. Traverse postOrder");
            System.out.println("9. Keluar");
            System.out.print("=> ");
            plh = sc.nextInt();
            if (plh==1) {
                System.out.print("Masukkan Jumlah Data : ");
                int jm = sc.nextInt();
                for (int i = 0; i < jm; i++) {
                    System.out.print("Masukkan Nilai Ke "+(i+1)+" : ");
                    int nilai = sc.nextInt();
                    bt.add(nilai);
                } 
            }else if (plh==2){
                System.out.print("Masukkan Nilai yang Ingin Dihapus : ");
                int nilai = sc.nextInt();
                bt.delete(nilai);
            } else if (plh==3){
                System.out.print("Pilih data yang dicari : ");
                int fd = sc.nextInt();
                System.out.println("Find " + fd + " : " + bt.find(fd));
            } else if (plh==4){
                System.out.println("Nilai terkecil : " + bt.Smallest(bt.root));
            } else if (plh==5){
                System.out.println("Nilai terbesar : " + bt.Bigest(bt.root));
            } else if (plh==6){
                System.out.print("Traverse inOrder : "); bt.traverseInOrder(bt.root);
                System.out.println("");
            } else if (plh==7){
                System.out.print("Traverse preOrder : ");
                bt.traversePreOrder(bt.root);
                System.out.println("");
            } else if  (plh==8){
                System.out.print("Traverse postOrder : ");
                bt.traversePostOrder(bt.root);
                System.out.println("");
            } else if (plh==9){
                plh = 0;
            } else{
                plh = 1;
            }
        } while(plh==1||plh==2||plh==3||plh==4||plh==5||plh==6||plh==7||plh==8);
    }
}


