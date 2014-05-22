package kxq.dilu.guice.samples.modules;

import com.google.inject.AbstractModule;
import kxq.dilu.guice.samples.BillingService;
import kxq.dilu.guice.samples.CreditCardProcessor;
import kxq.dilu.guice.samples.DatabaseTransactionLog;
import kxq.dilu.guice.samples.TransactionLog;
import kxq.dilu.guice.samples.impl.AlipayCreditCardProcessor;
import kxq.dilu.guice.samples.impl.PaypalCreditCardProcessor;
import kxq.dilu.guice.samples.impl.RealBillingService;

/**
 * Created with IntelliJ IDEA.
 * User: dilu.kxq
 * Date: 14-5-22
 * Time: ÏÂÎç12:00
 * To change this template use File | Settings | File Templates.
 */
public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
//        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
        bind(CreditCardProcessor.class).annotatedWith(AlipayPay.class).to(AlipayCreditCardProcessor.class);
        bind(BillingService.class).to(RealBillingService.class);
    }
}
