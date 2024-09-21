
public class Rectangle {
	
	private int length = 0;
	private int width = 0;
	
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public void draw() {
		for(int i=0;i<length;i++) {
			for(int j=0;j<width;j++) {
			System.out.print("*");	
			}
			System.out.println();
		}
	}
	
	
	public int calcArea() {
		int area=length*width;
		return area;
	}
	
	public int calcPerimeter() {
		int perimeter=length*2+width*2;
		return perimeter;
	}
	
	public void scale(int factor) {
		length=length*factor;
		width=width*factor;
	}


	public String toString() {
	String s=" length's is "+ length +" and" + " the width is " + width;	
		return s;
	}

}
