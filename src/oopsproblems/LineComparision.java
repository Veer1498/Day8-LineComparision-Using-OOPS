package oopsproblems;
import java.util.Scanner;

public class LineComparision {
	
	static int x1, x2, x3, x4, y1, y2, y3, y4, value;
	static double Length1, Length2;
	
		// input from user for variables
	
		public static void Cordinates() {
			Scanner sc = new Scanner(System.in);
			System.out.println("For Line 1: Enter the cordinates of 1st point");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			
			System.out.println("For Line 1: Enter the cordinates of 2nd point");
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			
			System.out.println("For Line 2: Enter the cordinates of 1st point");
			x3 = sc.nextInt();
			y3 = sc.nextInt();
			
			System.out.println("For Line 2: Enter the cordinates of 2nd point");
			x4 = sc.nextInt();
			y4 = sc.nextInt();
		}
		
		// method to calculate the length 
		
		public static void LengthOfLines() {
		
		Length1 = (int) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		Length2 = (int) Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		System.out.println("Lengths of Line1 and Line2 are "+ Length1 +" , "+ Length2+ ".");
	}
		// method to compare the lines
		
		public static void Comparing() {
		value = Double.compare(Length1, Length2);
		if (value == 0)
			System.out.println("Lines are equal");
		else if (value > 1)
			System.out.println("Line 1 is greater than Line 2");
		else
			System.out.println("Line 1 is less than Line 2");
	}
		

}	
