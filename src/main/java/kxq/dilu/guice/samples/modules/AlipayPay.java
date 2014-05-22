/*
 * Created by IntelliJ IDEA.
 * User: dilu.kxq
 * Date: 14-5-22
 * Time: обнГ6:09
 */
package kxq.dilu.guice.samples.modules;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@BindingAnnotation @Target({ElementType.TYPE, ElementType.PARAMETER}) @Retention(RetentionPolicy.RUNTIME)
public @interface AlipayPay {
}
