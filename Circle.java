package sdp3;

public class Circle {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double calculateCircleArea(){
        return Math.PI * r * r;
    }
}
