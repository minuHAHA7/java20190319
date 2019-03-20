package inpt;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("나는기본입출력");
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요...");
		String name = sc.next();
		System.out.println("당신의 이름은" + name);
		System.out.println();
		System.out.println();
		
	}

}
