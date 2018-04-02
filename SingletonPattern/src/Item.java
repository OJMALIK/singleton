
public class Item 
{
    int id;
	String name;
	long price;
	static int adder=0;
	
	public Item(String name, long price) {
		super();
		this.name = name;
		this.price = price;
		adder++;
		id=adder;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
