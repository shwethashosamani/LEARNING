import java.util.Scanner;

public class BitwiseSwapper 
{
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the first integer: ");
		        int first = scanner.nextInt();
		        
		        System.out.print("Enter the second integer: ");
		        int second = scanner.nextInt();
		        
		        // Call the swapping method
		        swapUsingBitwise(first, second);
		        
		        System.out.println("After swapping: First = " + first + ", Second = " + second);
		    }
		    
		    public static void swapUsingBitwise(int a, int b) {
		        // Use a temporary variable to hold one of the values during swapping
		        int temp = a;
		        
		        // Perform the swapping using bitwise XOR
		        a = a ^ b;
		        b = temp ^ b;
		        a = a ^ b;
		    }
		}
