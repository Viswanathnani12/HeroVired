import java.util.ArrayList;

public class Queue {
    public static void push(int e,ArrayList<Integer> q)
    {
        q.add(0, e);
    }
    public static void print(ArrayList<Integer> q)
    {
        for(Integer e:q)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void pop(ArrayList<Integer> q)
    {
        q.remove(q.size()-1);
    }
    public static boolean isempty(ArrayList<Integer> q)
    {
        if(q.size()==0)
            return true;
        return false;
    }
    public static int top(ArrayList<Integer> q)
    {
        return q.get(q.size()-1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> queue=new ArrayList<>();
        push(2,queue);
        print(queue);
        push(3,queue);
        print(queue);
        push(1,queue);
        print(queue);
        pop(queue);
        print(queue);
        int a=top(queue);
        System.out.println(a);
    }
}
