import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NodeMusteri nodeMusteri=new NodeMusteri();
        MusteriIslem musteriIslem=new MusteriIslem();
        Scanner scan =new Scanner(System.in);
        boolean devam=true;
        int islem;
        while (devam){
            System.out.println("1->Ekle\n2->Sil\n3->Guncelle\n4->Musteri ara\n5->Listele\n6->Cikis\nIslem Seciniz");
            islem=scan.nextInt();
            switch (islem){
                case 1:
                    System.out.println("Musterinin nosunu giriniz: ");
                    nodeMusteri.setNo(scan.nextInt());
                    System.out.println("Musterinin adini giriniz: ");
                    nodeMusteri.setAd(scan.next());
                    System.out.println("Musterinin soyadini giriniz: ");
                    nodeMusteri.setSoyad(scan.next());
                    System.out.println("Musterinin telefonunu giriniz: ");
                    nodeMusteri.setTelefon(scan.nextInt());
                    System.out.println("Musterinin adresini giriniz: ");
                    nodeMusteri.setAdres(scan.next());
                    System.out.println("Musterinin urununu giriniz: ");
                    nodeMusteri.setUrun(scan.next());
                    musteriIslem.add(nodeMusteri);
                    break;
                case 2:
                    System.out.println("Kac nolu musteri silinecek: ");
                    musteriIslem.delete(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Kac nolu musteri guncellenecek: ");
                    musteriIslem.update(scan.nextInt());
                    break;
                case 4:
                    System.out.println("Kac nolu musteri aranacak: ");
                    musteriIslem.search(scan.nextInt());
                    break;
                case 5:
                    musteriIslem.write();
                    break;
                case 6:
                    devam=false;
                    break;
                default:
                    System.out.println("Tanimli islem degil");
            }
        }
    }
}