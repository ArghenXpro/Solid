package com.argen;

public class Main3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(3);
        System.out.println("Rectangle area: " + rect.getArea()); // 15

        Square square = new Square();
        square.setWidth(5);
        System.out.println("Square area: " + square.getArea()); // 25
    }
}
