package org.example;

import groovy.lang.Closure;

public class GreetingExtension {

    private String hello;
    private final Person person = new Person();

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Closure closure) {
        closure.setDelegate(person);
        closure.call();
    }


}
