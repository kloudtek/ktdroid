/*
 * Copyright (c) 2014 Kloudtek Ltd
 */

package com.kloudtek.ktdroid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by yannick on 19/08/2014.
 */
@Target(ElementType.METHOD)
@Retention(CLASS)
public @interface UI {
}
