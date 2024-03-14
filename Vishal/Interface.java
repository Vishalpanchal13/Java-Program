interface Area
{
	public double calc(double n1, double n2);
}
	class Rectangle implements Area
	{
		public double calc(double b,double h)
		{
			return(b*h);
		}
	}
	class Triangle implements Area
	{
		public double calc(double l, double h)
		{
			return((l*h)/2);
		}
		public static void main(String args[])
		{
			Rectangle r=new Rectangle();
			double rArea=r.calc(10,20);
			System.out.println("Area of Rectangle : "+rArea);
			Triangle t=new Triangle();
			double tArea=t.calc(15,31);
			System.out.println("Area of Triangle : "+tArea);
		}
	}
	