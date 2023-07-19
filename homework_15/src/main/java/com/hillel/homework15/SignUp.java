package com.hillel.homework15;

import java.util.Scanner;

public class SignUp {
    private String login;
    private String password;
    private String confirmPassword;

    Scanner scanner = new Scanner(System.in);

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
