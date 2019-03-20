package inpt;

import java.util.Scanner;

public class inpoTest2 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("나이");
		int age = sc.nextInt();
		System.out.println("내년의 나의나이은"+ (age +1));
	}
}
