
public class Test {
	public static void main(String args[])
	{
		ShoppingCart shCart=ShoppingCart.getInstance();
		

		
		shCart.addItem(new Item("Samsung s5",45000));
		shCart.addItem(new Item("Samsung a5",41000));
		shCart.addItem(new Item("Honour s5",250000));
		shCart.addItem(new Item("Samsung z1",55000));
		shCart.addItem(new Item("Nokia 8",75000));
		shCart.addItem(new Item("Motorolla z3",45000));
		shCart.addItem(new Item("Xamio q5",45000));
		
		Item it=shCart.buy("Honour s5");
		System.out.println(it.toString());
		
		
	}

}
