package com.pluralsight;

public class Person {
    //Attributes
    private String first;
    private String last;
    private int age;

    //Constructor
    public Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    //Setters/Getters
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
