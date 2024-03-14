import java.util.*;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Thread1 t = new Thread1();
		t.start();
	}
}