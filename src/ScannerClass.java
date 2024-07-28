import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println("what is age?");
		int age = scan.nextInt();
		
		System.out.println("what is height?");
		double height = scan.nextDouble();
		
		System.out.println("Your name is " + name );
		System.out.println("Your age is " + age);
		System.out.println("Your height is " +height + "cm tall");
		
	}

}
