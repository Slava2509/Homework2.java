package Homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class task2 {
    private static String path;

    public static void main(String[] args) {
        task2("C:\\Users\\Екатерина\\Desktop\\Вячеслав\\Java\\Homework\\src\\main\\java\\Homework2");
    }
    private static StringBuilder task2(String pathDir) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(System.lineSeparator()+"Text");
        }
        System.out.println(sb);

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("C:\\Users\\Екатерина\\Desktop\\Вячеслав\\Java\\Homework\\src\\main\\resources\\files\\Text.txt");
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }
        return sb;
    }

//    private static task2(String path) {
//        File dir = new File(path);
//        if (dir.isFile()) throw new RuntimeException("Неверный файл");
//        return dir.list();
//    }

}
