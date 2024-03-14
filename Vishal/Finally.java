class Finally
{
	public static void main(String args[])
	{
		System.out.println("Main method started");
		
		int a=10;
		int b=5;
		int c;
		try
		{
			c=a/b;
			System.out.println(c);
			System.out.println("Java.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide zero.");
		}
		finally
		{
			System.out.println("Finally blocked executed.");
		}
		
		System.out.println("Main method ended.");
	}
}