public class Circle extends Shape implements Printable{
    private int x;
    private int y;
    private double radius;
    private static double maxRadius = 0;

    public Circle(){
        this(0,0,0);
    }
    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(int x, int y, double radius){
        setX(x);
        setY(y);
        setRadius(radius);
        if(maxRadius < radius){
            maxRadius = radius;
        }
    }

    @Override
    public int area(){
        return getArea();
    }
    @Override
    public void print(){
        System.out.println("Circle of area " + getArea());
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setRadius(double radius){
        this.radius = Math.max(radius,0);
        setMaxRadius(radius);
    }

    public static void setMaxRadius(double maxRadius) {
        Circle.maxRadius = Math.max(maxRadius, getMaxRadius());
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
    public static double getMaxRadius() {
        return maxRadius;
    }

    public int getArea(){
        return (int)(Math.PI * Math.pow(radius,2));
    }
}

