package com.hillel.homework9;

public class StringFormatTask {

    public static void main(String[] args) {
        String surname = "Петров";
        String mark = "5"; // здесь выбрала string, чтобы потом сделать setLength, c интом не работает
        String lesson = "Математика";

        StringBuffer lessonChangedEnding = new StringBuffer(lesson);
            lessonChangedEnding.setCharAt(lesson.length()-1, 'е');
            lesson = lessonChangedEnding.toString();
        String print = String.format("Студент %s получил %s по %s", surname, mark, lesson);
        System.out.println(print);
        System.out.println("");

        //после setLength
        System.out.println("Форматирование после изменения размера строки");
        StringBuffer surnameSettedLength = new StringBuffer(surname);
        surnameSettedLength.setLength(15);
        StringBuffer markSettedLength = new StringBuffer(mark);
        markSettedLength.setLength(3);
        lessonChangedEnding.setLength(10);

        String print2 = String.format("Студент %s получил %s по %s", surnameSettedLength, markSettedLength, lessonChangedEnding);
        System.out.println(print2);

    }
}
