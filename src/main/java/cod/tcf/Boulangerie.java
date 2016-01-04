package cod.tcf;

<<<<<<< HEAD
import java.util.LinkedList;

=======
>>>>>>> e13dbb2721e25ece6f18d02575fd6afcac66daa4
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
            System.out.println("Ajout commande à boulangerie");
	}
}
