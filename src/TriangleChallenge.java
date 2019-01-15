import java.util.*;

public class TriangleChallenge {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length of the sides of the triangle: ");
			System.out.println("Side 1: ");
			float side_a = sc.nextFloat();
			while(side_a <= 0) {
				System.out.println("The length of the sides of a triangle cannot be zero or negative!");
				System.out.println("Side 1: ");
				side_a = sc.nextFloat();
			}
		
			System.out.println("Side 2: ");
			float side_b = sc.nextFloat();
			while(side_b <= 0) {
				System.out.println("The length of the sides of a triangle cannot be zero or negative!");
				System.out.println("Side 2: ");
				side_b = sc.nextFloat();
			}
	    
			System.out.println("Side 3: ");
			float side_c = sc.nextFloat();
			while(side_c <= 0) {
				System.out.println("The length of the sides of a triangle cannot be zero or negative!");
				System.out.println("Side 3: ");
				side_c = sc.nextFloat();
			}
	    
			if(side_a >= (side_b+side_c) || side_b >= (side_a+side_c) || side_c >= (side_a+side_b))
				System.out.println("It is not a triangle");
	    
			else if(side_a == side_b && side_b == side_c)
				System.out.println("It is an equilateral triangle");
	    
			else if((side_a == side_b && side_a != side_c) || (side_b == side_c && side_b != side_a) || (side_c == side_a && side_c != side_b))
				System.out.println("It is an isosceles triangle");
	    
			else
				System.out.println("It is a scalene triangle");

		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input!");
		}
		catch (Exception e){
			System.out.println("Exception Occured!");
		}
	}
	
}
