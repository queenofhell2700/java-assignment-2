package week1;
import java.util.Scanner;
public class largest {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int[] numbers = new int[3];

	        // Taking input from the user
	        System.out.print("Enter the first number: ");
	        numbers[0] = input.nextInt();
	        System.out.print("Enter the second number: ");
	        numbers[1] = input.nextInt();
	        System.out.print("Enter the third number: ");
	        numbers[2] = input.nextInt();

	        // Finding the largest number
	        int largest = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        // Displaying the largest number
	        System.out.println("The largest number is " + largest);
	    }
	}