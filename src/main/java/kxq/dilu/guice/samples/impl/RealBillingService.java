package kxq.dilu.guice.samples.impl;

import com.google.inject.Inject;
import kxq.dilu.guice.samples.*;
import kxq.dilu.guice.samples.modules.AlipayPay;

/**
 * Created with IntelliJ IDEA.
 * User: dilu.kxq
 * Date: 14-5-22
 * Time: ÉÏÎç11:56
 * To change this template use File | Settings | File Templates.
 */
public class RealBillingService implements BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    RealBillingService(@AlipayPay CreditCardProcessor processor,
                       TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    @Override
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        processor.proccess();
        System.out.println("do charge order ... order " + order.toString() +",card " + creditCard.toString());
        return new Receipt();
    }
}
