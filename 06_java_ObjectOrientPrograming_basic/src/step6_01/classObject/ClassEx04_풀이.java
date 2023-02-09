package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

class Ex04_Solution {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}


public class ClassEx04_풀이 {

	public static void main(String[] args) {
		
		Ex04_Solution data = new Ex04_Solution();
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		System.out.println("문제1");
		
		for(int i = 0; i < data.scores.length; i++) {
			int score = ran.nextInt(100) + 1;
			data.scores[i] = score;
			System.out.print(score + " ");
		}
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		System.out.println("문제2");
		
		int total = 0;
		double avg = 0;
		
		for(int i = 0; i < data.hakbuns.length; i++) {
			total += data.scores[i];
			avg = total / data.hakbuns.length;
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println();
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		System.out.println("문제3");
		
		int cnt = 0;
		
		for(int i = 0; i < data.hakbuns.length; i++) {
			if(data.scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("합격생 수 : " + cnt);
		System.out.println();
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		System.out.println("문제4");
		
		System.out.print("인덱스 입력 : ");
		int findIdx = scan.nextInt();
		
		System.out.println("성적 : " + data.scores[findIdx] + "점");
		System.out.println();
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		System.out.println("문제5");
		
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		
		for(int i = 0; i < data.hakbuns.length; i++) {
			if (score == data.scores[i]) {
				findIdx = i;
			}
		}
		
		System.out.println("인덱스 : " + findIdx);
		System.out.println();
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점

		System.out.println("문제6");
		
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		
		for(int i = 0; i < data.hakbuns.length; i++) {
			if(hakbun == data.hakbuns[i]) {
				findIdx = i;
			}
		}
		
		System.out.println("성적 : " + data.scores[findIdx]);
		System.out.println();
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.println("문제7");
		
		System.out.print("학번 입력 : ");
		hakbun = scan.nextInt();
		
		int check = -1;
		
		for(int i = 0; i < data.hakbuns.length; i++) {
			if(hakbun == data.hakbuns[i]) {
				check = i;
			}
		}

		if(check == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		else {
			System.out.println("성적 : " + data.scores[check]);
		}
		
		System.out.println();
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		System.out.println("문제8");
		
		int high = 0;
		
		for(int i = 0; i < data.hakbuns.length; i++) {
			if(high < data.scores[i]) {
				high = data.scores[i];
				findIdx = i;
			}
		}
		System.out.println("1등학생 : " + data.hakbuns[findIdx] + "(" + high + "점)");
		System.out.println();
		
	}

}
