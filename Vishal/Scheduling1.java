class Scheduling1 extends Thread
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
		Scheduling1 t1 = new Scheduling1();
		Scheduling1 t2 = new Scheduling1();
		Scheduling1 t3 = new Scheduling1();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}