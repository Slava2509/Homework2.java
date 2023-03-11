package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        printMinMaxNum();
        leapYear();
        mooveNumbers();

    }

    // 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

    private static void printMinMaxNum() {
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int min = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("\n" + max);
        System.out.print("\n" + min);
    }

    // 2. Написать метод, который определяет, является ли год високосным, и
    // возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
    // 400-й – високосный.

    private static void leapYear() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год который Вас интересует: ");
        int year = in.nextInt();
        boolean isleapYear = (year % 400 == 0 || year % 4 == 0 ^ year % 100 == 0);
        if (isleapYear) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 3. Дан массив nums = [3,2,2,3] и число val = 3.
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
    // конец массива.
    // Таким образом, первые несколько (или все) элементов массива должны быть
    // отличны от заданного, а остальные - равны ему.

    private static void mooveNumbers() {
        int[] nums = new int[] { 3, 2, 2, 3, 3, 1, 3 };
        int val = 3;
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                temp = nums[nums.length - 1];
                nums[nums.length - 1] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
