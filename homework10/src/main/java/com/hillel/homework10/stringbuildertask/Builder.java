package com.hillel.homework10.stringbuildertask;


public class Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = createString(3,56);
        System.out.println(stringBuilder);


    }

    private static StringBuilder createString(int a, int b) {
        StringBuilder result1 = new StringBuilder();

        result1.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a*b);
        return result1;

    }

}
