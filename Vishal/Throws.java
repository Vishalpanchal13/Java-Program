class Throws
{
	int a,b,c;
	public void sum(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			c=a/b;
			System.out.println(c);
		}
	}
	public static void main(String args[])
	{
		Throws t=new Throws();
		t.sum(20,10);
	}
}
