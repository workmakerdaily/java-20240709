package chapter2;

import java.util.Arrays;

// 상속 : 객체지향 프로그래밍 특성 중  하나
// 원래 존재하던 클래스를 '확장'하여 재사용할 수 있도록 하는 것
// 코드 중복을 제거하고 확장성을 높일 수 있음
// extends 키워드를 사용하여 확장
// Java에서는 단일 상속만 지원됨
// 다중 상속에서 발생할 수 있는 다이아몬드 문제가 발생하지 않도록 하기 위함
// 다이아몬드 문제 : 두 개 이상의 상위 클래스가 동일한 메서드를 가질 때 어떤 메서드를 호출해야 하는지 모호해지는 것
// 다중 상속의 기능의 효과를 얻기 위해서는 인터페이스 혹은 중첩 상속을 사용함


// class SubClass extends SuperClass { ... }

// final로 선언된 클래스는  상속하여 확장할 수 없음
/*final*/ class Human {
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Human(String name) {
		this.name = name;
		this.age = 10;
	}
	
	
	void sayHello() {
		System.out.println(name + "가 인사를 합니다.");
	}
}


class Developer extends Human{ // Human 클래스를 상속받음
	String[] skills;
	
	Developer(String name, int age, String[] skills) {
		// super : 부모 클래스를 지칭하는 키워드
		// super()는 부모 클래스의 생성자를 지킹
		super(name, age); 
//		this.name = name; super로 Human에서 name과 age를 받아왔기 때문에
//		this.age = age;   따로 작성할 필요가 없음
		this.skills = skills;
	}

	void develop() {
		System.out.println(name + "가 " +Arrays.toString(skills) + "로 개발을 합니다.");
	}
	
}

class SalesMan extends Human{ // Human 클래스를 상속받음
	int sales;
	
	SalesMan(String name, int age, int sales) {
		super(name);
//		this.name = name;
//		this.age = age;
		this.sales = sales;
//		super(name); 부모 생성자 호출은 반드시 현재 생성자의 첫번째 구문으로 작성해야 함
	}
	
	// 오버라이딩 :  하위 클래스에서 상위 클래스의 메서드를 '재정의' 하는 것
	// 규칙
	// 1. 상위 클래스에서 선언된 메서드와 메서드 이름, 매개변수의 조합이 같아야함
	// 2. 상위 클래스에서 선언된 메서드가 final로 선언되면 재정의가 불가능
	
	//@Override : 컴파일러에게 현재 작업이 오버라이딩 작업임을 알려줌
	@Override
	void sayHello() { // 오버라이딩
		System.out.println(name + "가 자신을 소개합니다.");
	}
	
	void sayHello(String company) { // 오버라이딩이 아니라 오버로딩
		System.out.println(name + "가 " + company + "자신을 소개합니다.");
	}
	
	void sale() {
		System.out.println(name + "가 " + sales + "만큼의 매출을 했습니다.");
	}
	
}



public class Inheritance {
	public static void main(String[] args) {
		
		Developer developer1 = new Developer("홍길동", 20, new String[] {"java", "python"});
		SalesMan salesMan1 = new SalesMan("이영희", 25, 300000);
		
		System.out.println(developer1.name); // 홍길동
		System.out.println(developer1.age); // 20
		System.out.println(developer1.skills); // 주소가 뜸
		developer1.sayHello(); // 홍길동가 인사를 합니다.
		developer1.develop(); // 홍길동가 [java, python]로 개발을 합니다.
		
		System.out.println(salesMan1.name); // 이영희
		System.out.println(salesMan1.age); // 25
		System.out.println(salesMan1.sales); // 300000
		salesMan1.sayHello(); // 이영희가 자신을 소개합니다.
		salesMan1.sale(); // 이영희가 300000만큼의 매출을 했습니다.
		
		// 모든 클래스는 'Object'라고하는 클래스를 최상위 클래스로 반드시 상속받고 있음
		salesMan1.equals(""); // Object 클래스에 존재하는 메서드
		
		
	}
}
