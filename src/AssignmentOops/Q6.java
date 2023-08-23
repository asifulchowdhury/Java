package AssignmentOops;

	// Abstract class Shape
	abstract class Shape {
	    public abstract double rectangleArea(double length, double breadth);
	    public abstract double squareArea(double side);
	    public abstract double circleArea(double radius);
	}

	// Class Area with methods to calculate areas
	class Area extends Shape {
	    @Override
	    public double rectangleArea(double length, double breadth) {
	        return length * breadth;
	    }

	    @Override
	    public double squareArea(double side) {
	        return side * side;
	    }

	    @Override
	    public double circleArea(double radius) {
	        return Math.PI * radius * radius;
	    }
	}

	public class Q6 {
	    public static void main(String[] args) {
	        Area areaCalculator = new Area();

	        double rectangleArea = areaCalculator.rectangleArea(5, 8);
	        double squareArea = areaCalculator.squareArea(4);
	        double circleArea = areaCalculator.circleArea(3);

	        System.out.println("Area of Rectangle: " + rectangleArea);
	        System.out.println("Area of Square: " + squareArea);
	        System.out.println("Area of Circle: " + circleArea);
	    }
	}