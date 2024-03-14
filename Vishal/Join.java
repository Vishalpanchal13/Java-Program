class Join extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
		}
	}
	public static void main(String args[])
	{
		Join t1 = new Join();
		Join t2 = new Join();
		Join t3 = new Join();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t2.start();
		try
		{
			t2.join();
		}
		catch(InterruptedException e)
		{

		}
		t1.start();
		t3.start();		
	}
}