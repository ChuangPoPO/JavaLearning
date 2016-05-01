package scjp.test;

import scjp.domain.ProductV2;

public class Mod04Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductV2 p = new ProductV2(1, "i-Pad");
		
		p.setUnitPrice(45500);
		System.out.println(p.getId());
		System.out.println(p.getName());
		
		ProductV2 pencil = new ProductV2();
		pencil.setId(1);
		pencil.setName("pencil");
		pencil.setUnitPrice(5);
	}

}
