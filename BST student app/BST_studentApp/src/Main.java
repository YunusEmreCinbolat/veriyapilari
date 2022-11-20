import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Btree bt=new Btree();
        int no,not;
        String ad;
        boolean continuee=true;
        while (continuee){
            switch (menu()){
                case 1:
                    System.out.println("Ogreninin adi");
                    ad=scan.next();
                    System.out.println("Ogreninin no'su");
                    no=scan.nextInt();
                    System.out.println("Ogreninin notu");
                    not=scan.nextInt();
                   bt.root= bt.add(bt.root,no,not,ad);
                    break;
                case 2:
                    System.out.println("Silinecek ogrencinin no'su: ");
                    no= scan.nextInt();
                    bt.root=bt.delete(bt.root,no);
                    break;
                case 3:
                    System.out.println("NO"+"\t"+"AD"+"\t"+"NOTU");
                    bt.inorder(bt.root);
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
    public static int menu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1->EKLE\n2->SIL\n3->LISTELE\n4->CIKIS\nISLEM SECINIZ: ");
        return scanner.nextInt();
    }
}