package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class GreetingTask extends DefaultTask {

    //private String name;
    private String firstName;
    private String lastName;

    @Input
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Input
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @TaskAction
    public void greet() {
        System.out.println("Hello " + this.firstName + " " + this.lastName);
    }

}
