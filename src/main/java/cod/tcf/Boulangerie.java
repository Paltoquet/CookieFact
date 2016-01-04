package cod.tcf;

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
	
	public void addCommand(Voucher voucher) {
            fifo.add (voucher);
            System.out.println("Ajout commande à boulangerie");
	}
}
