package koerait.day17;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		System.out.println("새로운 회원님 환영합니다.");
		this.name = name;
		this.age = age;
		System.out.println("새로운 회원 <"+this.name+">님 환영합니다!");
	}

	@Override
	public String toString() {
		return "(name=" + name + ", age=" + age + ")";
	}
	
	//getter
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	
	
	
	
	
}