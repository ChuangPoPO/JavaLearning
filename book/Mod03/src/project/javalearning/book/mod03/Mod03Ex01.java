package project.javalearning.book.mod03;

public class Mod03Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pencil = new Product();
		pencil.id = 1;
		pencil.name = "鉛筆";
		pencil.unitPrice = 5;
		
		Order min, hua;
		min = new Order();
		min.name = "小明";
		min.product = pencil;
		min.quantity = 10;
		
		hua = new Order();
		hua.name = "曉華";
		hua.product = pencil;
		hua.quantity = 7;
		
		double answer = (min.quantity - hua.quantity) * pencil.unitPrice;
		System.out.println("When buy " + pencil.name + ",");
		System.out.println(min.name + " cost $" + min.quantity * pencil.unitPrice);
		System.out.println(hua.name + " cost $" + hua.quantity * pencil.unitPrice);
		System.out.println(min.name + " more than " + hua.name + "$" + answer);

	}

}
