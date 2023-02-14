package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class MemoryGame_Copy {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int correctCnt = 0;
	
	void shuffle() {
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(front.length);
			int tmp = front[0];
			front[0] = front[r];
			front[r] = tmp;
		}
	}
	
	void printCard() {
		System.out.println("front = [");
	}
}

public class MethodEx16_따라하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
