package cod.tcf;

import cod.ShoppingCart;

import java.util.LinkedList;

import cod.ShoppingCart;

public class Boulangerie {
	private String name;
	private LinkedList<ShoppingCart> fifo = new LinkedList<ShoppingCart>();
	public Boulangerie(String name) {
		this.name = name;
	}
	public String describe() {
		return "Boulangerie : "+name;
	}
	
	public void addCommand(ShoppingCart sc) {
            fifo.add (sc);
            System.out.println("Ajout commande � boulangerie");
	}
	public void print(){
		for(int i=0;i<fifo.size();i++){
			for(Item k : fifo.get(i).contents()){
				k.toString();
			}
		}
	}
}
