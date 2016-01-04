package cod.ui.commands;

import java.util.ArrayList;
import java.util.List;

import cod.CookieOnDemand;
import cod.CustomerDatabase;
import cod.tcf.Customer;
import cod.ui.framework.Command;

public class CreateRecepe  extends Command<CookieOnDemand> {
	protected String name;
	protected Customer customer;
	protected String pate;
	protected String arome;
	protected ArrayList<String> garniture = new ArrayList<String>();
	
	@Override
	public String identifier() { return "create"; }

	@Override
	public String describe() { return "create a new customer in the system (create CUSTOMER)"; }

	@Override
	public void load(List<String> args) {
		customer = system.getCustomers().findByFirstName(args.get(0)).get();
		pate = args.get(1);
		arome = args.get(2);
		for (int i = 3; i < args.size(); ++i) 
			garniture.add(args.get(i));	
		name = pate+ " "+ arome;
	}

	@Override
	public void execute() {
		/*
		Recipes.
		Customer c = new Customer(customerName);
		db.add(c);
		*/
	}

}