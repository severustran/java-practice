package triangle;

public class Shape {
	private int edge1;
	private int edge2;
	private int edge3;
	
	public Shape() {	
	}
	
	public Shape(int edge1, int edge2, int edge3) {
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
	}
	
	public int getEdge1() {
		return edge1;
	}
	public void setEdge1(int edge1) {
		this.edge1 = edge1;
	}
	public int getEdge2() {
		return edge2;
	}
	public void setEdge2(int edge2) {
		this.edge2 = edge2;
	}
	public int getEdge3() {
		return edge3;
	}
	public void setEdge3(int edge3) {
		this.edge3 = edge3;
	}
	
	public void calcSquareOfTriangle() {
		double square;

		int edge1 = getEdge1();
		int edge2 = getEdge2();
		int edge3 = getEdge3();
		float p = (edge1 + edge2 + edge3)/2;
		
		square = Math.sqrt(p * (p - edge1) * (p - edge2) * (p - edge3));
		
		System.out.println("Dien tich cua tam giac la:" + square);
	}
	
	
	private boolean checkSquareTriangle(int edge1, int edge2, int edge3) {
		boolean result = false;
		
		int longestEdge = Math.max(Math.max(edge1, edge2), edge3);
		if ((longestEdge * longestEdge == edge1*edge1 + edge2*edge2) || (longestEdge * longestEdge == edge3*edge3 + edge2*edge2) || (longestEdge * longestEdge == edge1*edge1 + edge3*edge3))
			result = true;
		return result;
	}
	
	
}

// 3 3 2 