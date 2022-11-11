import org.w3c.dom.Node;

import java.util.Scanner;

public class OgrIslemleri {
    NodeOgr head=null;
    NodeOgr tail=null;
    NodeOgr temp;
  public void ekle(NodeOgr ogr) {
      if (head == null) {
          head = ogr;
          tail = ogr;
          head.sonra = tail;
          tail.sonra = null;
      }
      else {
          NodeOgr temp2 = ogr;
          temp = head;
          while (temp.sonra != null) {
              temp = temp.sonra;

          }
          if (temp.getNo() < ogr.getNo()) {
              tail.sonra=ogr;
              tail=ogr;
          }
          else {
              temp=head;
              while (temp.sonra != null) {
                  if (temp.sonra.getNo() > ogr.getNo()) {
                      break;
                  }
                  temp = temp.sonra;
              }
          }
          temp.sonra = temp2.sonra;
          temp.sonra = temp2;
      }
      }

      public void sil(int no){
       if(head==null){
           System.out.println("Liste Bostur");
       }
       else {
           temp=head;
           if(temp.getNo()==no){
               temp.sonra=head;
           }
           else {
               while (temp.sonra.sonra != null) {
                   if (temp.sonra.getNo()==no){
                       break;
                   }
                   temp=temp.sonra;
               }
               if(temp.sonra.getNo()==no){
                   temp.sonra=null;
               }
               else {
                   temp.sonra=temp.sonra.sonra;
               }

           }

       }
     }
     public void basarili(){
            if(head==null){
                System.out.println("bostur");

            }

            else {
                NodeOgr temp2=head;
                temp=head;
                while (temp!=null){
                    if(temp.getOrtalama()>temp2.getOrtalama()){
                        temp2=temp;
                    }
                    temp=temp.sonra;
                }
                System.out.println("----------------------------------\nEn basarili ogrencinin;\nNosu: "+temp2.getNo()+"\nAdi: "+temp2.getAd()+"\nSoyadi: "+temp2.getSoyad()
                +"\nVize notu: "+temp2.getVize()+"\nFinal notu: "+temp2.getFinall()+"Ortalamasi: "+temp2.getOrtalama()+"Durumu: "+temp2.getDurum()+"\n----------------------------------------------");

            }
     }
     public void listele(){
      if(head==null){
          System.out.println("Bostur");
      }
      else {
          NodeOgr temp2 = head;
          while (temp2 != null) {
              System.out.println("----------------------------------\n ogrencinin;\nNosu: " + temp2.getNo() + "\nAdi: " + temp2.getAd() + "\nSoyadi: " + temp2.getSoyad()
                      + "\nVize notu: " + temp2.getVize() + "\nFinal notu: " + temp2.getFinall() + "\nOrtalamasi: " + temp2.getOrtalama() + "\nDurumu: " +temp2.getDurum()+ "\n----------------------------------------------");
              temp2 = temp2.sonra;
          }
      }
     }

}
