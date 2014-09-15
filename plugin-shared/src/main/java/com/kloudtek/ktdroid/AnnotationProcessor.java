/*
 * Copyright (c) 2014 Kloudtek Ltd
 */

package com.kloudtek.ktdroid;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yannick on 03/09/2014.
 */
public class AnnotationProcessor {
    private File[] classesDirs;

    public AnnotationProcessor(File[] classesDirs) {
        this.classesDirs = classesDirs;
    }

    public void execute() {
        if (classesDirs != null && classesDirs.length > 0) {
            for (File classesDir : classesDirs) {
                process(classesDir);
            }
        }
    }

    private void process(File classesDir) {
        if (!classesDir.exists()) {
            return;
        }
        ArrayList<File> pending = new ArrayList<File>();
        addChildrens(classesDir, pending);
        while (!pending.isEmpty()) {
            File file = pending.remove(0);
            if (file.isDirectory()) {
                addChildrens(file,pending);
            } else if( file.getName().toLowerCase().endsWith(".class") ) {
                processClass(file);
            }
        }
    }

    private void processClass(File file) {
        
    }

    private void addChildrens(File dir, ArrayList<File> list) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                list.addAll(Arrays.asList(files));
            }
        }
    }
}
