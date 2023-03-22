package Homework.Homework6;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Cоздать множество ноутбуков (ArrayList).
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например,
//спросить у пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Integer.*;

public class noteBook {


    private String name;
    private String brand;
    String color;
    private Integer RAM;
    private Integer memory;
    private Integer diagonalScreen;
    private Integer price;

    public noteBook(String name, String brand, String color, String RAM, String memory, String diagonalScreen, String price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.RAM = valueOf(RAM);
        this.memory = valueOf(memory);
        this.diagonalScreen = valueOf(diagonalScreen);
        this.price = valueOf(price);
    }

    @Override
    public String toString() {
        return "noteBook{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", RAM=" + RAM +
                ", memory=" + memory +
                ", diagonalScreen=" + diagonalScreen +
                ", price=" + price +
                '}';
    }

    public void showInfo() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getDiagonalScreen() {
        return diagonalScreen;
    }

    public void setDiagonalScreen(Integer diagonalScreen) {
        this.diagonalScreen = diagonalScreen;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, color, RAM, memory, diagonalScreen, price);
    }

    public String printInfo() {
        System.out.printf("name: %s", "brand: %s", "color: %s", "RAM: %s", "memory", "diagonalScreen: %s", "price: %s");
        return ";";
    }
}

