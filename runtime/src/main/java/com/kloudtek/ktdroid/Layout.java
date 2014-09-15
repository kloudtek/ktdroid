/*
 * Copyright (c) 2014 Kloudtek Ltd
 */

package com.kloudtek.ktdroid;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by yannick on 19/08/2014.
 */
@Target(TYPE)
@Retention(CLASS)
public @interface Layout {
    int id();
}
