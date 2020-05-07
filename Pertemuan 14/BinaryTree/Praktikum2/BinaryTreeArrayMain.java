/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Prameswari
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray btarray = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        btarray.populateData(data, idxLast);
        btarray.traverseInOrder(0);
    }
}
