package step6_02.method;

import java.util.Arrays;
import java.util.Random;

class ScoreMng_Copy {
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};
	int[] rNum = new int[5];
	
	int answerCnt = 0;
	int score = 0;
	
	void makeAnswer() {
		for (int i = 0; i < rNum.length; i++) {
			rNum[i] = ran.nextInt(5) + 1;
		}
	}
	
	void showAnswer() {
		
		System.out.print("omr = ");
		System.out.println(Arrays.toString(omr));
		
		System.out.print("rNum = ");
		System.out.println(Arrays.toString(rNum));
	}
	
	void checkAnswer() {
		
		answerCnt = 0;
		System.out.print("정오표 = [");
		
		for (int i = 0; i < omr.length; i++) {
			if (omr[i] == rNum[i]) {
				System.out.print("O");
				answerCnt++;
			}
			else {
				System.out.print("X");
			}
		}
		System.out.println("]");
		
		score = 20 * answerCnt;
		System.out.println("점  수 = " + score + "점");
		
	}
	
	void run() {
		
		makeAnswer();
		showAnswer();
		checkAnswer();
		
	}
}

public class MethodEx13_따라하기 {

	public static void main(String[] args) {
		
		ScoreMng_Copy sm = new ScoreMng_Copy();
		sm.run();
		
	}
	
}
