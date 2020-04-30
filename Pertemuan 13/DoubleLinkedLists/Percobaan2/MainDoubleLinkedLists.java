/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author Prameswari
 */
public class MainDoubleLinkedLists {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        try{
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size());        
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    } 
}
