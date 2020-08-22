package triangle;

import java.util.Scanner;

import triangle.fixed.FixedBalancedTriangle;
import triangle.fixed.FixedSquareTriangle;
import triangle.fixed.FixedTriangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter egde 1: ");
		int edge1 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter egde 2: ");
		int edge2 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter egde 3: ");
		int edge3 = Integer.parseInt(sc.nextLine());
		
		FixedTriangle triangle = checkTriangle(edge1, edge2, edge3);
		System.out.println("Day la: " + triangle.getName());
		System.out.println("Dien tich: " + triangle.calcSquareOfTriangle());
	}
	
	public static FixedTriangle checkTriangle(int ... edges) {
		
		int edge1 = edges[0];
		int edge2 = edges[1];
		int edge3 = edges[2];
		if (isSquareTriangle(edge1, edge2, edge3) ) {
			return new FixedSquareTriangle(edge1, edge2, edge3);
		} else if ((edge1 == edge2) || (edge1 == edge3) || (edge3 == edge2)) {
			return new FixedBalancedTriangle(edge1, edge2, edge3);
		} else {
			return new FixedTriangle(edge1, edge2, edge3);
		}
	}

	private static boolean isSquareTriangle(int edge1, int edge2, int edge3) {
		boolean result = false;
		
		int longestEdge = Math.max(Math.max(edge1, edge2), edge3);
		if ((Math.pow(longestEdge, 2) == Math.pow(edge1, 2) + Math.pow(edge2, 2)) || (longestEdge * longestEdge == edge3*edge3 + edge2*edge2) || (longestEdge * longestEdge == edge1*edge1 + edge3*edge3))
			result = true;
		return result;
	}
	
}
