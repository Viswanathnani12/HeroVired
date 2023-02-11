import java.util.*;
class Q3
{
    static Scanner s=new Scanner(System.in);
    public static void addpro(ArrayList<String> prolist,ArrayList<ArrayList<String>> prodet,ArrayList<Integer> procount)
    {
        System.out.println("Enter Product Name:-");
        String pname=s.next();
        prolist.add(pname);
        System.out.println("Enter Product Quantity:-");
        int pq=s.nextInt();
        System.out.println("Enter Specifications:-");
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
    public static void prolist(ArrayList<String> prolist,ArrayList<Integer> procount)
    {
        System.out.println("Enter ProductName:-");
        String name=s.next();
        int k=prolist.indexOf(name);
        System.out.println(prolist.get(k)+" "+procount.get(k));
    }
    public static void editpro(ArrayList<String> prolist,ArrayList<ArrayList<String>> prodet,ArrayList<Integer> procount)
    {
        System.out.println("Enter ProductName:-");
        String p=s.next();
        int k=prolist.indexOf(p);
        System.out.println("Enter Product Quantity:-");
        int pq=s.nextInt();
        System.out.println("Enter Specifications:-");
        s.nextLine();
        String sp=s.nextLine();
        System.out.println("Enter Cost:-");
        String c=s.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        prodet.set(k, a);
        procount.set(k,pq);
    }
    public static void procount(ArrayList<String> prolist,ArrayList<Integer> procount)
    {
        System.out.println("Enter Product Name:-");
        String pname=s.next();
        int i=prolist.indexOf(pname);
        System.out.println(prolist.get(i)+"  "+procount.get(i));
    }
    public static void updateInventory(ArrayList<String> prolist,ArrayList<ArrayList<String>> prodet,ArrayList<Integer> procount)
    {
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to Delete");
        int ch=s.nextInt();
        if(ch==1)
        {
            addpro(prolist,prodet,procount);
        }
        else
        {
            System.out.println("Enter Product Name:- ");
            String pname=s.next();
            int i=prolist.indexOf(pname);
            prodet.remove(i);
        }
    }
    public static void viewpro(ArrayList<String> prolist,ArrayList<ArrayList<String>> prodet,ArrayList<Integer> procount)
    {
        if(prolist.size() == 0) 
            System.out.println("No Products");
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
        ArrayList<ArrayList<String>> prodet=new ArrayList<>();
        ArrayList<Integer> procount=new ArrayList<>();
        ArrayList<String> prolist=new ArrayList<>();
        System.out.println("Enter Number of items to be added:-");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
            addpro(prolist,prodet,procount);
        while(true) 
        {
			System.out.println("```````````````````````````");
			System.out.println("1.Product List ");
			System.out.println("2.Product count ");
			System.out.println("3.Product details ");
			System.out.println("4.Edit Product details ");
			System.out.println("5.Update Inventory ");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:-");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1: prolist(prolist, procount);;
						break;
				case 2:procount(prolist, procount);;
						break;
				case 3:viewpro(prolist, prodet, procount);;
						break;
				case 4:editpro(prolist, prodet, procount);;
						break;
				case 5:updateInventory(prolist, prodet, procount);;
						break;
				case 6:
						break;
				default: System.out.println("Enter Numbers only Between {1 to 6} ");

			}
			if(choice ==6)
				break;
		}     
    } 
}