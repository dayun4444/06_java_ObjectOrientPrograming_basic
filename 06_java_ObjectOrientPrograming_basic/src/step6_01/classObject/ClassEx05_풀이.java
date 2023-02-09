package step6_01.classObject;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

class Ex05_Solution {
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}


public class ClassEx05_풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Ex05_Solution mega = new Ex05_Solution();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			System.out.println();
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			System.out.println();
			
			if		(choice == 1) {
				int total = 0;
				double avg = 0;
				for(int i = 0; i < mega.arHakbun.length; i++) {
					total += mega.arScore[i];
					avg = total / mega.arHakbun.length;
				}
				System.out.println("전교생 수 : " + mega.arHakbun.length);
				System.out.println("총점 : " + total);
				System.out.println("평균 : " + avg);
			}
			else if (choice == 2) {
				int high = 0;
				int findIdx = 0;
				for(int i = 0; i < mega.arHakbun.length; i++) {
					if(high < mega.arScore[i]) {
						high = mega.arScore[i];
						findIdx = i;
					}
				}
				System.out.println("=== 1등 ===");
				System.out.println("학번 : " + mega.arHakbun[findIdx]);
				System.out.println("성적 : " + mega.arScore[findIdx]);
			}
			else if (choice == 3) {
				int low = 0;
				int findIdx = 0;
				for(int i = 0; i < mega.arHakbun.length; i++) {
					if(low > mega.arScore[i]) {
						low = mega.arScore[i];
						findIdx = i;
					}
				}
				System.out.println("=== 꼴등 ===");
				System.out.println("학번 : " + mega.arHakbun[findIdx]);
				System.out.println("성적 : " + mega.arScore[findIdx]);
			}
			else if (choice == 4) {
				System.out.print("학번을 입력하세요 : ");
				int hakbun = scan.nextInt();
				int check = -1;
				
				for(int i = 0; i < mega.arHakbun.length; i++) {
					
					if(hakbun == mega.arHakbun[i]) {
						check = i;
					}
				}
				
				if(check == -1) {
					System.out.println("해당 학번이 존재하지 않습니다.");
				}
				else {
					System.out.println(hakbun + "학번 학생의 성적은 " + mega.arScore[check] + "점 입니다.");
				}
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
