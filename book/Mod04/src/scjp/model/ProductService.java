package scjp.model;

import scjp.domain.ProductV2;

public class ProductService {
	public void addUnitPrice (double unitPrice) {
		unitPrice = unitPrice + 5;
	}
	
	public void addUnitPrice (ProductV2 p) {
		p.setUnitPrice(p.getUnitPrice() + 5);
	}
}
