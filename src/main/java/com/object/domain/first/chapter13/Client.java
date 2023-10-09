package com.object.domain.first.chapter13;

public class Client {

    public void resize(Rectangle rectangle, int width, int height) {
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        assert rectangle.getWidth() == width && rectangle.getHeight() == height;
    }

    public static void main(String[] args) {
        Square square = new Square(10, 10, 10);
        Client client = new Client();
        client.resize(square, 50, 100);
        System.out.println(square.getHeight());
        System.out.println(square.getWidth());
    }
}
