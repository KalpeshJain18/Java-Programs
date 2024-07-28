import java.util.Scanner;

public class FindHypotenuse {

	public static void main(String[] args) {

		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Side of x");
		x = scanner.nextDouble();
		
		System.out.println("Enter Side of y");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("This hypotenuse is " + z);
		
		scanner.close();
	}

}
