package cod.ui.commands;

import cod.ShoppingCart;
import cod.tcf.*;

import java.util.List;

/**
 * Created by user on 04/01/2016.
 */
public class Send extends OrderCookie{

    protected Customer customer;

    @Override
    public String identifier() { return "send"; }

    @Override
    public void load(List<String> args) {
        customer = system.getCustomers().findByFirstName(args.get(0)).get();

    }

    @Override
    public void execute() {
        ShoppingCart cart = system.getShoppingCart(customer);
       // Boulangeries.boulangerie.addCommand(cart);
    }

    @Override
    public String describe() {
        return "Envoies votre shopping cart";
    }
}
