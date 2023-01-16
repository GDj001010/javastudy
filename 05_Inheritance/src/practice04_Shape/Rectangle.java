package practice04_Shape;

public class Rectangle implements Shape {

	// 필드
	private double width;		// 넓이
	private double heighy;		// 높이
	
	
	
	// 생성자
	public Rectangle(double width, double heighy) {
		super();
		this.width = width;
		this.heighy = heighy;
	}
	

	@Override
	public double getArea() {
		
		return width * heighy;
	}



	
	
	

}
