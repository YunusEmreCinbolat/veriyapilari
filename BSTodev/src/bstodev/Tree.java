/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bstodev;

/**
 *
 * @author user
 */
public class Tree {

    Node root;

    public Tree() {
        root = null;
    }

    Node newNode(int data) {
        root = new Node(data);
        return root;
    }

    Node rightadd(Node root, int data,int sayi) {
        if (root == null) {
            root = newNode(data);
        } else {
            if (root.right.data == data && root.right.right != null) {
                return null;
            }
            if (root.right == null) {
                root.right.data = sayi;
            } else {
                leftadd(root.right, data,sayi);
            }
        }
        return root;
    }

    Node leftadd(Node root, int data,int sayi) {
        if (root == null) {
            root = newNode(data);
        } else {
            if (root.left.data == data && root.left.left != null) {
                return null;
            }
            if (root.left == null) {
                root.left.data = sayi;
            } else {
                leftadd(root.left, data,sayi);
            }
        }
        return root;
    }

    void yazdir(Node root) {
        if (root == null) {
        } else {
            System.out.print(root.data+"  ");
            yazdir(root.left);
            yazdir(root.right);
        }
        
    }

    Node delete(Node root, int data) {
        Node t1, t2;
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            if (root.left == root.right) {
                root = null;
                return null;
            } else if (root.right == null) {
                t1 = root.left;
                return t1;
            } else if (root.left == null) {
                t1 = root.right;
                return t1;
            } else {
                t1 = t2 = root.right;
                while (t1.left != null) {
                    t1 = t1.left;
                }
                t1.left = root.left;
                return t2;
            }

        }
        else{
            if(data<root.data){
                root.left=delete(root.left,data);
            }
            else{
                root.right=delete(root.right,data);
            }
        }
        return root;
    }

}
