public class area{
 	public double carea(double length,double width)
{
		return length*width;
	}

	public double carea(double radius)
{
		return Math.PI*radius*radius;
	}
	
	public double carea(int side)
{
		return side*side;
	}

public static void main(String[] args)
{
area calc=new area();

double rarea=calc.carea(2.0,3.0);
System.out.println("Area of rectangle : "+rarea);

double cirarea=calc.carea(6.0);
System.out.println("Area of circle : "+cirarea);

double sqarea=calc.carea(8);
System.out.println("Area of square : "+sqarea);
}
}

