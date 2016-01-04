import cod.tcf.Boulangerie;
import cod.tcf.Boulangeries;
import cod.ui.InteractiveCoD;

/**
 * Main class. Called when running mvn exec:java
 */
public class Main {

	/**
	 * Main method, no arguments required. Start the Cookie on Demand interactive shell
	 * @param args
	 */
	public static void main(String[] args) {
		Boulangeries.boulangerie = new Boulangerie ("PolytechBou");
		
		System.out.println("\nStarting Cookie on Demand by The Cookie Factory");
		System.out.println(Boulangeries.boulangerie.describe());
		InteractiveCoD icod = new InteractiveCoD();
		icod.run();
		System.out.println("Exiting Cookie on Demand by The Cookie Factory\n");
	}

}
