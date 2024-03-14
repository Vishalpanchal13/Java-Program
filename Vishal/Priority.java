class Priority extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
public static void main(String args[])
	{
		Priority t1 = new Priority();
		Priority t2 = new Priority();
		Priority t3 = new Priority();

		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.setPriority(10);
		t2.setPriority(7);
		t3.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}