package com.cc.java;

public class SuperCat {
    
    private String name;
    private String furColor;
    protected int age;
   

    public SuperCat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    /** Getter */
    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name; 
            case "#furColor":
                return furColor; 
            default:
                return "ERROR: ???";
        }
    }


}


    







