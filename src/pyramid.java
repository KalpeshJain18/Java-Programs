
public class pyramid {
	 public static void main(String[] args)
	 {      
	        int spaces = 4;
	        int stars   = 1;
		for(int r=1;r<=5;r++)
		{
		 for(int i=1;i<=spaces;i++)
		      System.out.print(" ");
		 for(int j=1;j<=stars;j++)
		      System.out.print("* ");
		     
	  	spaces--;
		stars++;
		System.out.println();
		}
	 }

}
