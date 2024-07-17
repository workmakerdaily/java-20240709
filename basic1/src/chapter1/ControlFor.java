package chapter1;

public class ControlFor {
	public static void main(String[] args) {
		
		// 반복문 : 특정 조건을 만족하면 지정한 코드 블럭을 반복 실행하도록 하는 것
		
		// for : 일반적으로 반복 횟수가 정해져 있을때 사용하는 반복문
		// for (조건에 사용할 변수 초기화; 조건; 조건에 사용할 변수 변경){반복할 코드 블럭}
		
		// System.out.println("안녕하세요."); 1000번 반복
		for (int count = 1; count <= 10; count++) {
			System.out.println("안녕하세요."); // 안녕하세요 10번 반복
		}
		

		
//		System.out.println("4 * 1 = 4");
//		System.out.println("4 * 2 = 8");
//		System.out.println("4 * 3 = 12");
//		System.out.println("4 * 4 = 16");
//		System.out.println("4 * 5 = 20");
//		System.out.println("4 * 6 = 24");
//		System.out.println("4 * 7 = 28");
//		System.out.println("4 * 8 = 32");
//		System.out.println("4 * 9 = 36");
//		
//		System.out.println("4 * count = count * 4");
		

		
		for (int count = 1; count <= 9; count++) {
			System.out.println("4 * " + count + " = " + (count * 4)); // 구구단 4단
		}
		
//		count++ => count = count + 2 => count += 2
		for (int count = 2; count <= 9; count += 2) {
			System.out.println("4 * " + count + " = " + (count * 4)); // 구구단 4단 중 짝수만 표시
		}
		
		String[] fruits = new String[] {"apple", "banana", "cacao"};
		
		System.out.println(fruits[0]); // apple
		System.out.println(fruits[1]); // banana
		System.out.println(fruits[2]); // cacao
		
		for(int index = 0; index < fruits.length; index++) {
			System.out.println(fruits[index]); // 위와 동일
		}
		
		for (int index = 0; index < fruits.length; index++) {
			fruits[index] += " add";
		}
		
		for(int index = 0; index < fruits.length; index++) {
			System.out.println(fruits[index]); // 각 과일 이름 뒤에 add라는 글자가 추가되서 출력
		}
		
		// foreach : 컬렉션(배열)의 각 요소를 하나씩 변수에 "복사"하여 사용하는 반복문

		for(String fruit: fruits) {
			System.out.println(fruit); // 위와 동일
		}
		
		// 컬렉션 실제 요소에 대해서 읽기전용, 복사한 요소를 변경하더라도 실제 요소에는 영향이 없음 
		for(String fruit: fruits) {
			fruit += " add";
		}
		
		for(String fruit: fruits) {
			System.out.println(fruit); // add라는 글자가 추가되지 않음
		}

	}
}
