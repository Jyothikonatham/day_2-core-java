public class RectanglePerimeterCalculator{
	public static void calculatePerimeter(double length,double breadth){
		double p = 2*(length+breadth);
		System.out.println("Perimeter:" + p);
	}
	public static void main(String[] args){
		calculatePerimeter(5.0,3.0);
	}
}
		