package com.cc.java;

public class App {
    

    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29);
        output("Name: " + cat.getStringAttributes("#name"));
        output("Fellfarbe: " + cat.getStringAttributes("#furColor"));
        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());
        output("Alter: " + cat.getAge());

        output("-------------");

        Tomcat Tomcat = new Tomcat("Alonzo", "grey", 35);
        output("Name: " + Tomcat.getStringAttributes("#name"));
        output("Fellfarbe: " + Tomcat.getStringAttributes("#furColor"));
        output("Alter: " + Tomcat.getAge());
        
    }

    public static void output(String inputStr) {
        System.out.println(inputStr);
    }

}

