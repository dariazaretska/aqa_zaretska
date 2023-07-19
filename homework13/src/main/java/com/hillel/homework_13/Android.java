package com.hillel.homework_13;

import java.util.Scanner;

public class Android extends Phones implements PhonesFunctions {

    private String androidType;

    static Scanner scanner = new Scanner(System.in);
    public Android(double displaySize, int memory, double cameraMpx, String androidType) {
        super(displaySize, memory, cameraMpx);
        this.androidType = androidType;
    }

    public Android() {};

    public String getAndroidType() {
        return androidType;
    }

    public void setAndroidType(String androidType) {
        if (androidType != null) {
            this.androidType = androidType;
        }
    }

    public int call(){
        System.out.println("Enter phone number, only digits accepted");
        int number = 1;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            System.out.println("Calling..." + "\n");
        } else {
            System.out.println("You entered not a number");
            scanner.next();
        }
        return number;
    }
    @Override
    public String sms() {
        System.out.println("To send message write text");
        String str1 = "a";
        if (scanner.hasNextInt()) {
            str1 = String.valueOf(scanner.nextInt());
        }
        return str1;
    }
    @Override
    public String internet () {
        System.out.println("Chrome is opened. Enter search request");
        String str2 = "a";
        if (scanner.hasNextInt()) {
            str2 = String.valueOf(scanner.nextInt());
        }
        return str2;
    }


}
