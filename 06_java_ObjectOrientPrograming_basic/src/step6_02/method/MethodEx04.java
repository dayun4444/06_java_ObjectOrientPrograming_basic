package step6_02.method;

// this : 객체(오브젝트,인스턴스) 자신

class Zealot {
	
	// 클래스 프로퍼티에는 this가 붙어 있고 생략이 가능하다.
	int shield = 60;
	int hp = 100;
	
	void showStatus() {
		//int movieSpeed; // 메서드의 지역변수
		//int shield = 100;
		System.out.println("this : " + this);
		//System.out.println("shield : " + shield);
		System.out.println("shield : " + this.shield);
		System.out.println("hp : " + hp);
		System.out.println();
	}
	
}

public class MethodEx04 {

	public static void main(String[] args) {

		Zealot z1 = new Zealot();
		System.out.println(z1);
		z1.shield = 0;
		z1.showStatus();
		
		Zealot z2 = new Zealot();
		System.out.println(z2);
		z2.shield = 0;
		z2.hp = 0;
		z2.showStatus();
		
		Zealot z3 = new Zealot();
		System.out.println(z3);
		z3.showStatus();
	}

}
