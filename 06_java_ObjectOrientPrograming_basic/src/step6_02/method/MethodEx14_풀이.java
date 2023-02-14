package step6_02.method;

import java.util.Scanner;

class Theater_Solution {
	
	Scanner scan = new Scanner(System.in);
	
	int[] seat = new int[10];
	int bookCnt = 0;
	int money = 0;
	
	void showMenu() {
		System.out.println("=== 메가박스 ===");
		System.out.println("1.예매하기");
		System.out.println("2.종료하기");
		
	}
	
	void showSeat() {

		for (int i = 0; i < seat.length; i++) {
			if(seat[i] == 0) {
				System.out.print(" [X] ");
			}
			else {
				System.out.print(" [O] ");
			}
		}
		
		System.out.println();
	}
	
	void chooseSeat() {

		System.out.print("좌석번호를 선택하세요[1 ~ 10] : ");
		int idx = scan.nextInt() - 1;
		
		if(seat[idx] == 0) {
			seat[idx] = 1;
			bookCnt++;
			System.out.println("예매를 완료하엿습니다.");
		}
		else {
			System.out.println("이미 예매가 끝난 좌석입니다.");
		}
		
	}
	
	void salesSeat() {
	
		money = bookCnt * 12000;
		System.out.println("총 매출 금액 = " + money + "원");
		System.out.println("프로그램 종료");
		
	}
	
	void run() {
		
		while(true) {
			
			showMenu();
			
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				showSeat();
				chooseSeat();
			}
			
			else if(select == 2) {
				
				salesSeat();
				break;
				
			}
		}
	}
	
}

public class MethodEx14_풀이 {
	public static void main(String[] args) {
		
		Theater_Solution megabox = new Theater_Solution();
		
		megabox.run();
		
		
		
	}
}
