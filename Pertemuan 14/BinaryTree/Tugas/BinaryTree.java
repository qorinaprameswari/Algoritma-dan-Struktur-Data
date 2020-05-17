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
public class BinaryTree {
     Node root;
     int size;
    
    public BinaryTree(){
        root = null;
    }
    boolean isEmpty(){
        return root==null;
    }
    void add(int data){
        if(isEmpty()){
            root = new Node(data);
        }else{
            Node current = root;
            while(true){
                if(data<current.data){
                    if(current.left!=null){
                        current = current.left;
                    }else{
                        current.left = new Node(data);
                        break;
                    }
                }else if(data>current.data){
                    if(current.right!=null){
                        current = current.right;
                    }else{
                        current.right = new Node(data);
                        break;
                    }
                }else{
                    break;
                }    
            }
        }
    }
    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current!=null){
            if(current.data==data){
                hasil = true;
                break;
            }else if(data<current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
    void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node node){
        if(node != null){
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node node){
        if(node != null){            
            traversePreOrder(node.left);
            System.out.print(" " + node.data);
            traversePreOrder(node.right);
        }
    }
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left!=null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor!=del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current!=null){
            if(current.data==data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }if(current==null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            if(current.left==null&&current.right==null){
                if(current==root){
                    root = null;
                }else{                    
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left==null){
                if(current==root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right==null){
                if(current==root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;                        
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                Node successor = getSuccessor(current);
                if(current==root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
                successor.left = current.left;
            }
        }
    }
    public void insert(int data){
        root = add(root,data);
    }
    Node add (Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = add(root.left,data);
        }else if(data > root.data){
            root.right = add(root.right,data);
            return root;
        }
        return null;
    }
    public int Smallest(Node node){
        if (node == null)
            return Integer.MAX_VALUE;
            int hasil = node.data;
            int kiri = Smallest(node.left);
            int kanan = Smallest(node.right);
            if (kiri < hasil)
                hasil = kiri;
                if (kanan < hasil) hasil = kanan;
                    return hasil;
    }
    public int Bigest(Node node){
        if (node == null)
            return Integer.MIN_VALUE;
        int hasil = node.data;
        int kiri = Bigest(node.left);
        int kanan = Bigest(node.right);
        if (kiri > hasil)
            hasil  = kiri;
        if (kanan > hasil) hasil = kanan;
            return hasil;
    }
    public void printLeaf(Node node){
        if (node == null)
            return;
        if (node.left == null && node.right == null){
            System.out.print(node.data + " ");
            return;
        }
        if (node.left != null)
            printLeaf(node.left);
        if (node.right != null)
            printLeaf(node.right);
    }
    public void JumlahLeaf(Node node){
        if (node == null)
            return;
        if (node.left == null && node.right == null){
            size++;
            return;
        }
        if (node.left != null)
            JumlahLeaf(node.left);
        if (node.right != null)
            JumlahLeaf(node.right);
    }
    public int Jumlah(Node node){
        JumlahLeaf(node);
        return size;
    }    
}
