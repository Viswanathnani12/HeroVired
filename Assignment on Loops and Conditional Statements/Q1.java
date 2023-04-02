import java .util.*;
class Q1
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+n*i);
        }
        s.close();
    }
}