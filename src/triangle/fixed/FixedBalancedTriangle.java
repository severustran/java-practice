package triangle.fixed;

import java.util.HashMap;
import java.util.Map;

public class FixedBalancedTriangle extends FixedTriangle {

	private static final String BALANCED_TRIANGLE = "Tam Giac Can";
	private static final String TAM_GIAC_DEU = "Tam Giac Deu";
	
	public FixedBalancedTriangle(int edge1, int edge2, int edge3) {
		super(edge1, edge2, edge3);
	}
	
	@Override
	public String getName() {
		if (edge1 == edge2 && edge2 == edge3) {
			return TAM_GIAC_DEU;
		} else {
			return BALANCED_TRIANGLE;
		}
	}

	@Override
	public double calcSquareOfTriangle() {
		if (getName().equals(BALANCED_TRIANGLE)) {
			Map<String, Integer> resutls = findDiffEdge(edge1, edge2, edge3);
			int b = resutls.get("EDGE");
			int a = resutls.get("DIFF");
			return 1/2 * a * Math.sqrt(Math.pow(b, 2) - Math.pow(a, 2) / 4);
		} else {
			return Math.sqrt(3) / 4 * Math.pow(edge1, 2);
		}
	}
	
	private Map<String, Integer> findDiffEdge(int... edges){
		Map<String, Integer> results = new HashMap<>();
		int first = edges[0];
		results.put("EDGE", first);
		for (int edge : edges) {
			if (first != edge) {
				results.put("DIFF", edge);
				break;
			}
		}
		return results;
	}
	
}
