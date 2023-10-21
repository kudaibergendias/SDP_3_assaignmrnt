package sdp3;

import java.util.Scanner;

public class ScannerShapeAdapter implements Shape{
    private Scanner scanner;

    public ScannerShapeAdapter(Scanner scanner){
        this.scanner = scanner;
    }
    @Override
    public double getArea() {
        System.out.println("Enter the shape type(Circle - C / Rectangle - R): ");
        String shapeType = scanner.nextLine();

        if(shapeType.equals("C")){
            System.out.println("Enter the radius: ");
            double radius = scanner.nextDouble();
            return new Circle(radius).calculateCircleArea();
        }
        else if(shapeType.equals("R")){
            System.out.println("Enter the height: ");
            double heigth = scanner.nextDouble();
            System.out.println("Enter the weight: ");
            double weight = scanner.nextDouble();
            return new Rectangle(weight, heigth).calculateAreaRectangle();
        }
        else{
            System.out.println("Unsupported shape");
            return getArea();
        }
    }
}
