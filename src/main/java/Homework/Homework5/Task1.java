package Homework.Homework5;

import java.util.*;

//1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task1 {
    public static Map<String, ArrayList<String>> map= new HashMap<>();

    public static void main(String[] args) {
        Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = sc.nextLine();
        sc.close();
        findPerson(name);
    }

    public static void Person() {
        map.put("Dallas", new ArrayList<>(Arrays.asList ("11231", "22243223")));
        map.put("Nastya", new ArrayList<>(Arrays.asList("332323", "444786563")));
        map.put("Serega", new ArrayList<>(Arrays.asList("2133666", "71234456","4447865631231345")));

    }

    public static void findPerson(String surname) {
        System.out.printf("%s: %s", surname, map.get(surname));

    }

}
