package chapter10;

public class Homework10_10 {

	public static void main(String[] args) {
		AQueueClass queue = new AQueueClass();
		
		for (int i = 0; i < 20; i++) {
			queue.enqueue(i);
		}

		for (int i = 0; i < 20; i++) {
			System.out.printf("%2d ", queue.dequeue());
			if ((i + 1) % 5 == 0)
				System.out.printf("\n");
		}
	}
}

/*
0  1  2  3  4 
5  6  7  8  9 
10 11 12 13 14 
15 16 17 18 19
*/