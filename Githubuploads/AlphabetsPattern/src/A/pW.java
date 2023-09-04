package A;

public class pW {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
	     {
	    	 for(int j=0;j<=n;j++)
	    	 {
	    		 if((i==n&&j==0||i==10&&j==1||i==9&&j==2||i==8&&j==3||i==7&&j==4||i==6&&j==5||i==6&&j==6||i==7&&j==7||i==8&&j==8||i==9&&j==9||i==10&&j==10||j==0 ||(j==n)))

	    			 System.out.print("*");
	    		 else
	    			 System.out.print(" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
