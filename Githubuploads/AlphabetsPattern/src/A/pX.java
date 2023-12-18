package A;

public class pX {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
	     {
	    	 for(int j=0;j<=n;j++)
	    	 {
	    		 if(i==0&&j==0||i==1&&j==1||i==2&&j==2||i==3&&j==3||i==4&&j==4||i==5&&j==5||i==6&&j==6||i==7&&j==7||i==8&&j==8||i==9&&j==9||i==10&&j==10||i==n&&j==n||i==0&&j==n||i==1&&j==10||i==2&&j==9||i==3&&j==8||i==4&&j==7||i==5&&j==6||i==6&&j==5||i==7&&j==4||i==8&&j==3||i==9&&j==2||i==10&&j==1||i==n&&j==0)
	    			 System.out.print("*");
	    		 else
	    			 System.out.print(" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
