import java.util.Scanner;

public class MusteriIslem {
    NodeMusteri head=null;
    NodeMusteri tail=null;
    NodeMusteri temp=null;
    public void add(NodeMusteri nodeMusteri){

        if(head==null){
            head=nodeMusteri;
            tail=nodeMusteri;
            tail.once=head;
            head.sonra=tail;
            tail.sonra=null;
        }
        else {
            temp=head;
            while (temp.sonra!=null){
                if(nodeMusteri.getNo()< temp.getNo()){
                    break;
                }
            }
            temp.sonra=nodeMusteri.sonra;
            temp.sonra.once=nodeMusteri;
            temp.sonra=nodeMusteri;
            nodeMusteri.once=temp;

        }

    }
    public void update(int no){
        if(head==null){
            System.out.println("Liste bostur");
        }
        else {
            temp=head;
            while (temp!=null){
                if(temp.getNo()==no) {
                    break;
                }
            }
            if(temp==null){
                System.out.println("Aradiginiz musteri yoktur ");
            }
            else {
                System.out.println("Hangi bilgi güncellenecektir:\n1->Ad\n2->Soyad\n3->Telefon\n4->Adres\n5->Urun\nIslem seciniz");
                Scanner scan=new Scanner(System.in);
                int islem= scan.nextInt();
                switch(islem){
                    case 1:
                        System.out.println("Yeni adi giriniz");
                        temp.setAd(scan.next());
                        break;
                    case 2:
                        System.out.println("Yeni soyadi giriniz");
                        temp.setSoyad(scan.next());
                        break;
                    case 3:
                        System.out.println("Yeni telefon no giriniz");
                        temp.setTelefon(scan.nextInt());
                        break;
                    case 4:
                        System.out.println("Yeni adresi giriniz");
                        temp.setAdres(scan.next());
                        break;
                    case 5:
                        System.out.println("Yeni urun adi giriniz");
                        temp.setUrun(scan.next());
                        break;
                }
            }
        }

    }
    public void delete(int no){
        if(head==null){
            System.out.println("Liste bostur");
        }
        else {
            temp=head;
            if(temp.getNo()==no){
                head=temp.sonra;
            }
            while (temp.sonra!=null){
                if(temp.sonra.getNo()==no){
                    break;
                }
            }
            if(temp==tail){
                tail=temp.once;
            }
            else {
                temp.sonra=temp.sonra.sonra;
                temp.sonra.once=temp;
            }
        }
    }
    public void search(int no){
        if(head==null){
            System.out.println("Liste bostur ");
        }
        else {
            temp=head;
            while(temp!=null){
                if(temp.getNo()==no){
                    break;
                }
            }
            if(temp==null){
                System.out.println("Aradiginiz musteri yoktur ");
            }
            else {
                System.out.println(temp.getNo()+"nolu musterinin bilgileri asagidaki gibidir;\n Adi Soyadi: "+temp.getAd()+" "
                +temp.getSoyad()+"\nTelefon numarasi:"+ temp.getTelefon()+"\nAdresi:" +temp.getAdres()+"\nUrunu: "+temp.getAdres());
            }
        }
    }
    public  void write(){
        if(head==null){
            System.out.println("liste bostur");
        }
        else{
            temp=head;
            while(temp!=null){
                System.out.println("--------------------\n"+temp.getNo()+" nolu musterinin;\nAdi Soyadi "+temp.getAd()+" "+temp.getSoyad()+
                        "\nTelefonu: "+ temp.getTelefon()+"\nAdresi: "+temp.getAdres()+"\nUrunu: "+temp.getUrun()+"\n-------------------------");
                temp=temp.sonra;
            }
        }
    }
}
