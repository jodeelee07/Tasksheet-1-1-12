import java.lang.Math;

// This is an interface named 'Shape' that defines a contract for classes to implement.
interface Shape {
    // Abstract method signature for getting the area of a shape.
    double calculateArea();
    double calculatePerimeter();
}
// This is the 'AbstractShape' class for Rectangle that implements the 'Shape' interface.
class AbstractShape implements Shape {
    // Private instance variables to store the dimensions of the rectangle.
    String color;
	double length;
    double width;
    // Constructor for creating a Rectangle object with given length and width.
    public AbstractShape(String color, double length, double width) {
        this.color = color;
    	this.length = length;
        this.width = width;
    }
    // Implementation of the 'calculateArea' method as required by the 'Shape' interface.
    @Override
    public double calculateArea() {
        // Calculate and return the area of the rectangle.
        return length * width;
    }
    // Implementation of the 'calculatePerimeter' method as required by the 'Shape' interface.
    @Override
    public double calculatePerimeter() {
        // Calculate and return the area of the rectangle.
        return (length * width) * 2;
    }
}
// This is the 'AbstractShape01' class for Circle that implements the 'Shape' interface.
class AbstractShape01 implements Shape {
    // Private instance variable to store the radius of the circle.
    String color;
	double radius;
    // Constructor for creating a Circle object with a given radius.
    public AbstractShape01(String color, double radius) {
        this.color = color;
    	this.radius = radius;
    }
    // Implementation of the 'calculateArea' method as required by the 'Shape' interface.
    @Override
    public double calculateArea() {
        // Calculate and return the area of the circle using the formula: π * r^2.
        return Math.PI * radius * radius;
    }
 // Implementation of the 'calculatePerimeter' method as required by the 'Shape' interface.
    @Override
    public double calculatePerimeter() {
        // Calculate and return the area of the circle using the formula: 2 * π * r.
        return 2 * Math.PI * radius;
    }
}

public class TaskSheet1_1_12 {
	public static void main(String[] args) {
		 // Create a Rectangle object with length=10 and width=12
        AbstractShape rectangle = new AbstractShape("Red", 10, 12);
        // Create a Circle object with radius=3
        AbstractShape01 circle = new AbstractShape01("Blue", 3);
        
        System.out.println("\nThe Area and Perimeter of the given Shapes\n");
        // Print the area of the Circle
        System.out.println("Area of the "+circle.color+" Circle: " + circle.calculateArea());
        // Print the perimeter of the Circle
        System.out.println("Perimeter of the "+circle.color+" Circle: " + circle.calculatePerimeter()+"\n");
        // Print the area of the Rectangle
        System.out.println("Area of the "+rectangle.color+" Rectangle: " + rectangle.calculateArea());
        // Print the perimeter of the Rectangle
        System.out.println("Perimeter of the "+rectangle.color+" Rectangle: " + rectangle.calculatePerimeter());
        
    }
}
