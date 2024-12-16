package prg1;

class Circle implements Shape {
    public void draw() {
        System.out.println("circle.draw()...");
    }
    public void erase() {
        System.out.println("circle.erase()...");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("triangle.draw()...");
    }
    public void erase() {
        System.out.println("triangle.erase()...");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("square.draw()...");
    }
    public void erase() {
        System.out.println("square.erase()...");
    }
}

interface Shape {
    public void draw();
    public void erase();
}

public class Demoshape {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle();
        shape.draw();
        shape.erase();
        shape = new Triangle();
        shape.draw();
        shape.erase();
        shape = new Square();
        shape.draw();
        shape.erase();
    }
}     

