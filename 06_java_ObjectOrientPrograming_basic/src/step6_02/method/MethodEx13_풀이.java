package step6_02.method;

import java.util.Arrays;
import java.util.Random;

class ScoreMng_Solution {
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};		// 모범답안
	int[] rNum = new int[5];
	
	int answerCnt = 0;
	int score = 0;
	
	void makeOmr() {
		
		for (int i = 0; i < rNum.length; i++) {
			rNum[i] = ran.nextInt(5) + 1;
		}

	}
	
	void showOmr() {
		
		System.out.print("omr = " );
		System.out.println(Arrays.toString(omr));
		System.out.print("rNum = ");
		System.out.println(Arrays.toString(rNum));
	}
	
	void checkOmr() {
		
		System.out.print("정오표 = [");
		
		for (int i = 0; i < omr.length; i++) {
			if (rNum[i] == omr[i]) {
				System.out.print("O ");
				answerCnt++;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		
		score = answerCnt * 20;
		
		System.out.println("점  수 = " + score);
	}
	
	void run() {
		
		makeOmr();
		showOmr();
		checkOmr();
		
	}
}

public class MethodEx13_풀이 {

	public static void main(String[] args) {
		
		ScoreMng_Solution sm = new ScoreMng_Solution();
		sm.run();
		
	}
	
}
