import java.util.*;
class node 
{
    int data;
    node next,prev;
    node(int d)
    {
        data=d;
        next=prev=null;
    }
}
public class doubly
{
    static node head=null,tail=null;
    static int size;
    static void ins(int v)
    {
        node n=new node(v);
        if(head==null)
        {
            head=tail=n;
        }
        else 
        {
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    static void dis()
    {
        node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+"\n");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        
    }
    static void ins_any_pos(int v,int p)
    {
        node n=new node(v);
        if(p==1)
        {
            n.next=head;
            head.prev=n;
            head=n;
            size++;
        }
        else if(p>size+1)
        System.out.println("invalid");
        else 
        {
            node temp=head;
            for(int i=2;i<p;i++)
            {
                temp=temp.next;
            }
            if(temp.next==null)
            {
                n.prev=temp;
            n.next=temp.next;
            temp.next=n;
            }
            else 
            {
            n.prev=temp;
            n.next=temp.next;
            temp.next=n;
            n.next.prev=n;
            }
            size++;
        }
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    size=s.nextInt();
	    for(int i=1;i<=size;i++)
	    {
	        int a=s.nextInt();
	        ins(a);
	    }
		dis();
		System.out.println("\nEnter the new value and position");
		int val=s.nextInt();
		int p=s.nextInt();
		ins_any_pos(val,p);
		dis();
	}
}
