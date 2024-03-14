class message
{
	public void show(String name)
	{
		synchronized(this)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("How are you!! "+name);
			}
		}
	}
}

class mythread extends Thread
{
	message m;
	String name;
	mythread(message m, String name)
	{
		this.m=m;
		this.name=name;
	}
	public void run()
	{
		m.show(name);
	}
}

class Block
{
	public static void main(String args[])
	{
		message obj=new message();
		mythread t1=new mythread(obj,"Panchal");
		mythread t2=new mythread(obj,"Vishal");
		
		t1.start();
		t2.start();
	}
}