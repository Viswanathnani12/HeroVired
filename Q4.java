import java.util.*;
class pro{
    String pname;
    String spec;
	int cost;
	int count;
	pro(String name,String spec,int cost,int count)
    {
        this.pname = name;
        this.spec = spec;
		this.cost = cost;
		this.count = count;
	}
	public void changepname(String name) 
    {
		this.pname = name;
	}
	public String getpname() 
    {
		return this.pname;
	}
	public void updatespec(String spec) {
		this.spec = spec;
	}
	public int pcount() 
    {
		return this.count;
	}
	public void updatecount(int count) {
		this.count = count;
	}
	public void updatecost(int cost) {
		this.cost = cost;
	}
    public void pdetails() 
    {
		System.out.println("Product Name:- "+this.pname);
		System.out.println("Product Specification:- "+this.spec);
		System.out.println("Product Cost:- "+this.cost);
		System.out.println("Product Count:- "+this.count);
	}
}

public class Q4 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
    {
		System.out.println("Enter No of products:- ");
		ArrayList<pro> li= new ArrayList<>();
        int n = s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) 
        {
			System.out.println("Enter Product Name:-");
			String name = s.nextLine();
			System.out.println("Enter Product Specification:-");
			String spec = s.nextLine();
			System.out.println("Enter Product Cost:-");
			int cost = s.nextInt();
			System.out.println("Enter Product Count:-");
			int count = s.nextInt();
			pro p1 = new pro(name,spec,cost,count);
			li.add(p1);
			System.out.println();
		}
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
				case 1: proli(li);
						break;
				case 2:pcount(li);
						break;
				case 3:pdetails(li);
						break;
				case 4:editpro(li);
						break;
				case 5:updateInventory(li);
						break;
				case 6:
						break;
				default: System.out.println("Enter Numbers only Between {1 to 6} ");

			}
			if(choice ==6)
				break;
		}
	}
	public static void editpro(ArrayList<pro> li) 
    {
		System.out.println("Enter Product Name:- ");
		String pname = s.nextLine();
		for(pro p: li) {
			if(p.getpname().compareToIgnoreCase(pname) == 0) 
            {
				System.out.println("Choose the Option to Edit:- ");
                System.out.println("1.Cost");
                System.out.println("2.Specification");
                System.out.println("3.Product Count");
				int ch = s.nextInt();
				if(ch == 1) 
                {
                    System.out.println("Enter Product Cost:-");
					int cost = s.nextInt();
					p.updatecost(cost);	
				}
                else if(ch == 2) 
                {
                    System.out.println("Enter Product Specification:- ");
					s.nextLine();
					String st = s.nextLine();
					p.updatespec(st);
				}
                else 
                {
					System.out.println("\nEnter Product Count:-");
					int count = s.nextInt();
					p.updatecount(count);
				}
				return;
			}
            System.out.println();
		}
		System.out.println("Product not Found");
		System.out.println();
	}

	public static void pdetails(ArrayList<pro> li) 
    {
		System.out.println("Enter Product Name:- ");
		s.nextLine();
		String pname = s.nextLine();
		System.out.println("````````````````````````````");
		for(pro p: li) 
        {
			if(p.getpname().compareToIgnoreCase(pname) == 0) 
            {
				p.pdetails();
				return;
			}
		}
		System.out.println("\nProduct not Found");
	}
    public static void updateInventory(ArrayList<pro> li) 
    {
		System.out.println("******************");
		System.out.println("1.Add Poduct");
		System.out.println("2.Delete Product");
		System.out.println("Enter your choice:-");
		System.out.println();
		int n = s.nextInt();
		if(n == 1) 
        {
			System.out.println("Enter Product Name:-");
			String name = s.nextLine();
			System.out.println("Enter Product Specification:-");
			String spec = s.nextLine();
			System.out.println("Enter Product Cost:-");
			int cost = s.nextInt();
			System.out.println("Enter Product Count:-");
			int count = s.nextInt();
			pro p1 = new pro(name,spec,cost,count);
			li.add(p1);
			System.out.println();
		}
        else 
        {
			System.out.println("Enter Product Name to Delete:- ");
			int i=0;
			String pname = s.nextLine();
			for(pro p: li) 
            {
				if((p.getpname()).compareToIgnoreCase(pname) == 0) 
					break;
				i++;
			}
			if(i == li.size())
				System.out.println("Product not Found");
			else 
            {
				li.remove(i);
				System.out.println("Product is removed Successfully");
			}		
		}
	}
	public static void proli(ArrayList<pro> li) 
    {
		if(li.size() == 0) 
        {
			System.out.println("No Products");
			return;
		}
		int i = 1 ;
		for(pro p:li)
			System.out.println((i++) + " " +p.getpname());
	}
    public static void pcount(ArrayList<pro> li) 
    {
		System.out.print("\nEnter Product Name:- ");
		s.nextLine();
		String pname = s.nextLine();
		boolean f = false;
		for(pro p: li) 
        {
			if((p.getpname()).compareToIgnoreCase(pname) == 0) 
            {
				System.out.println("count of "+p.getpname() + " is "+p.pcount());
				f = true;
				break;
			}
		}
		if(!f)
			System.out.println("Product Not found");
	}
}