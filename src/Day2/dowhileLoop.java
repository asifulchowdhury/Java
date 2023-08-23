package Day2;

public class dowhileLoop {
static int plusMethodint(int x, int y) {
	return (x+y);
}
static double plusMethoddouble(double a, double b) {
	return (a+b);
}
	public static void main(String[]args) {
		int myAge =plusMethodint(3,5);
		double myAge2 =plusMethoddouble(3.45,5.43);
		System.out.println("int: "+ myAge);
		System.out.println("Double: "+ myAge2);
	}
}