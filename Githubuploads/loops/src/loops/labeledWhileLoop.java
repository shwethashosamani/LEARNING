package loops;

public class labeledWhileLoop {

	public static void main(String[] args) {
		int i=1;
		shwetha:while(i<=5)
		{
			int j=1;
			naveen:while(j<=5)
			{
				System.out.println("* ");
				j++;
				break shwetha;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
