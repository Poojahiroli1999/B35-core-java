package org.tnsindia.threaddemo;

public class SynchronizedMethodDemo {
	synchronized void arraysum(int[] arr)
	{
		int sum=0;
		for(@SuppressWarnings("unused") int itr:arr)
		{
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	

}

