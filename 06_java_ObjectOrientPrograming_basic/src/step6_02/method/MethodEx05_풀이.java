package step6_02.method;

import java.util.Scanner;

class Ex05_Solution {

	void test1() {
		int tot = 0;
		for(int i = 0; i < 5; i++) {
			tot += i;
		}
		System.out.println(tot);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요 : ");
		int[] arr = new int[3];
		
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int data = scan.nextInt();
			arr[i] = data;
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		scan.close();
	}
	
}

public class MethodEx05_풀이 {

	public static void main(String[] args) {

			Ex05_Solution e = new Ex05_Solution();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();


	}

}
