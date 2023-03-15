package Homework.Homework4;
///1. Реализовать консольное приложение, которое:
////        Принимает от пользователя и “запоминает” строки.
////        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
////        Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordList = new LinkedList<>();
        while (true) {
            System.out.print("Введите значение для строки, для выхода введите 'print'");
            String inputString = in.nextLine();
            wordList.addFirst(inputString);

            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }

            if (inputString.equalsIgnoreCase("print")) {
                System.out.println(wordList);
                break;
            }

            if (inputString.equalsIgnoreCase("revert")) {
                wordList.remove((wordList.size() - (wordList.size() - 1)));
//                wordList.removeFirst();
            }
            System.out.println(wordList);
        }
    }
}
