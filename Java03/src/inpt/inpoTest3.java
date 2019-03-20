package inpt;

import java.util.Scanner;

public class inpoTest3 {
	public static void main(String[] args) {
		
		int number = 100;
		String company = "kg";
		
		//나의정보입력
		System.out.println("나의정보입력");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("당신의 이름을 입력하세요...");
		//이름park
		String name = sc.next();
		System.out.println("딩신이 입력한 이름은 " + name);
		// 나이
		
		System.out.print("나이:");
		String age = sc.next();
		//성별 man
		System.out.print("성별:");
		String gender = sc.next();
		
		
		
	}
}
