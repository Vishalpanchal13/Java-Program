class Try
{
	public static void main(String args[])
	{
		System.out.println("Main method started");
		
		int a=10;
		int b=0;
		int c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Main method ended");
	}
}