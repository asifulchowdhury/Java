/*Create an interface named "Logger" with a method "log(String message)" that 
 * takes a string message as an argument and returns void. Implement this 
 * interface in two classes named "ConsoleLogger" and "FileLogger" with their 
 * own implementation of the "log()" method. Write a main method to create 
 * objects of both classes and call their respective "log()" methods with a 
 * message*/


package AssignmentOops;

interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console Logger: " + message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        // Implement file logging here
        // For demonstration purposes, let's just print the message
        System.out.println("File Logger: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        consoleLogger.log("This is a message for console logging.");
        fileLogger.log("This is a message for file logging.");
    }
}

