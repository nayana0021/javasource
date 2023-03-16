package exam;

public class IpTv extends ColorTv {
	
	private String ipAddr;
	
	public IpTv(int size, int color, String ipAddr) {
		super(size, color);
		this.ipAddr = ipAddr;
	}
	
	@Override
	void printProperty() {
		System.out.println("나의 IpTv는 "+super.getSize()+ "인치, "+getColor()+"컬러, 주소는 "+ipAddr+"입니다");
	}
	
}
