package kxq.dilu.guice.samples.impl;

import kxq.dilu.guice.samples.CreditCardProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: dilu.kxq
 * Date: 14-5-22
 * Time: ����12:08
 * To change this template use File | Settings | File Templates.
 */
public class PaypalCreditCardProcessor implements CreditCardProcessor {

    @Override
    public void proccess() {
        System.out.println("payPal processed ");
    }
}
