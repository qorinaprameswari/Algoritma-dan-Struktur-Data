/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Prameswari
 */
public class Node {
    int nilai;
    String nama;
    Node prev, next;

    Node(Node prev,int nilai,String nama, Node next){
        this.prev = prev;
        this.nilai = nilai;
        this.nama = nama;
        this.next = next;
    }

}
