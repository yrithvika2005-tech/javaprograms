interface Shape1{
	abstract class Shape{
		void display() {
			System.out.println("Shape base class");
			}
		abstract double area();
	}

	class Rectangle extends Shape{
		double l,b;
		Rectangle(double l, double b){
			this.l=l;
			this.b=b;
		}
		double area() {
			return l*b;
			
		}
	}

	class Circle extends Shape{
		double r;
		Circle(double r){
			this.r=r;
		}
		public Circle(int i, int j) {
			// TODO Auto-generated constructor stub
		}
		double area() {
			return Math.PI*r*r;
		}
	}
	public class AbstractclassDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Rectangle r=new Rectangle(12,5);
			System.out.println("area of Rectangle: "+r.area());
			Circle c=new Circle(12,5);
			System.out.println("Area of circle: "+c.area());

		}

	}
