package scjp.test;

import scjp.domain.ProductV2;

public class Mod04Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = i;
		j = i+1;
		System.out.println("i : " + i + ", j : " + j);
		
		ProductV2 p1 = new ProductV2(1, "pencil", 10);
		ProductV2 p2 = p1;
		
		p2.setUnitPrice(p1.getUnitPrice() + 5);
		System.out.println(p1.getUnitPrice());
		System.out.println(p2.getUnitPrice());
		//System.out.println(p1 + " ; " + p2);
	}

}
