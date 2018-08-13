package SimpleExamples;

//use of thread
public class CountDownApp {
	public static void main(String[] args) {
		// Thread t1= new CountDownClock();//if extended Thread
		CountDownClock1 t = new CountDownClock1();
		Thread t1 = new Thread(t);
		t1.start();
	}
}

class CountDownClock1 implements Runnable {
	public void run() {
		for (int i = 20; i >= 0; i--) {
			System.out.println("T minus" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
