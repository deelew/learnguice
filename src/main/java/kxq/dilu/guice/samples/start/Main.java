package kxq.dilu.guice.samples.start;

import com.google.inject.Guice;
import com.google.inject.Injector;
import kxq.dilu.guice.samples.CreditCard;
import kxq.dilu.guice.samples.PizzaOrder;
import kxq.dilu.guice.samples.BillingService;
import kxq.dilu.guice.samples.modules.BillingModule;

/**
 * Created with IntelliJ IDEA.
 * User: dilu.kxq
 * Date: 14-5-22
 * Time: ÏÂÎç12:09
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Injector injector = Guice.createInjector(new BillingModule()) ;
        BillingService billingService = injector.getInstance(BillingService.class);
        billingService.chargeOrder(new PizzaOrder(), new CreditCard());
    }
}
