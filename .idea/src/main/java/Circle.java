public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle(){
        this(0,0,0);
    }
    public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getArea(){
        return (int)(Math.PI * Math.pow(radius,2));
    }
}

