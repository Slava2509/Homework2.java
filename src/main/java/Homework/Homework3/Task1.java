package Homework.Homework3;

import java.util.ArrayList;
import java.util.Random;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)
public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList <Integer> arr = new ArrayList<>();
        for (int i = 0; i<10; i++){
            arr.add(rnd.nextInt(100));
        }
        System.out.println(arr);
        arr.removeIf(e -> (e % 2) == 0);
        System.out.println(arr);
    }
}
