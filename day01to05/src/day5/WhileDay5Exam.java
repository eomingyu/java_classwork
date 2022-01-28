package koreait.day5;

import java.util.Scanner;

public class WhileDay5Exam { //Day5Exam.java를 반복 실행 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password="";
		int upper_cnt=0, lower_cnt=0, numeric_cnt=0, symbol_cnt = 0; //대문자,소문자,숫자,기호
		boolean isOk = false;		//password 규칙에 맞는지 논리값 저장.
		String message="";			//password 규칙 불만족 조건 메시지를 저장.
		
		//* 연산에 사용되는 변수는 반드시 초기값을 저장해야합니다.
		//
		System.out.println("[[사용자 패스워드 검사]]");
		
		while(!isOk) {
			upper_cnt=0;		//패스워드 다시 입력하면 초기화해야할 값들입니다.
			lower_cnt=0;
			numeric_cnt=0;
			symbol_cnt = 0;
			message="";
			
			System.out.print("사용할 패스워드 입력하세요.-> ");
			
			password = sc.nextLine();
			
			if(password.length()<8) {
				message = "*) 8글자 이상으로 해야합니다.";
			}
			//추가 요구사항 처리위한 변수 선언
			boolean isUseless=false;
			for(int i=0;i<password.length();i++) {
			//	System.out.println(password.charAt(i));
				char temp = password.charAt(i);
			
				if(temp >='A' && temp <='Z')
					upper_cnt++;//대문자 개수 증가
				else if(temp >= 'a' && temp <= 'z')
					lower_cnt++;//소문자 개수 증가
				else if(temp >= '0' && temp <= '9')
					numeric_cnt++;//숫자 개수 증가
				else if(temp >= 32 && temp <= 47 || temp >= 58 && temp <= 64 || temp >= 91 && temp <= 96 || temp >= 123 && temp <= 126) {
					//추가요구사항 처리
					if(temp==7 || temp==8 || temp==32 || temp==37 || temp==59 || temp==60 || temp==62 || temp==92) 
					isUseless = true;
					else
						symbol_cnt++;//기호 개수 증가
				}
			}
			System.out.println("대문자 개수 : " + upper_cnt);
			System.out.println("소문자 개수 : " + lower_cnt);
			System.out.println("숫자 개수 : " + numeric_cnt);
			System.out.println("기호 개수 : " + symbol_cnt);
		
			if(upper_cnt < 1)
				message += "\n*) 영문 대문자 1개 이상 포함해야 합니다.";	//+ 문자열 연결
			if(lower_cnt < 1)
				message += "\n*) 영문 소문자 1개 이상 포함해야 합니다.";	//+ 문자열 연결
			if(numeric_cnt < 1)
				message += "\n*) 숫자 1개 이상 포함해야 합니다.";	//+ 문자열 연결
			//if(!isUseless && symbol_cnt < 1)
			if(symbol_cnt < 1)
				message += "\n*) 기호 1개 이상 포함해야 합니다.";	//+ 문자열 연결
			//추가요구사항 처리
			if(isUseless)
				message+="\n\">, <, (, ), ;, %, \\, 공백\" 은 사용할 수 없는 기호입니다.";
			
			if(password.length()>=8 && upper_cnt>=1
					&&  lower_cnt>=1 && numeric_cnt>=1 && symbol_cnt>=1 && !isUseless)
				isOk = true;		//모든 조건을 만족하면 isOk는 true
			System.out.println(message);
			System.out.println("결과 : " + (isOk? "사용할 수 있는 패스워드입니다." : "패스워드 작성 규칙에 맞지 않습니다."));
					//삼항연산자 isOk 참일 때 : 앞의 문자열 출력, 거짓이면 : 뒤의 문자열 출력합니다.
					//A? B : C 
		}//while 끝
		System.out.println("사용할 패스워드 : " + password);
		sc.close();
	}

}
//코딩 지향점
//불필요한 변수 사용은 줄이기. 반복되는 코드 없도록 하기. 다른 사람이 이해하기 쉬운 코드로 작성하기.