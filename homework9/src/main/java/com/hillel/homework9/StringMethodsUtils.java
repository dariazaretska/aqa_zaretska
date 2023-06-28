package com.hillel.homework9;

public class StringMethodsUtils {

    static String str1 = "I love Java!!!";

        // вывести последний символ
        public static void printLastChar() {
            System.out.println(str1.charAt(str1.length()-1));
        }

        // проверка заканчивается ли на !!!
        public static boolean endsWith() {
            if (str1.endsWith("!!!")) {
                System.out.println("Ends with !!!");
            }
            return false;
        }

        // проверка начинается ли на I love
        public static boolean startsWith() {
            if (str1.startsWith("I love")) {
                System.out.println("Starts with I love");
            }
            return false;
        }

        // проверка содержит ли слово Java
        public static boolean containsWord() {
            if (str1.contains("Java")) {
                System.out.println("Contains Java");
            }
            return false;
        }

        // заменить символ
        public static String replaceSymbol() {
             String f = str1.replace('a', 'o');
             System.out.println(f);
             return str1;
        }
//
//      // позиция подстроки Java
        public static int indexOf() {
            int e = str1.indexOf("Java");
            System.out.println(e);
            return e;
        }
//
//      // верхний регистр
        public static String toUpperCase() {
            System.out.println(str1.toUpperCase());
            return str1;
        }

        // нижний регистр
        public static String toLowerCase() {
            System.out.println(str1.toLowerCase());
            return str1;
        }

        // вырезать строку Java
        public static String cutWord() {
            System.out.println(str1.substring(7,11));
            return str1;
        }





}