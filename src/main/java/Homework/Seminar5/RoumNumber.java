package Homework.Seminar5;
//Написать метод, который переведет число из римского формата записи в арабский.
//        Например, MMXXII = 2022

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoumNumber {
    public static void main(String[] args) {
        reformatNumber();
    }

    private static Integer reformatNumber() {
        Map<String,Integer> romanianNumber = romanianNumber();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в римском формате: ");
        String rom = in.next();
        int result = 0;
        for (int i = 0; i < rom.length()-1;i ++){
            int currrent = romanianNumber.get(Character.toString((rom.charAt(i))));
            int next = romanianNumber.get(Character.toString((rom.charAt(i+1))));
            if (currrent < next) {
                result -= currrent;
            } else {
                result += currrent;
            }
        }
        result+=romanianNumber.get(Character.toString((rom.charAt(romanianNumber().size()))));

        System.out.println(result);
        return result;

    }
    private static Map<String,Integer> romanianNumber() {
        Map<String,Integer> romNumber = new HashMap<>();
        romNumber.put("I",1);
        romNumber.put("V",5);
        romNumber.put("X",10);
        romNumber.put("L",50);
        romNumber.put("C",100);
        romNumber.put("D",500);
        romNumber.put("M",1000);
        return romNumber;
    }

}
