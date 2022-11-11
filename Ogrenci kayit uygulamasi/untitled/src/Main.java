import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        OgrIslemleri ogrIslemleri=new OgrIslemleri();
        int islem;
        boolean devam=true;
        while(devam==true){
            System.out.println("1->Kayit ekle\n2->Kayit Sil\n3>Kayit Listele\n4-> En basarili ogrenciyi getir\n0->Cıkıs");
            System.out.println("Islem seciniz: ");
            islem=scan.nextInt();
            switch (islem){

                case 1:
                    NodeOgr ogr =new NodeOgr();
                    System.out.println("Ogrenci nosunu giriniz: ");
                    ogr.setNo(scan.nextInt());
                    System.out.println("Ogrenci adini giriniz: ");
                    ogr.setAd(scan.next());
                    System.out.println("Ogrenci soyadini giriniz: ");
                    ogr.setSoyad(scan.next());
                    System.out.println("Ogrenci vize notunu giriniz: ");
                    ogr.setVize(scan.nextInt());
                    System.out.println("Ogrenci final notunu giriniz: ");
                    ogr.setFinall(scan.nextInt());
                    ogrIslemleri.ekle(ogr);
                    break;
                case 2:
                    System.out.println("Kac nolu ogrenci silinecek");
                    ogrIslemleri.sil(scan.nextInt());
                    break;
                case 3:
                    ogrIslemleri.listele();

                    break;
                case 4:
                    ogrIslemleri.basarili();
                    break;
                case 0:
                    devam=false;
                    break;

            }

        }
    }
}