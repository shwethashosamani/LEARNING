package A;

public class pR {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
	     {
	    	 for(int j=0;j<=n;j++)
	    	 {
	    		 if(i==0||j==0 ||(i==0&&j<=n/2||j==n&&i<=n/2||i==n/2||i==5&&j==1||i==6&&j==2||i==7&&j==3||i==8&&j==4||i==9&&j==5||i==10&&j==6||i==n&&j==7))
	    			 System.out.print("*");
	    		 else
	    			 System.out.print(" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
