package exam;

public class ColorTv extends Tv {

	private int color;	//멤버변수는 가린다
	
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	void printProperty(){
		System.out.println(super.getSize()+ "인치, "+color+"컬러");
	}
	public int getColor() {
		return color;
	}
	
	
	
	
}
