public class Circle {
 int radius;
 double area;
 public Circle(int radius)
 {
	 this.radius=radius;	 
 }
 public void calculateArea(int radius)
 {
	 area= 3.14*radius*radius;
	 System.out.println("Area is:"+area);
	 
 }
}
