/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray(int[]dt){
        data = new int[dt.length];
    }
    public void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    public void updateData(int data[]){
        this.data = data;
    }
    public void add(int dt, int idx){
        data[idx] = dt;
    }
    public void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            if(data[idxStart] == 0){
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
            traverseInOrder(2*idxStart+2);
        }
    }
    public void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            if(data[idxStart] == 0){
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
        }
    }
    public void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
            if(data[idxStart] == 0){
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
        }
    }


}
