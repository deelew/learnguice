package kxq.dilu.guice.samples;

/**
 * Created with IntelliJ IDEA.
 * User: dilu.kxq
 * Date: 14-5-22
 * Time: обнГ1:57
 * To change this template use File | Settings | File Templates.
 */
public interface BillingService {
   public Receipt chargeOrder(PizzaOrder order , CreditCard card);
}
