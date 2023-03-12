package Homework.Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.Double.*;


//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList <Integer> arr = new ArrayList<>();
        int size = 15;
        int sum = 0;
        for (int i = 0; arr.size() < 15; i++) {
            arr.add(rnd.nextInt(100));
            sum += arr.get(i);
        }
        double average = ((double)sum / arr.size());
        System.out.println(arr);
        System.out.println("Min элемент " + Collections.min(arr));
        System.out.println("Min элемент " + Collections.max(arr));

        System.out.println("Среднее арифметическое arr составляет " + average);
    }
}
