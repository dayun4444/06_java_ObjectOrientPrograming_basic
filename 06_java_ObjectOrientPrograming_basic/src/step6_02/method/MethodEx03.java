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
	
	int testReturn() {
		
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
		
		//복수의 return 값은 불가능하므로 error가 발생한다. 우회 가능(object or array)
		//return 1,2,3,4,5;	
		return 0;			// tip. 빨간줄이 안나오게 return 0; 을 적은 후 나중에 수정한다.
		
		// return을 만나는 순간 메서드가 종료되므로 아래의 명령어에서 error가 발생한다.
//		System.out.println("리턴 후 명령어1");
//		System.out.println("리턴 후 명령어2");
//		System.out.println("리턴 후 명령어3");
		
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
