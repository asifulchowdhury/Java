//What is the output of the following program if no error?

package AssignmentOops;

class Q7 {

	    void sum(int x, int y) {
	        System.out.println("Sum of two numbers: " + (x + y));
	    }

	    void sum(int x, int y, int z) {
	        System.out.println("Sum of three numbers: " + (x + y + z));
	    }

	    public static void main(String[] args) {
	        Q7 a = new Q7();

	        a.sum(20, 30);
	        a.sum(30, 40, 50);
	    }
	}
