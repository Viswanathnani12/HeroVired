import java.util.*;
class Q3
{
    static Scanner s=new Scanner(System.in);
    public static void addproducts(ArrayList<String> prolist,ArrayList<ArrayList<String>> prodet,ArrayList<Integer> procount)
    {
        System.out.println("Enter Product Name");
        String pname=s.next();
        prolist.add(pname);
        System.out.println("Enter Product Quantity");
        int pq=s.nextInt();
        System.out.println("Enter Specifications");
        s.nextLine();
        String sp=s.nextLine();
        System.out.println("Enter Cost");
        String c=s.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        prodet.add(a);
        procount.add(pq);
    }
    public static void productlist(ArrayList<String> prolist,ArrayList<Integer> procount)
    {
        System.out.println("Enter productname to get count");
        String name=s.next();
        int k=prolist.indexOf(name);
        System.out.println(prolist.get(k)+" "+procount.get(k));
    }
    public static void editpro(ArrayList<String> prolist,ArrayList<ArrayList<String>> prodet,ArrayList<Integer> procount)
    {
        System.out.println("Enter productname to edit details");
        String p=s.next();
        int k=prolist.indexOf(p);
        System.out.println("Enter product quantity");
        int pq=s.nextInt();
        System.out.println("Enter Specifications");
        s.nextLine();
        String sp=s.nextLine();
        System.out.println("Enter Cost");
        String c=s.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        prodet.set(k, a);
        procount.set(k,pq);
    }
    public static void productcount(ArrayList<String> prolist,ArrayList<Integer> procount)
    {
        System.out.println("Enter Product Name:- ");
        String pname=s.next();
        int i=prolist.indexOf(pname);
        System.out.println(prolist.get(i)+"    "+procount.get(i));
    }
    public static void updateInventory(ArrayList<String> prolist,ArrayList<ArrayList<String>> prodet,ArrayList<Integer> procount)
    {
        System.out.println("Enter 1 to add  or 2 to Delete Product Quantity :-");
        int ch=s.nextInt();
        if(ch==1)
        {
            System.out.println("Enter Product Name:-");
            String pname=s.next();
            System.out.println("Enter No of items to add:- ");
            int n=s.nextInt();
            int i=prolist.indexOf(pname);
            procount.set(i,procount.get(i)+n);
            int m=procount.get(i);
            prodet.get(i).set(2,Integer.toString(m));
        }
        else
        {
            System.out.println("Enter Product Name:- ");
            String pname=s.next();
            System.out.println("Enter Number of items to Add");
            int n=s.nextInt();
            int i=prolist.indexOf(pname);
            procount.set(i,procount.get(i)-n);
            int m=procount.get(i);
            prodet.get(i).set(2,Integer.toString(m));
        }
    }
    public static void viewproduct(ArrayList<String> prolist,ArrayList<ArrayList<String>> prodet,ArrayList<Integer> procount)
    {
        for(int i=0;i<prolist.size();i++)
        {
            System.out.print(prolist.get(i)+"  ");
            String d="";
            for(int j=0;j<prodet.get(i).size();j++)
            d+=prodet.get(i).get(j)+" ";
            System.out.print(d);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayList<String> prolist=new ArrayList<>();
        ArrayList<ArrayList<String>> prodet=new ArrayList<>();
        ArrayList<Integer> procount=new ArrayList<>();
        System.out.println("Enter Number of items to be added");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
            addproducts(prolist,prodet,procount);
        viewproduct(prolist, prodet, procount);     
    } 
}