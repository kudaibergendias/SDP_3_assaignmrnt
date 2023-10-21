package sdp3;

public class Rectangle {
    private double weight;
    private double height;

    public Rectangle(double weight, double height){
        this.height = height;
        this.weight = weight;
    }

    public double calculateAreaRectangle(){
        return height * weight;
    }
}
