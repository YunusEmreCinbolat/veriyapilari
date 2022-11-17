/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bstodev;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {
          Tree tree =new Tree();
        Scanner scan=new Scanner(System.in);
        boolean devam=true;
        while(devam){
             System.out.println("1->EKLE\n2->SIL\n3->YAZDIR\n4->CIKIS\nIslem seciniz: ");
             switch(scan.nextInt()){
                 case 1:
                     System.out.println("Eklenecek sayiyi giriniz: ");
                     int sayi=scan.nextInt();
                     System.out.println("1->SAGA EKLE\n2->SOLA EKLE");
                     
                     switch(scan.nextInt()){
                         case 1:
                             System.out.println("Ekleenecek sayi nedir: ");
                             sayi=scan.nextInt();
                             System.out.println("Hangi sayinin sagina eklenecek: ");
                             int data=scan.nextInt();
                             tree.rightadd(tree.root, data, sayi);
                             break;
                         case 2:
                                System.out.println("Ekleenecek sayi nedir: ");
                             sayi=scan.nextInt();
                             System.out.println("Hangi sayinin soluna eklenecek: ");
                              data=scan.nextInt();
                             tree.leftadd(tree.root, data, sayi);
                             break;
                         default:
                             System.out.println("TANIMLI OLMAYAN ISLEM");
                     }
                     
                     break;
                 case 2:
                      System.out.println("Silinecek sayiyi giriniz: ");
                      sayi=scan.nextInt();
                      tree.delete(tree.root, sayi);
                     break;
                 case 3:
                     tree.yazdir(tree.root);
                     break;
                 case 4:
                     devam=false;
                     break;
                 default:
                     System.out.println("TANIMLI OLMAYAN ISLEM");
                     break;
                     
             }
        }
    }
    
}
