package sdp3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new ScannerShapeAdapter(scanner);

        double area = shape.getArea();
        System.out.println("Area: " + area);

        }
}

