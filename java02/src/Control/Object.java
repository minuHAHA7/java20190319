package Control;

import java.lang.*;
import java.util.Date; // 자바라는 페키지를 만들지마라

public class Object {
	public static void main(String[] args) {
		Date date =new Date();	 
		int hour =date.getHours();
		System.out.println("현재시각은" + hour) ;
	}
}
