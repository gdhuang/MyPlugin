package org.example;

public class Person {
    private String name;
    private String firstName;
    private String lastName;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }
}
