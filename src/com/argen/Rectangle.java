package com.argen;

class Rectangle {
    protected int width, height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Квадрат требует равенства сторон
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height; // Квадрат требует равенства сторон
    }
}

