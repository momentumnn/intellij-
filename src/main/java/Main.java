public class Main {
    public static void main(String[] args) {
//        tasks();
//        shape();
        printable();
    }
    public static void describe(String color, Priority priority) {
        switch(priority) {
        case LOW:
            System.out.println(color + " indicates low priority");
            break;
        case MEDIUM:
            System.out.println(color + " indicates medium priority");
            break;
        case HIGH:
            System.out.println(color + " indicates high priority");
            break;
        }
    }
    public static void  tasks(){
        // create a todo task and print details
        Todo t = new Todo("Read a good book");
        System.out.println(t.getDescription());
        System.out.println(t.isDone());

        // change todo fields and print again
        t.setDone(true);
        System.out.println(t.isDone());

        // create a deadline task and print details
        Deadline d = new Deadline("Read textbook", "Nov 16");
        System.out.println(d.getDescription());
        System.out.println(d.isDone());
        System.out.println(d.getBy());

        // change deadline details and print again
        d.setDone(true);
        d.setBy("Postponed to Nov 18th");
        System.out.println(d.isDone());
        System.out.println(d.getBy());

    }
    public static void priority(){
                describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);

    }
    public static void circle(){
        Circle c = new Circle(1,2, 5);
        c.setX(4);
        c.setY(5);
        c.setRadius(6);
        System.out.println("x      : " + c.getX());
        System.out.println("y      : " + c.getY());
        System.out.println("radius : " + c.getRadius());
        System.out.println("area   : " + c.getArea());

        c.setRadius(-5);
        System.out.println("radius : " + c.getRadius());
        c = new Circle(1, 1, -4);
        System.out.println("radius : " + c.getRadius());

        c = new Circle();
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c = new Circle(0, 0, 10);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c = new Circle(0, 0, -15);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c.setRadius(12);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
    }
    private static Shape[] shapes = new Shape[100];
    private static int shapeCount = 0;

    public static void addShape(Shape shape){
        shapes[shapeCount] = shape;
        shapeCount ++;
    }
    public static void printAreas() {
        for(int i =0;i<shapeCount;i++){
            shapes[i].print();
        }
    }
    public static void shape() {
        addShape(new Circle(5));
        addShape(new Rectangle(3, 4));
        addShape(new Circle(10));
        printAreas();
        addShape(new Rectangle(4, 4));
        printAreas();

    }
    public static void printable(){
        Printable[] printableItems = new Printable[]{
                new Circle(5),
                new Rectangle(3, 4),
                new Person("James Cook")};

        for (Printable p : printableItems) {
            p.print();
        }
    }
}
