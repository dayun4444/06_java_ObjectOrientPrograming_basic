package step6_01.classObject;

import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */


class Ex06_Solution {
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}

public class ClassEx06_풀이 {

	public static void main(String[] args) {
		
		Ex06_Solution data = new Ex06_Solution();
		
		Random ran = new Random();

		System.out.print("정   답 = ");
		for(int i = 0; i < data.hgd.length; i++) {
			System.out.print(data.answer[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("학   생 = ");
		for(int i = 0; i < data.hgd.length; i++) {
			int hgdAnswer = ran.nextInt(5) + 1;
			data.hgd[i] += hgdAnswer;
			System.out.print(data.hgd[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("정오표 = ");
		for(int i = 0; i < data.answer.length; i++) {
			if(data.answer[i] == data.hgd[i]) {
				System.out.print("O" + " ");
				data.answerCnt++;
			}
			else {
				System.out.print("X" + " ");
			}
		}
		System.out.println();
		
		data.score = data.answerCnt * 20;
		System.out.println("성   적 = " + data.score);
	}

}
