package com.hillel.homework_13;

public class Main {
    public static void main(String[] args) {
        Android android1 = new Android(15.7, 512, 102.4,"Marshmallow");
        iPhone iphone1 = new iPhone(14.3,1024,105,16.4);
        iphone1.call();
        android1.call();
        iphone1.sms();
        android1.sms();
        iphone1.internet();
        android1.internet();
    }
}