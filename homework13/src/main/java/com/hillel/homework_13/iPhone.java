package com.hillel.homework_13;

import java.util.Scanner;

public class iPhone extends Phones implements PhonesFunctions {

    static Scanner scanner = new Scanner(System.in);
    private double iOs;

    public iPhone(double displaySize, int memory, double cameraMpx, double iOs) {
        super(displaySize, memory, cameraMpx);
        this.iOs = iOs;
    }

    public iPhone () {};

    public double getiOs() {
        return iOs;
    }

    public void setiOs(double iOs) {
        if (iOs > 0) {
            this.iOs = iOs;
        }
    }

    public int call(){
        System.out.println("Enter phone number, only digits accepted");
        int number = 1;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            System.out.println("Calling trough Facetime" + "\n");
        } else {
            System.out.println("You entered not a number");
            scanner.next();
        }
        return number;
    }
    @Override
    public String sms() {
        System.out.println("To send iMessage write text");
        String str1 = "a";
        if (scanner.hasNextInt()) {
            str1 = String.valueOf(scanner.nextInt());
        }
        return str1;
    }
    @Override
    public String internet () {
        System.out.println("Safari is opened. Enter search request");
        String str2 = "a";
        if (scanner.hasNextInt()) {
            str2 = String.valueOf(scanner.nextInt());
        }
        return str2;
    }
}
