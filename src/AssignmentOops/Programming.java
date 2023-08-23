package AssignmentOops;

public class Programming {
     String message;

    public Programming() {
        message = "I love programming languages";
    }

    public Programming(String language) {
        message = "I love " + language;
    }

    public void printMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Programming defaultProgramming = new Programming();
        Programming javaProgramming = new Programming("Java");
        
        defaultProgramming.printMessage(); // Prints "I love programming languages"
        javaProgramming.printMessage();    // Prints "I love Java"
    }
}