import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Tablo kac satir olacaktir: ");
        Table htable=new Table(scan.nextInt());
        boolean devam=true;

        while (devam){
            System.out.println("1->EKLE\n2->SIL\n3->YAZDİR\n");
            switch (scan.nextInt()){
                case 1:
                    System.out.println("Eklenecek Keyi giriniz: ");
                    int key= scan.nextInt();
                    System.out.println("İsim giriniz: ");
                    String isim= scan.next();
                    htable.ekle(key,isim);
                    break;
                case 2:
                    System.out.println("Silinecek keyi giriniz: ");
                    key= scan.nextInt();
                    htable.sil(key);
                    break;
                case 3:
                    htable.yazdir();
            }

        }
    }
}