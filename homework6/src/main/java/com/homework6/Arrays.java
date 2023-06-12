package com.homework6;


public class Arrays {
    public static void main(String[] args) {

//        //task1
//        int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        //task2
//        int[] arr2 = new int[51];
//        for (int i = 1; i < arr2.length; i++) {
//            arr2[i] = 2 * i - 1;
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = arr2.length - 1; i >= 1; i--) {
//            arr2[i] = 2 * i - 1;
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();

        //task3
        // переменные sum1 и sum2 - среднее арифметическое массивов
        int sum1 = 0;
        int sum2 = 0;

        int[] arr3 = new int[5];
        for(int i=0;i<arr3.length;i++) {
            arr3[i] = (int) (Math.random() * 6);
            System.out.print(arr3[i] + " ");
            sum1+=(int)arr3[i]/arr3.length;
        }
        System.out.println();

        int[] arr4 = new int[5];
        for(int i=0;i<arr4.length;i++) {
            arr4[i] = (int) (Math.random() * 6);
            System.out.print(arr4[i] + " ");
            sum2+=(int)arr4[i]/arr4.length;
        }
        System.out.println();

        //Сравнение средеарифметическое какого из массивов больше
        if(sum1==sum2) {
            System.out.println("Средние арифметические значения двух массивов равны");
        }
        else if(sum1>sum2) {
            System.out.println("Среднее арифметическое значение первого массива больше");
        }
        else {
            System.out.println("Среднее арифметическое значение второго массива больше");
        }
    }
}
