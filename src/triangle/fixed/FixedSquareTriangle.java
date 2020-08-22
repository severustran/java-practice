package triangle.fixed;

import java.util.ArrayList;
import java.util.List;

public class FixedSquareTriangle extends FixedTriangle 
	implements SquareTriangleService {

	private static final String SQUARE_TRIANGLE = "Tam Giac Vuong";

	public FixedSquareTriangle(int edge1, int edge2, int edge3) {
		super(edge1, edge2, edge3);
	}
	
	
	@Override
	public String getName() {
		return SQUARE_TRIANGLE;
	}

	@Override
	public double calcSquareOfTriangle() {
		List<Integer> results = findEdge(edge1, edge2, edge3); 
		int b = results.get(0);
		int a = results.get(1);
		System.out.println(a);
		System.out.println(b);
		return 1/2 * a * b;
	}
	
	private List<Integer> findEdge(int...edges) {
		int max = Math.max(Math.max(edge1, edge2), edge3);
		List<Integer> results = new ArrayList<Integer>(2);
		for (int edge : edges) {
			if (max != edge) {
				results.add(edge);
			}
		}
		return results;
	}


	@Override
	public boolean isSquareBalanced() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
