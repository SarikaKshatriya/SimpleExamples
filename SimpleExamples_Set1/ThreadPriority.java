package SimpleExamples;
//example testing priorities of threads
public class ThreadPriority extends Thread{
	public void run()
	{
		System.out.println("Running Thread:"+Thread.currentThread().getName());
		System.out.println("With priority:"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		//t1.start(); run time error
		t2.start();
	}

}
