import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NodeCar nodeCar=new NodeCar();
        CarIslem carIslem=new CarIslem();
        Scanner scan=new Scanner(System.in);
        boolean devam=true;
        int islem;
        while (devam){
            System.out.println("1->EKLE\n2->SIL\n3->YAZDIR\n4->ARA\n0->CIKIS\nIslem Seciniz:");
            islem=scan.nextInt();
            switch (islem){
                case 1:
                    System.out.println("Arabanin plakasini giriniz: ");
                    nodeCar.setPlaka(scan.next());
                    System.out.println("Arabanin markasini giriniz: ");
                    nodeCar.setMarka(scan.next());
                    System.out.println("Arabanin modelini giriniz: ");
                    nodeCar.setModel(scan.next());
                    System.out.println("Arabanin rengini giriniz: ");
                    nodeCar.setRenk(scan.next());
                    System.out.println("Arabanin alis fiyatini giriniz: ");
                    nodeCar.setAlisfiyati(scan.nextInt());
                    System.out.println("Arabanin aciklamasini giriniz: ");
                    nodeCar.setAciklama(scan.next());
                    carIslem.add(nodeCar);
                    break;
                case 2:
                    System.out.println("Silinecek arabanin plakasini giriniz:");
                    carIslem.delete(scan.next());

                    break;
                case 3:
                    carIslem.write();

                    break;
                case 4:
                    System.out.println("Aranacak arabanin plakasini giriniz:");
                    carIslem.search(scan.next());

                    break;
                case 0:
                    devam=false;

                    break;
                default:
                    System.out.println("Tanimlanmayan islem");
                    break;
            }
        }
    }
}