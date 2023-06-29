package com.hillel.homework9;

public class MinimalCharTask {
    private static int diffChar(String str) { // число разных символов
        StringBuffer a = new StringBuffer(); // строка, в которой каждый символ будет только раз
        String c; // текущий символ в строке
        for (int i = 0; i < str.length(); i++) { // цикл идет по строке
            c = String.valueOf(str.charAt(i)); // получаем текущий символ
            if (a.indexOf(c) == -1) // символ еще не встречался
                a.append(c); // добавляем символ в строку
        }

        return a.length();
    }

    public static void main(String[] args) {
        String[] a = {"fffff", "ab", "foppw", "1234", "f"};
        String goal = a[0];
        System.out.println("Массив: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
            if (diffChar(a[i]) < diffChar(goal)) //идем циклом по массиву сравниваем количество одинаковых символов у стрингов
                goal = a[i];
        }
        System.out.println("");
        System.out.println("первое cлово c наименьшим количеством символов: " + goal + ", в нем таких символов: " + diffChar(goal));
    }


}
