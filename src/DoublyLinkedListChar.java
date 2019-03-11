import java.util.Scanner;

class Dnode{
    char value;
    Dnode previous;
    Dnode next;
    Dnode(char value){
        this.value=value;
        this.next=null;
        this.previous=null;
    }
    Dnode(char value,Dnode previous){
        this.value=value;
        this.next=null;
        this.previous=previous;//dfd
    }
}

public class DoublyLinkedListChar {
    private static Scanner sc=new Scanner(System.in);
    private static Dnode head=null;

    private static  Dnode insert(Dnode head,char data) {
        Dnode previous;
        if(head==null)
            return new Dnode(data);
        else if(head.next==null)
        {   previous=head;
            head.next=new Dnode(data,previous);
        }
        else
            insert(head.next,data);
        return head;
    }

    private static void display() {
        Dnode temp=head;
        while(temp!=null) {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        String temp="ABCDEF";
        for(int i=0;i<temp.length();i++) {
            head=insert(head,temp.charAt(i));
        }

        display();
    }

}
