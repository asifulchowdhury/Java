package Exceptions;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.nio.file.NoSuchFileException;

	public class FileExceptionHandling {
	    public static void main(String[] args) {
	        String filename = "nonexistent.txt";

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(filename));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	        } catch (NoSuchFileException e) {
	            System.out.println("Error: No such file exists.");
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}
