package triangle.fixed;

public class FixedTriangle implements SquareOfTriangleService {
	
	private final String name = "Tam Giac Thuong";
	protected final int edge1;
	protected final int edge2;
	protected final int edge3;
	
	public FixedTriangle(int edge1, int edge2, int edge3) {
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
	}
	

	public int getEdge1() {
		return edge1;
	}

	public int getEdge2() {
		return edge2;
	}

	public int getEdge3() {
		return edge3;
	}
	

	public String getName() {
		return name;
	}

	public double calcSquareOfTriangle() {
		System.out.println("Tinh Dien Tich Tam Giac Thuong");
		float p = (edge1 + edge2 + edge3)/2;
		return Math.sqrt(p * (p - edge1) * (p - edge2) * (p - edge3));
	}
	
}
