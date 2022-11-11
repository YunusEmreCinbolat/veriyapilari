public class CarIslem {
    NodeCar head;
    NodeCar tail;
    NodeCar temp;
    public void add(NodeCar car){
        if(head==null){
            head=car;
            tail=car;
            tail.sonra=head;
        }
        else{
            car.sonra=head;
            head=car;
            tail.sonra=head;
        }
    }
    public void delete(String plaka){
        if(head==null){
            System.out.println("Arac yoktur");
        }
        else {
            temp = head;
            if (temp.getPlaka() == plaka) {
                head = temp.sonra;
                tail.sonra = head;
            } else {
                while (temp != tail) {
                    if (temp.sonra.getPlaka() == plaka) {
                        break;
                    }
                    temp = temp.sonra;
                }
                temp.sonra=temp.sonra.sonra;
            }
        }
    }
    public void write(){
        if(head==null){
            System.out.println("Arac yoktur");
        }
        else {
            temp=head;
            while (temp!=tail){
                System.out.println("--------------------------\n"+temp.getPlaka()+" Plakalı aracın bilgileri\nMarkasi: "+temp.getMarka()
                +"\nModeli: "+temp.getModel()+"\nRengi: "+temp.getRenk()+"\nAlis fiyati "+temp.getAlisfiyati()+"Aciklamasi: "+temp.getAciklama()+
                        "-------------------------------");
                temp=temp.sonra;
            }
            System.out.println("--------------\n"+temp.getPlaka()+" Plakalı aracın bilgileri\nMarkasi: "+temp.getMarka()
                    +"\nModeli: "+temp.getModel()+"\nRengi: "+temp.getRenk()+"\nAlis fiyati "+temp.getAlisfiyati()+"Aciklamasi: "+temp.getAciklama()+
                    "-------------------------------");

        }
    }
    public void search(String plaka){
        if(head==null){
            System.out.println("Arac yoktur");
        }
        else {
            boolean have=false;
            temp=head;
            while (temp!=tail){
                if(temp.getPlaka()==plaka){
                    System.out.println("--------------\n"+temp.getPlaka()+" Plakalı aracın bilgileri\nMarkasi: "+temp.getMarka()
                            +"\nModeli: "+temp.getModel()+"\nRengi: "+temp.getRenk()+"\nAlis fiyati "+temp.getAlisfiyati()+"Aciklamasi: "+temp.getAciklama()+
                            "-------------------------------");
                    have=true;
                    break;
                }

            }
            if(temp.getPlaka()==plaka){
                System.out.println("--------------\n"+temp.getPlaka()+" Plakalı aracın bilgileri\nMarkasi: "+temp.getMarka()
                        +"\nModeli: "+temp.getModel()+"\nRengi: "+temp.getRenk()+"\nAlis fiyati "+temp.getAlisfiyati()+"Aciklamasi: "+temp.getAciklama()+
                        "-------------------------------");
                have=true;
            }
            if(have==false){
                System.out.println(plaka+" plakali arac yoktur");
            }

        }
    }

}
