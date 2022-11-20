public class Node {
    int no,not;
    String ad;

    Node right;
    Node left;

    public Node(){
        no=0;
        not=0;
        ad="";
        left=null;
        right=null;
    }

    public Node(int no,int not,String ad){
        this.no=no;
        this.not=not;
        this.ad=ad;
        left=null;
        right=null;
    }
}
