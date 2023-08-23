package AssignmentOops;

	class Student {
	    private String name;

	    public Student() {
	        name = "Unknown";
	    }

	    public Student(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}

	public class Q4 {
	    public static void main(String[] args) {
	        Student student1 = new Student();
	        Student student2 = new Student("Alice");
	        Student student3 = new Student("Bob");

	        System.out.println("Student 1's name: " + student1.getName());
	        System.out.println("Student 2's name: " + student2.getName());
	        System.out.println("Student 3's name: " + student3.getName());
	    }
	}
