class MyException extends Exception
{
	MyException(String n)
	{
		super(n);
	}
}
class Excep
{
	public static void main(String args[])
	{
		try
		{
			int i=7;
			int j=5;
			if(i<j)
			{
				throw new MyException("i less than j");
			}
			else
			{
				System.out.println(i-j);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}