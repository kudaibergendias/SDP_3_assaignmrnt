package sdp3;

public class RectangleAdapter implements Shape{
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle){
        this.rectangle = rectangle;
    }
    @Override
    public double getArea() {
        return rectangle.calculateAreaRectangle();
    }
}
