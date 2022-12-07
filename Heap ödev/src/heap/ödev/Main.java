/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heap.ödev;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         BinaryHeap maxHeap = new BinaryHeap(10);
         maxHeap.insert(10);
         maxHeap.delete(5);
         maxHeap.printHeap();
         Scanner scan = new Scanner(System.in);
         boolean continuee=true;
         while(continuee){
             System.out.println("1->Ekle\n2->Sil\n3->Listele\n4->Cikis\nIslem Seciniz -> ");
             switch(scan.nextInt()){
                 case 1:
                     System.out.println("Eklenecek sayi giriniz: ");
                     maxHeap.insert(scan.nextInt());
                     break;
                 case 2:
                     System.out.println("Silinecek sayi giriniz: ");
                     maxHeap.delete(scan.nextInt());
                     break;
                 case 3:
                     maxHeap.printHeap();
                     break;
                 case 4:
                     continuee=false;
                     break;
                 default:
                     System.out.println("Tanimli olmayan islem");
                     break;
                     
             }
         }
          
    }
    
}
