package A;

public class pG {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
	     {
	    	 for(int j=0;j<=n;j++)
	    	 {
	    		 if((i==0||j==0 )||(i==n)||(j==n&&i>=n/2)||(i==n/2&&j==n/2)||i==5 && j==6||(i==5&&j==7)||(i==5&&j==8)||(i==5&&j==9)||(i==5&&j==10)||(i==5&&j==n))
	    			 System.out.print("*");
	    		 else
	    			 System.out.print(" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
