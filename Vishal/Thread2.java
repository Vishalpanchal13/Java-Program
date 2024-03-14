class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Thread2 t = new Thread2();
		Thread t1 = new Thread(t);
		t1.start();
	}
}