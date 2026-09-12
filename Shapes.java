

abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    public boolean isCongruent(Shape other) {
        return this.getArea() == other.getArea() && this.getPerimeter() == other.getPerimeter();
    }
     
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double sideA;                                          // Declare 
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {            
        this.sideA = sideA;                                         // Initialize 
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override                                                          //
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2; // semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's formula
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;   
    }
}

public class Shapes {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle(8);
        Shape circle2 = new Circle(9);
        Shape rectangle = new Rectangle(10, 20);
        Shape rectangle2 = new Rectangle(20, 10);
        Shape triangle = new Triangle(8, 4, 6);
        Shape triangle2 = new Triangle(4, 6, 8);
        
        // Check congruency between shapes
        System.out.println("Circle 1 and Circle 2 congruent? " + circle.isCongruent(circle2));
        System.out.println("Rectangle 1 and Rectangle 2 congruent? " + rectangle.isCongruent(rectangle2));
        System.out.println("Triangle 1 and Triangle 2 congruent? " + triangle.isCongruent(triangle2));
        
        // Display area and perimeter of each shape
        getAgetP(circle);
        getAgetP(rectangle);
        getAgetP(triangle);

        getAgetP(circle2);
        getAgetP(rectangle2);
        getAgetP(triangle2);

    }

    public static void getAgetP(Shape s){                                            
        System.out.println(" Area: " + s.getArea() + ", Perimeter: " + s.getPerimeter());      
    }

}