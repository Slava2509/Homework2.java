package Homework.Homework3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import static java.lang.Character.isDigit;

//3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку,
// найти и удалить целые числа.
public class Task3 {
    public static void main(String[] args) throws Exception
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> arr = new ArrayList<String>();
        for (int i=0; i<5; i++) {
            String s = reader.readLine();
            arr.add(0, s);
        }
        System.out.println(arr);
        for (int i = 0; i<arr.size();i++) {
            String Integer;
            Integer = null;
//            if (arr.get(i) == Integer) {
                if (isDigit(java.lang.Integer.parseInt(arr.get(i)))) arr.remove(i);
        }
        System.out.println(arr);
    }
}
