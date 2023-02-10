package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */

class ReturnEx {
	
	void setScore1(int score1) {
		score1 = 100;
	}
	
	int setScore2(int score2) {
		score2 = 100;
		return score2;
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx test = new ReturnEx();
		
		int score1 = 87;

		System.out.println("메서드 호출전 : " + score1);	// 87
		test.setScore1(score1);
		System.out.println("메서드 호출후 : " + score1);	// 87
		
		System.out.println();
		
		int score2 = 87;
		
		System.out.println("메서드 호출전 : " + score2);	// 87
		test.setScore2(score2);	// 100. But 연속기 없어 score2가 바뀌지는 않는다.
		System.out.println("메서드 호출후 : " + score2);	// 87
		
		score2 = test.setScore2(score2);
		System.out.println("메서드 호출후 : " + score2);	// 100
		
	}

}
