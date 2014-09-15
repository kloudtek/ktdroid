/*
 * Copyright (c) 2014 Kloudtek Ltd
 */

package com.kloudtek.ktdroid.maven;

import com.kloudtek.ktdroid.AnnotationProcessor;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.*;

import java.io.File;

/**
 * KTDroid processing plugin
 */
@Mojo(
        name = "weave",
        defaultPhase = LifecyclePhase.PROCESS_CLASSES,
        requiresDependencyResolution = ResolutionScope.COMPILE
)
public class MavenPlugin extends AbstractMojo {
    /**
     * Location of the file.
     * @parameter expression="${project.build.directory}"
     * @required
     */
    @Parameter(property = "classes.dir",defaultValue = "${project.build.directory}",required = true)
    private File classesDir;

    public void execute() throws MojoExecutionException, MojoFailureException {
        new AnnotationProcessor(new File[] {classesDir}).execute();
    }
}
