package cod.tcf;

import cod.ShoppingCart;

import cod.ShoppingCart;

import java.util.LinkedList;

import cod.ShoppingCart;

import java.util.LinkedList;

public class Boulangerie {
	private String name;
	private LinkedList<Voucher> fifo = new LinkedList<Voucher>();
	public Boulangerie(String name) {
		this.name = name;
	}
	public String describe() {
		return "Boulangerie : "+name;
	}

	public void print() {
		for (int i = 0; i < fifo.size(); i++) {
			for (Item k : fifo.get(i).getContents()) {
				k.toString();
			}
		}
	}

	public void addCommand(Voucher voucher) {
            fifo.add (voucher);
            System.out.println("Ajout commande � boulangerie");
	}
}
