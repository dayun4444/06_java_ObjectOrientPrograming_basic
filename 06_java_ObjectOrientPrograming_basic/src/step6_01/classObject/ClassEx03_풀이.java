package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_Solution {
	int[] arr = {87, 100, 11, 72, 92};
}

// 20230209 13:20 ~ 13:27

public class ClassEx03_풀이 {

	public static void main(String[] args) {
		
		Ex03_Solution data = new Ex03_Solution();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int total = 0;
		for(int i = 0; i < data.arr.length; i++) {
			total += data.arr[i];
		}
		System.out.println("전체 합 : " + total);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		total = 0;
		
		for(int i = 0; i < data.arr.length; i++) {
			if(data.arr[i] % 4 == 0) {
				total += data.arr[i];
			}
		}
		System.out.println("4의 배수의 합 : " + total);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int cnt = 0;
		for(int i = 0; i < data.arr.length; i++) {
			if(data.arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println("4의 배수의 개수 : " + cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		cnt = 0;
		for(int i = 0; i < data.arr.length; i++) {
			if(data.arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println("짝수의 개수 : " + cnt);

	}

}
