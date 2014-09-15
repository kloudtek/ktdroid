/*
 * Copyright (c) 2014 Kloudtek Ltd
 */

package com.kloudtek.ktdroid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Methods annotated with this function will run in background (if already running in background thread this does nothing unless always is set to true)
 */
@Target(ElementType.METHOD)
@Retention(CLASS)
public @interface Background {
    boolean safe() default true;
    boolean always() default false;
}
