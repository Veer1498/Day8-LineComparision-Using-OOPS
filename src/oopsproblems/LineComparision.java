package oopsproblems;

public class LineComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparision Computation Program");
		int x1 = 2;
		int x2 = 3;
		int y1 = 5;
		int y2 = 2;
		double lengthOfLine1 = Math.sqrt (((x2-x1)^2)+((y2-y1)^2));
		Integer obj1 = new Integer((int)lengthOfLine1);
		System.out.println("The points x1= " +x1);
		System.out.println("The points x2= " +x2);
		System.out.println("The points y1= " +y1);
		System.out.println("The points y2= " +y2);
		System.out.println("Length of Line1 = " + lengthOfLine1);
	}

}
