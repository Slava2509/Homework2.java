package Homework.Homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {

        noteBook Sumsung1 = new noteBook("Super", "Sumsung", "Black", "12", "256", "17","1000");
        noteBook Sumsung2 = new noteBook("SuperS", "Sumsung", "White", "24", "528", "15","2000");
        noteBook Toshiba = new noteBook("Average", "ToshibaB", "Black", "24", "256", "14","1500");

//        System.out.println(Sumsung2);
//        System.out.println(Sumsung2.color);

        List<noteBook> noteBookList = List.of(Sumsung1,Sumsung2,Toshiba);
        System.out.println("Введите параметр для поиска, где:\n1 - по цвету\n2 - по объему оперативной памяти");
        Scanner sc = new Scanner(System.in);
        int userSearch = sc.nextInt();
        System.out.println("Введите интересующий параметр (цвет или объем)");
        Scanner csUserSearch = new Scanner(System.in);
        String parametrUser = csUserSearch.nextLine();

        if (userSearch == 1) {
            for (noteBook color: noteBookList) {
                if (color.getColor().equalsIgnoreCase(parametrUser)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (userSearch == 2) {
            for (noteBook RAM :noteBookList) {
                if (RAM.getRAM().equals(parametrUser)) {
                    System.out.println(RAM.printInfo());
                }
            }
        }
    }
}
