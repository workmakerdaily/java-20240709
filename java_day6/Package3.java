package chapter3;

import java.util.Random;
import java.util.UUID;

public class Package3 {
	public static void main(String[] args) {
		
		// Random 클래스 : 난수를 생성하는 클래스
		Random random = new Random();
		System.out.println(random.nextInt()); // 음수, 양수 구분 없이 랜덤하게 수가 나옴
		// 범위 제약
		System.out.println(random.nextInt(10)); // 0 ~ 9까지 랜덤하게 수가 나옴
		System.out.println(random.nextInt(10) + 1); // 1 ~ 10까지 랜덤하게 수가 나옴
		
		// SEED 지정
		random = new Random(1);
		System.out.println(random.nextInt()); // -1155869325
		System.out.println(random.nextInt()); // 431529176
		System.out.println(random.nextInt(45)); // 37
	
		// UUID : 고유한 식별자를 만들기 위해 사용하는 랜덤한 문자열
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	
	}
}
