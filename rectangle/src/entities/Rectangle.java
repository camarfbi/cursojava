package entities;

public class Rectangle {	
	public double whidth, height;
	
	public double area(){
		return whidth * height;
	}
	
	public double perimeter() {
		return (whidth * 2) + (height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(whidth,2)) + (Math.pow(height, 2))); 
	}
	
}
