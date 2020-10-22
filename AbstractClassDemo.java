abstract class Shape
{
	int a=3,b=4;
	abstract public void printArea();
}
class Rectangle extends Shape
{
	int area_rect;
	//@override
	public void printArea(){
		area_rect=a*b;
		System.out.println("The area of Rectangle is:"+area_rect);
	}
}
class Triangle extends Shape
{
	int area_tri;
	//@override
	public void printArea(){
		area_tri=(int)(0.5*a*b);
		System.out.println("The area of triangle is:"+area_tri);
	}
}
class Circle extends Shape{
	int area_circle;
	//@override
	public void printArea(){
		area_circle=(int)(3.14*a*a);
		System.out.println("The area of circle is:"+area_circle);
	}
}
public class AbstractClassDemo{
	public static void main(String args[]){
		Rectangle r=new Rectangle();
		r.printArea();
		Triangle t=new Triangle();
		t.printArea();
		Circle c=new Circle();
		c.printArea();
	}
}
	