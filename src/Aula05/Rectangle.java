package Aula05;

public class Rectangle {
    Integer height, width;
    String name;
    public Rectangle(String name, Integer height, Integer width) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    public Integer getArea() {
        return height * width;
    }
}
