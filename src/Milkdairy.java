import java.util.ArrayList;
import java.util.List;

public class Milkdairy {

	private int id;
	private String company;
	private double price;
	private double quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	
	
	@Override
	public String toString() {
		return "Milkdairy [id=" + id + ", company=" + company + ", price=" + price + ", quantity=" + quantity + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Milkdairy md = new Milkdairy();
		md.setId(1);
		md.setCompany("mancha");
		md.setPrice(35.50);
		md.setQuantity(1);
		
		Milkdairy md1 = new Milkdairy();
		md1.setId(1);
		md1.setCompany("mancha");
		md1.setPrice(70);
		md1.setQuantity(2);
		
		Milkdairy md3 = new Milkdairy();
		md3.setId(1);
		md3.setCompany("mancha");
		md3.setPrice(99);
		md3.setQuantity(3);
		
		List list=new ArrayList();
		list.add(md);
		list.add(md1);
		list.add(md3);
		for(Object ob:list) {
			Milkdairy m=(Milkdairy)ob;
			System.out.println(m.getId()+"  "+m.getCompany()+"  "+m.getPrice()+"  "+m.getQuantity());
			
		}

	}

}
