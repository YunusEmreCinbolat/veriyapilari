public class NodeOgr {
    private String Ad;
    private String Soyad;
    private int vize;
    private int finall;
    private int ortalama;
    NodeOgr sonra;
    private int no;
    private String durum;

    public NodeOgr(){

    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinall() {
        return finall;
    }

    public void setFinall(int finall) {
        this.finall = finall;
    }

    public int getOrtalama() {
        return (this.getFinall()*6/10+this.getVize()*4/10);
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDurum() {
        if(this.getOrtalama()>=55){
            return "Gecti";
        }
        return "Kaldi";
    }


}
