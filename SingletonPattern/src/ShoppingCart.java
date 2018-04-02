import java.util.ArrayList;

public class ShoppingCart 
{
	private static ShoppingCart instance=new ShoppingCart();
	ArrayList<Item> cart=new ArrayList<Item>();
	
	
	private ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static ShoppingCart getInstance()
	{
		return instance;
	}
	
	public void addItem(Item item)
	{
		cart.add(item);
	}
	
	public Item buy(String e)
	{
		boolean ch=false;
		Item t=null;
		// find item
		for(int i=0;i<cart.size();i++)
		{
			t=cart.get(i);
			if(t.name.equals(e))
			{
				System.out.println("Item available bought sucessfully");
				ch=true;
				break;
			}
		}
		
		if(!ch)
		{
			t=null;
			System.out.println("Item not available");
		}
		
		return t;
		
	}
	
	

}
