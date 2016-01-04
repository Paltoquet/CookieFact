package cod.tcf;

import cod.ShoppingCart;

public class Boulangerie {
	private String name;
	
	public Boulangerie(String name) {
		this.name = name;
	}
	public String describe() {
		return "Boulangerie : "+name;
	}
	
	public void addCommand(ShoppingCart sc) {
		
	}
}
