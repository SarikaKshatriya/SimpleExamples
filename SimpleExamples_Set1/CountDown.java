package SimpleExamples;

import java.util.ArrayList;

public class CountDown {
	public static void main(String[] args) {
		CountDownClock clock = new CountDownClock(20);
		ArrayList<Runnable> events = new ArrayList<Runnable>();
		events.add(new LaunchEvent(12, "Flood the Pad", clock));
		events.add(new LaunchEvent(12, "Start Engine", clock));
		events.add(new LaunchEvent(12, "Lift Off", clock));
		clock.start();

		for (Runnable e : events)
			new Thread(e).start();
	}
}

interface TimeMonitor {
	int getTime();
}

class CountDownClock extends Thread implements TimeMonitor {
	private int t;

	public CountDownClock(int start) {

		this.t = start;
	}

	public void run() {
		for (; t >= 0; t--)
			System.out.println("T minus" + t);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public int getTime() {
		return t;
	}

}

class LaunchEvent implements Runnable {
	private int start;
	private String msg;
	TimeMonitor tm;

	public LaunchEvent(int start, String msg, TimeMonitor tm) {
		super();
		this.start = start;
		this.msg = msg;
		this.tm = tm;
	}

	public void run() {
		boolean eventDone = false;
		while (!eventDone) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (tm.getTime() <= start) {
				System.out.println(this.msg);
				eventDone = true;
			}
		}
	}
}
