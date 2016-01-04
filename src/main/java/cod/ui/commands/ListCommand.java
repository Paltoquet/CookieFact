package cod.ui.commands;

import cod.CookieOnDemand;
import cod.tcf.Boulangerie;
import cod.tcf.Boulangeries;
import cod.tcf.Customer;
import cod.tcf.Voucher;
import cod.ui.framework.Command;

import java.util.List;

/**
 * Created by user on 04/01/2016.
 */
public class ListCommand extends Command<CookieOnDemand> {


    @Override
    public String identifier() { return "list"; }

    @Override
    public void load(List<String> args) {
    }

    @Override
    public void execute() {
        Boulangeries.boulangerie.print();

    }

    @Override
    public String describe() {
        return "list les commandes de la boulangerie";
    }
}