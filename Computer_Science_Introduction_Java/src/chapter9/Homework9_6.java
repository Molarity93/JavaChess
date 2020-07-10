package chapter9;

public class Homework9_6 {

	public static void main(String[] args) {
		java.util.Random r = new java.util.Random();
		int[] numbers = new int[100000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(10000);
		}

		StopWatch stopWatch = new StopWatch();
		selectionSort(numbers);
		stopWatch.stop();

		System.out.println("Sorting 100,000 numbers took " + stopWatch.getElapsedTime() + " milliseconds");
	}

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}

class StopWatch {
	private long startTime = System.currentTimeMillis();
	private long endTime = startTime;

	public StopWatch() {
	}

	public long getStartTime() {
		return this.startTime;
	}

	public long getEndTime() {
		return this.endTime;
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}
/*
Sorting 100,000 numbers took 1100 milliseconds
*/
