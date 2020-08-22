package quadrilateral;

public class QuadrileteralType2 extends Quadrilateral implements QuadrilateralService{

	private final String HINH_BINH_HANH = "Hinh binh hanh";
	private final String HINH_THOI = "Hinh thoi";
	
	public QuadrileteralType2(int chieuDai, int chieuRong, int duongCheo1, int duongCheo2) {
		super(chieuDai, chieuRong, duongCheo1, duongCheo2);
	}

	@Override
	public double calcArea() {		
		return 200;
	}
	
	@Override
	public String getName() {
		return "";
	}
}
