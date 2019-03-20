package ifTest;

import java.util.Date;

public class If01 {

	public static void main(String[] args) {
		//지금 시각은 오전일까? 오후일까? 저녁일까? 판단.
		Date date = new Date();
		new Date();// 컨트롤 쉬프트 o(영문자) 자동import
		
		 int hour= date.getHours();
		 if(hour < 12) { 
			 System.out.println("오전이군요.!!!");
		 }else if(hour <17) {
			 System.out.println("오후이군요.!!");
		 }else{ 
			 System.out.println("밤이군요!!!");
		 }
	// 저기요 !!!메뉴고르세요
	//==============
	//메뉴를 고르세요
	//============
	//1 짜장면 2짬뽕 3 3 우동
	//======
	// 당신의 선택은 1
	//당신은 주문하셨습니다
	
	System.out.println("저기요!!!!!");
	System.out.println("메뉴를 고르세요");
//	if(메뉴=자장면) { System.out.println(자장면); 
//	}else if(메뉴=짬뽕){	System.out.println(짬뽕);
	
	
	
	
	
	}
}
