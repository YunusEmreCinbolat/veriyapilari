public class StackLinkedlist {
    private int size;
    Node top;
    int count;
    public StackLinkedlist(int size){
        this.size=size;
        count=0;
        top=null;
    }
    void push(int data){
        if(IsFull()){
            System.out.println("Stack dolu ");
        }
        else {
            Node dugum = new Node(data);
            if (top == null) {
                top = dugum;
                count++;
            }
            else {
                dugum.next=top;
                top=dugum;
                count++;
            }
        }
    }
    void pop(){
        if(IsEmpty()){
            System.out.println("Stack bostur");
        }
        else {
            top=top.next;
            count--;
        }

    }
    void yazdir(){
        if(top==null){
            System.out.println("Stack bostur:");
        }
        else {
            Node temp = top;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    boolean IsEmpty(){
        if(top==null){
            return true;
        }
        else {
            return false;
        }
    }
    boolean IsFull(){
        if(count==size){
            return true;
        }
        else {
            return false;
        }
    }
}
