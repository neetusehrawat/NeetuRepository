
public class AreaOfShapes {
	
	double area;
	
	
	void areaOfShape(float radius) {
		
		  area= 22/7*radius*radius;
		System.out.println("Cirle" + area);
		
		
	}
	
	void areaOfShape(float base,float height) {
		area=0.5*base*height;
		System.out.println("Triangle" + area);
		
	}
	
	void areaOfShape(double side) {
		area= side*side;
		System.out.println("square" + area);
		
	}
	
	 public static void main(String[] arg) {
		AreaOfShapes Shape= new AreaOfShapes();
		Shape.areaOfShape(5);
		Shape.areaOfShape(4,8);
		Shape.areaOfShape(5.0);
		
	}

}
