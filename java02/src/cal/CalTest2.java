package cal;

public class CalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 1000;
		int pw = 1111;
		// string id = "root"; //비교연산자 사용불가
		// 비교연산자는 기초형 비교만 할 수있다

		if (id == 1000 && pw == 1111) { // 조건은 비교연산자의 결과는 맞으면, boolean
										// 조건이 맞으면 여기 실행..
			System.out.println("로그인 허락...ok..");

		} else {
			System.out.println("로그인 불허 ...not");
		}
	}
}
