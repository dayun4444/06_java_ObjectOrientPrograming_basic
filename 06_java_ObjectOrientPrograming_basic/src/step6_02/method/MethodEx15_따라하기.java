package step6_02.method;

import java.util.Scanner;

class NumberGame_Copy {
	
	Scanner scan = new Scanner(System.in);
	
	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int playerLocation = 4;
	
	void printPlay() {
		
		for ( int i = 0; i < move.length; i++) {
			if (move[i] == 0)	System.out.print("[ ]");
			else				System.out.print("옷");
		}
		
		System.out.println();
		
	}
	
	void showMenu() {
		
		System.out.println("1.좌로 이동");
		System.out.println("2.우로 이동");
		System.out.println("3.종료하기");
		
	}
	
	void moveLeft() {
		
		if(playerLocation > 0) {
			move[playerLocation] = 0;
			move[playerLocation - 1] = 8;
			playerLocation--;
		}
		else {
			System.out.println("더이상 움직일 수 없습니다!");
		}
		
	}
	
	void moveRight() {
		
		if (playerLocation < move.length - 1) {
			move[playerLocation] = 0;
			move[playerLocation + 1] = 8;
			playerLocation++;
		}
		else {
			System.out.println("더이상 움직일 수 없습니다!");
		}
		
	}
	
	void run() {
		
		while (true) {
			
			printPlay();
			showMenu();
			System.out.print(": ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				moveLeft();
			}
			
			else if(choice == 2) {
				moveRight();
			}
			
			else if(choice == 3) {
				System.out.println("게임 종료");
				break;
			}
		}
	}
	
}
public class MethodEx15_따라하기 {

	public static void main(String[] args) {

		NumberGame_Copy g = new NumberGame_Copy();
		g.run();
		
	}

}
