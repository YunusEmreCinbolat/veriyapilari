public class Btree {
    Node root;

    public Btree(){
        root=null;
    }
    Node newNode(int no,int not,String ad){
        root=new Node(no,not,ad);
        return root;
    }

    Node add(Node root,int no,int not,String ad){
        if(root!=null){
            if(no<root.no){
                root.left=add(root.left,no,not,ad);
            }
            else {
                root.right=add(root.right,no,not,ad);
            }
        }
        else {
            root=newNode(no,not,ad);
        }
        return root;
    }
    void inorder(Node root){
        if (root!=null){
            inorder(root.left);
            System.out.println(root.no+"\t"+root.ad+"\t"+ root.not);
            inorder(root.right);
        }
    }
    Node delete(Node root,int no){
        Node t1,t2;
        if (root==null){
            return null;
        }
        if(root.no==no) {
            if(root.right==null){
                t1=root.left;
                return t1;

            }
            else if (root.left==null) {
                t1=root.right;
                return t1;

            }
            else {
                t1=t2=root.right;
                while (t1.left!=null){
                    t1=t1.left;
                }
                t1.left=root.left;
                return t2;
            }
        }
        else {
            if(no< root.no){
               root.left= delete(root.left,no);
            }
            else {
                root.right=delete(root.right,no);
            }
        }
        return null;
    }
}
