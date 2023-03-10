import java.util.*;
public class Main {
    static class Node
    {
        int val;
        Node next;
        Node(int x)
        {
            this.val=x;
        }
    }

    public static Node convert(int a[])
    {
        Node n=new Node(a[0]);
        Node h=n;
        for(int i=1;i<a.length;i++)
        {
            n.next=new Node(a[i]);
            n=n.next;
        }
        n.next=h;
        return h;
    }

    public static void pList(Node start)
    {
        Node h=start;
        while(start.next!=h)
        {
            System.out.print(start.val+" ");
            start=start.next;
        }
        System.out.println(start.val);
    }
    
    public static Node AddtoStart(Node start,int x)
    {
        Node h=start;
        Node n=new Node(x);
        Node last = start;
        n.next=h;
        while (last.next != start) {
            last = last.next;
        }
        last.next = n;
        n.next = start;
        start = n;
        return start;
    }

    public static Node AddtoEnd(Node start,int x)
    {
        Node h=start;
        Node n=new Node(x);
        Node last = start;
        while(last.next.next!=h)
        {
            last=last.next;
        }
        last.next=n;
        n.next=h;
        return start;
    }    
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7,8};
        Node start=convert(a);
        pList(start);
    }
}
