package A;

public class pQ {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
	     {
	    	 for(int j=0;j<=n;j++)
	    	 {
	    		 if(i<=n/2&&j==n/2||j<=n/2&&i==n/2||i==0&&j<=n/2||i<=n/2&&j==0||i==3&&j==3||i==4&&j==4||i==6&&j==6||i==7&&j==7||i==8&&j==8||i==9&&j==9||i==10&&j==10||i==n&&j==n)
	    			 System.out.print("*");
	    		 else
	    			 System.out.print(" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
