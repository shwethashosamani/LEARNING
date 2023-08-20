
public class labeleddoWhileloop {
	public static  void main(String []args)
	{
		int i=1;
		 shwetha:do
		{
			int j=1;
			naveen:do
			{
				System.out.println("* ");
				j++;
				break shwetha;
			}while(j<=5);
		}while(i<=5);
	}
}
