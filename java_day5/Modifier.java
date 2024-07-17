package chapter2;

// 기타 제어자 (비접근 제어자) : 접근 제어와 무관하게 동작을 제어하는 것

// final 제어자
// - 클래스 : final 제어자가 붙은 클래스는 확장할 수 없음
// - 메서드 : final 제어자가 붙은 메서드는 재정의(오버라이드)할 수 없음
// - 변수 : final 제어자가 붙은 변수는 재할당할 수 없음

final class FinalClass {
	int number;
}

//- 클래스 : final 제어자가 붙은 클래스는 확장할 수 없음
// class SubFinalClass extends FinalClass {
// 	
// }

class FinalMethodClass {
	
	final void finalMethod() {}
	
}

class SubFinalMethodClass extends FinalMethodClass {
	
// - 메서드 : final 제어자가 붙은 메서드는 재정의(오버라이드)할 수 없음
//	@Override
//	void finalMethod() {}
	
}

class FinalVariableClass {
	
	final int number = 10;
	
	void method () {
// - 변수 : final 제어자가 붙은 변수는 재할당할 수 없음
//		number = 99;
	}
}

// static 제어자
// - 메서드 : static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
// - 변수 : static 제어자가 붙은 필드는 인스턴스 생성없이 클래스로 바로 접근 가능

class StaticClass {
	
	static int number;
	static void method() {};
	
}

// 제어자의 조합
class ModifierCombination {
	
	// public + static + final의 변수, 메서드
	public static final int NUMBER = 10;
	
	// 변수에서 private + final(필드에서 final은 생성자에서 필수로 초기화 해야함을 의미)
	private final String name;
	
	ModifierCombination () {
		name = "홍길동";
	}
	
	// 메서드에서 private + final(final의 의미가 없음 -> private이기 때문에)
	private final void method() {}

	// 메서드에서 private + abstract(의미가 서로 상충하기 때문에 사용 불가)
	// 클래스와 메서드에서 final + abstract(의미가 서로 상충하기 때문에 사용 불가)
	
}

// 클래스와 메서드에서 final + abstract
// abstract final class SuperClass1{
//	
// }

abstract class SuperClass1 {
	
	// 메서드에서 private + abstract(의미가 서로 상충하기 때문에 사용 불가)
	//	private abstract void method();
	public abstract void method();
	
}


public class Modifier {
	public static void main(String[] args) {
		
// - 변수 : static 제어자가 붙은 필드는 인스턴스 생성없이 클래스로 바로 접근 가능		
		StaticClass.number = 10;
// - 메서드 : static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
		StaticClass.method();
		
	}
}
