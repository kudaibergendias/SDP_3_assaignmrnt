package sdp3;

public class CircleAdapter implements Shape{
    private Circle circle;

    public CircleAdapter(Circle circle){
        this.circle =circle;
    }

    @Override
    public double getArea() {
        return circle.calculateCircleArea();
    }
}
