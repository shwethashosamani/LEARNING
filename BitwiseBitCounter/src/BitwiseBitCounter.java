import java.util.Scanner;

public class BitwiseBitCounter
{
		    public static int countSetBits(int num)
		    {
		        int count = 0;
		        while (num > 0) {
		            count += num & 1; 
		            num >>= 1; 
		        }
		        return count;
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int num = scanner.nextInt();
		        int result = countSetBits(num);
		        System.out.println("Number of set bits: " + result);
		    }
	}


