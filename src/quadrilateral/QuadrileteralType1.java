package quadrilateral;

public class QuadrileteralType1 extends Quadrilateral implements QuadrilateralService {

	private final String HINH_CHU_NHAT = "Hinh chu nhat";
	private final String HINH_VUONG = "Hinh vuong";
	
	public QuadrileteralType1(int chieuDai, int chieuRong, int duongCheo1, int duongCheo2) {
		super(chieuDai, chieuRong, duongCheo1, duongCheo2);
	}

	@Override
	public double calcArea() {		
		return 100;
	}
	
	@Override
	public String getName() {
		if ((chieuDai == chieuRong) && (duongCheo1 == duongCheo2))
			return HINH_VUONG;
		else
			return HINH_CHU_NHAT;
	}

}
