package scjp.test;

import scjp.domain.ProductV2;
import scjp.model.ProductService;

//import project.javalearning.book.*;

public class Mod04Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductV2 p = new ProductV2(1, "iPad", 10);
		ProductService s = new ProductService();
		
		s.addUnitPrice(p.getUnitPrice());
		System.out.println(p.getUnitPrice());
		
		s.addUnitPrice(p);
		System.out.println(p.getUnitPrice());
		
		//Order oo = new Order;
		//oo
	}

}
