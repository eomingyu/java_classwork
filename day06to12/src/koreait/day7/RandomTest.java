package koreait.day7;

import java.util.Random;	//기본 패키지가 아니기 때문에 생김

public class RandomTest {
	//Random: 임의의, 아무거나 -> 컴퓨터가 만들어주는 임의의 값(난수)들을 생성해서 사용할 수 있다.
	
	//프로그래밍에 필요한 데이터: 정수값 데이터 1) 변수 초기화 2) 키보드 입력
	//		-> 많은 양의 데이터는 random 기능을 이용합니다.
	public static void main(String[] args) {
		//Random 클래스를 활용합니다.
		Random r1 = new Random();	//Random 클래스의 객체를 생성, r1은 객체의 참조값(주소)
		Random r2 = new Random();
		System.out.println("r1\t\t\tr2");
		for(int i=0; i<10;i++) {
			int temp = r1.nextInt();		//난수 int 값을 리턴. int형 변수에 저장
			System.out.print(temp + "\t\t");
			System.out.println(r2.nextInt(100));	//어떤 난수일까요? 0~99 범위
		}
		
		//1~46 범위의 난수 10개
		System.out.println("1~46 범위의 난수를 만듭니다.");	//0~45를 만들고 +1 합니다.
		for(int i=0; i<10;i++) {
			System.out.println(r1.nextInt(46)+1);	//nextInt 인자는 양수만 됩니다. 음수는 -( ) 씌우기
		}
		
		
	}

}
