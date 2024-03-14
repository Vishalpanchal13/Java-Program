class Sleep extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(n);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException i)
		{
		}
	}
	public static void main(String args[])
	{
		Sleep t1 = new Sleep();
		Sleep t2 = new Sleep();
		Sleep t3 = new Sleep();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}