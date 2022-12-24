public class Table {
    Node dizi[];
    int size;

    public Table(int size){
        this.size=size;
        dizi=new Node[size];
        for (int i=0;i<size;i++){
            dizi[i]=new Node();
        }
    }

    int index_bul(int key){
        return key%size;
    }

    void ekle(int key, String isim){
        int indis=index_bul(key);
        Node eleman=new Node(key,isim);
        Node temp=dizi[indis];

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=eleman;
    }
    void sil(int key){
        int kontrol=0;
        for(int i=0;i<size;i++){
            if(dizi[i].next!=null)
                kontrol++;
        }
        if(kontrol==0)
            System.out.println("Tablo bostur");
        else {
            int indis = index_bul(key);
            Node temp=dizi[indis];
            kontrol=1;
            while (temp.next!=null){
                if(temp.next.key==key){
                    temp.next=temp.next.next;
                    kontrol=0;
                    break;
                }
            }
            if (kontrol==1){
                System.out.println("Silinecek eleman yoktur");
            }
        }


    }
    void yazdir(){
        Node temp=dizi[0];
        for (int i=0;i<size;i++){
            System.out.println(i+1+". satir");
            while (temp!=null){
                System.out.print(temp.isim+" ");
                temp=temp.next;
            }
        }
    }
}
