package chapter2;

// 접근제어자 : 클래스, 메서드, 필드에 대해서 외부 접근에 대한 제어를 하는 것
// public : 모든 패키지에서 접근 가능
// protected : 같은 패키지 내부 혹은 외부 패키지의 자손 클래스에서 접근 가능
// default(package): 같은 패키지 내부에서만 접근 가능 
// private : 같은 클래스 내부에서만 접근 가능

class AccessModifierRun {
	
	void method() {
		AccessModifier instance = new AccessModifier();
		
		// 접근제어자가 public이기 때문에 같은 패키지 내부에서 접근이 가능
		instance.publicVariable = 0;
		// 접근제어자가 protect이기 때문에 같은 패키지 내부에서 접근이 가능
		instance.protectedVariable = 0;
		// 접근제어자가 default이기 때문에 같은 패키지 내부에서 접근이 가능
		instance.defaultVariable = 0;
		// 접근제어자가 private이기 때문에 같은 패키지 내부에서 접근이 불가능
//		instance.privateVariable = 0;

	}
	
}

public class AccessModifier {
	
	public int publicVariable;
	protected int protectedVariable;
	int defaultVariable;
	private int privateVariable;
	
	public static void main(String[] args) {
		
		AccessModifier instance = new AccessModifier();
		
		instance.publicVariable = 0;
		instance.protectedVariable = 0;
		instance.defaultVariable = 0;
		instance.privateVariable = 0;
		
//		privateVariable = 0;
	}
}
