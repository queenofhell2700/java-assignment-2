package prg1;

import java.util.Scanner;

class Rectangle implements Resizable {
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void resizeHeight(int newHeight) {
        this.height = newHeight;
    }

    @Override
    public void resizeWidth(int newWidth) {
        this.width = newWidth;
    }

    @Override
    public String toString() {
        return "height: " + this.height + " width: " + this.width;
    }
}

interface Resizable {
    public void resizeHeight(int newHeight);
    public void resizeWidth(int newWidth);
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height;
        int width;

        // Initial height and width input
        System.out.println("Enter the height and width of the rectangle:");
        height = scanner.nextInt();
        width = scanner.nextInt();
        System.out.println("height= " + height);
        System.out.println("width= " + width);

        Resizable resizable = new Rectangle(height, width);

        // New height and width input
        System.out.println("Enter new height and width:");
        int newHeight = scanner.nextInt();
        int newWidth = scanner.nextInt();
        resizable.resizeHeight(newHeight);
        resizable.resizeWidth(newWidth);
        System.out.println("height= " + newHeight);
        System.out.println("width= " + newWidth);

        scanner.close();
    }
}
