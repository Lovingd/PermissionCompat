package com.permmision.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: hzlishang
 * Data: 16/10/12 上午11:31
 * Des:
 * version:
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ActivityPermmision {
}
