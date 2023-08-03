package com.hilel.homework15;

import com.hilel.homework15.exceptions.WrongLoginException;
import com.hilel.homework15.exceptions.WrongPasswordException;

public class LoginPasswordValidator {
    public static void validateLoginAndPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(".*_.*") || login.length() >= 20) {
            throw new WrongLoginException("Login should contain an underscore and be less than 20 characters.");
        }

        if (!password.matches(".*_.*") || !password.contains("!") || password.length() >= 20) {
            throw new WrongPasswordException("Password should contain an underscore, an exclamation mark, and be less than 20 characters.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password do not match.");
        }
    }

    public static void main(String[] args) {
        String login = "example_login";
        String password = "example_password!";
        String confirmPassword = "example_password!";

        try {
            validateLoginAndPassword(login, password, confirmPassword);
            System.out.println("Login and password are valid.");
        } catch (WrongLoginException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
