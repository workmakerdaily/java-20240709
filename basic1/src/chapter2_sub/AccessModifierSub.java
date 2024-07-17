package chapter2_sub;

// chapter2에 선언된 AccessModifier 클래스는
// 접근 제어자가 public이기 때문에 외부 패키지에서 import가 가능
import chapter2.AccessModifier;

// chapter2 package에 선언된AccessModifierRun 클래스는
// 접근 제어자가 default(package)이기 때문에 외부 패키지에서 import가 불가능
// import chapter2.AccessModifierRun;

public class AccessModifierSub {

	void method() {
		
		AccessModifier instance = new AccessModifier();
		
		// 접근제어자가 public이기 때문에 외부 패키지에서 접근이 가능
		instance.publicVariable = 0; 
		// 접근 제어자가  protected이기 때문에 외부 패키지에서 접근이 불가능
//		instance.protectedVariable = 0; 
		// 접근 제어자가 default이기 때문에 외부 패키지에서 접근이 불가능
//		instance.defaultVariable = 0;
		// 접근 제어자가 private이기 때문에 외부 패키지에서 접근이 불가능
//		instance.privateVariable = 0; 
		
	}
	
}

class SubClass extends AccessModifier {
	
	void method() {
		AccessModifier instance = new AccessModifier();
		
//		instance.publicVariable = 0;
//		instance.protectedVariable = 0;
//		instance.defaultVariable = 0; 
//		instance.privateVariable = 0;
		
		// 접근제어자가 public이기 때문에 자손 클래스에서 접근이 가능
		super.publicVariable = 0;
		// 접근제어자가 protected이기 때문에 자손 클래스에서 접근이 가능
		super.protectedVariable = 0;
		// 접근제어자가 default이기 때문에 자손 클래스에서 접근이 불가능
//		super.defaultVariable = 0;
		// 접근제어자가 private이기 때문에 자손 클래스에서 접근이 불가능
//		super.privateVariable = 0;
		
	}
	
}
