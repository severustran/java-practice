package quadrilateral;

public class Quadrilateral {
	
	private final String TU_GIAC = "Tu giac";
	protected int chieuDai;
	protected int chieuRong;
	protected int duongCheo1;
	protected int duongCheo2;
	
	public Quadrilateral(int chieuDai, int chieuRong, int duongCheo1, int duongCheo2) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		this.duongCheo1 = duongCheo1;
		this.duongCheo2 = duongCheo2;
	}
	public int getChieuDai() {
		return chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public int getDuongCheo1() {
		return duongCheo1;
	}
	public int getDuongCheo2() {
		return duongCheo2;
	}
	public String getName() {
		return TU_GIAC;
	}	
}
