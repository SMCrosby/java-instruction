
public class Quad implements IPerimeter {

	private int side1;
	private int side2;
	private int side3;
	private int side4;
	
	
	public Quad(int s1, int s2, int s3, int s4) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
		side4 = s4;
	}
	
	public int perimeter() {
		return side1 + side2 + side3 + side4;
	}
	
	
	
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public int getSide4() {
		return side4;
	}
	public void setSide4(int side4) {
		this.side4 = side4;
	}
	
	public Quad() {
		
	}

	
		
}
