/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

/**
 * A simple 'hello world' plugin.
 */
public class GreetingPlugin implements Plugin<Project> {
    public void apply(Project project) {
        // add DSL
        GreetingExtension greetingExtension = project.getExtensions().create("greeting", GreetingExtension.class);

        // Register a task
        project.getTasks().register("greeting", task -> {
            task.doLast(s -> System.out.println(greetingExtension.getHello() + " " + greetingExtension.getPerson().getFirstName() + " " + greetingExtension.getPerson().getLastName()));

        });
    }
}
