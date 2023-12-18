package A;

public class pM {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
	     {
	    	 for(int j=0;j<=n;j++)
	    	 {
	    		 if(i==0&&j==0||i==0&&j==1||i==1&&j==1||i==2&&j==2||i==3&&j==3||i==4&&j==4||i==n/2&&j==n/2||i==4&&j==6||i==3&&j==7||i==2&&j==8||i==1&&j==9||i==0&&j==10||j==0 ||(j==n))
	    			 System.out.print("*");
	    		 else
	    			 System.out.print(" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
