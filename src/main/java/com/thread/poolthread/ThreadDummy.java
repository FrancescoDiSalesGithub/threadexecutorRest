package com.thread.poolthread;

public class ThreadDummy implements Runnable {

	@Override
	public void run() {
		int val = 1;
		while(!Thread.interrupted())
		{
			try
			{
				
				System.out.println( Thread.currentThread().getName()+" val: "+val);	
				if(val == 2)
					this.additional();
				if(val == 3)
				{
					this.add2();
					val=1;
				}
				else
					val++;
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
		System.out.println("stopping thread");

	}
	
	public void additional()
	{
		for(int i=0;i<9999999;i++)
		{
			System.out.println( Thread.currentThread().getName()+" val: "+i);	
			System.out.println("mumbling "+i);
		}
		
	}
	
	public void add2()
	{
		for(int i=0;i<9999999;i++)
		{
			System.out.println( Thread.currentThread().getName()+" val: "+i);
			System.out.println("laugh "+i);
		}
	}

}
