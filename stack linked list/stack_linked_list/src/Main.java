import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Stack kac adet veri alacaktir: ");
        StackLinkedlist stackLinkedlist=new StackLinkedlist(scan.nextInt());
        boolean devam=true;
        while (devam){
            System.out.println("1->PUSH\n2->POP\n3->YAZDIR\n0->CIKIS\nISLEM SECİNİZ:");
            switch (scan.nextInt()){
                case 1:
                    System.out.println("Sayiyi giriniz: ");
                    stackLinkedlist.push(scan.nextInt());
                    break;
                case 2:
                    stackLinkedlist.pop();
                    break;
                case 3:
                    stackLinkedlist.yazdir();
                    break;
                case 0:
                    devam=false;
            }
        }
    }
}