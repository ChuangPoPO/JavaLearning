package project.javalearning.book.mod03;

public class Mod03Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pencil = new Product();
		pencil.setId(1);
		pencil.setName("pencil");
		pencil.setUnitPrice(5);
		
		Order min, hua;
		min = new Order();
		min.setName("小明");
		min.setProduct(pencil);
		min.setQuantity(10);
		
		hua = new Order();
		hua.setName("曉華");
		hua.setProduct(pencil);
		hua.setQuantity(7);
		
		double answer = (min.getQuantity()-hua.getQuantity())*pencil.getUnitPrice();
		
		System.out.println("When buy " + pencil.getName() + ",");
		System.out.println(min.getName() + " cost $" + min.getQuantity() * pencil.getUnitPrice());
		System.out.println(hua.getName() + " cost $" + hua.getQuantity() * pencil.getUnitPrice());
		System.out.println(min.getName() + " more than " + hua.getName() + "$" + answer);
	}

}
