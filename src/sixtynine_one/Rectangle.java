package sixtyNine_one;

public class Rectangle {
	Float width;
	Float height;
	
	public Rectangle(Float width, Float height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		
	}
	
	public float area() {
		return this.width * this.height;
	}
	
	public float perimeter() {
		return (this.width*2) + (this.height*2);
	}
	
	public float diagonal() {
		return (float) Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
	}

}
