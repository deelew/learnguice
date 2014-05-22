package kxq.dilu.guice.samples.impl;

import kxq.dilu.guice.samples.CreditCardProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: dilu.kxq
 * Date: 14-5-22
 * Time: обнГ6:13
 * To change this template use File | Settings | File Templates.
 */
public class AlipayCreditCardProcessor implements CreditCardProcessor {

    @Override
    public void proccess() {
        System.out.println("alipay proccessed");
    }
}
