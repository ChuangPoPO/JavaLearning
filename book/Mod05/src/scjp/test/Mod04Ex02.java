package scjp.test;

import scjp.domain.OrderV2;
import scjp.domain.ProductV2;

public class Mod04Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductV2 pen = new ProductV2(1, "Pen", 5);
		
		OrderV2 min, hua;
		min = new OrderV2("小名", pen, 10);
		hua = new OrderV2("曉華", pen, 7);
		
		double answer = (min.getQuantity() - hua.getQuantity()) * pen.getUnitPrice();
		
		System.out.println("When buy " + pen.getName());
		System.out.println(min.getName() + " coasts $" + min.getQuantity() * pen.getUnitPrice());
		System.out.println(hua.getName() + " coasts $" + hua.getQuantity() * pen.getUnitPrice());
		System.out.println(min.getName() + " coasts more than " + hua.getName() + " $" + answer);
	}

}
