package chapter1.practice;

import java.util.Scanner;

public class Practice3_teacher {

	public static void main(String[] args) {
		
		String statment = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그린 그림이다";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 인덱스 : ");
		int startIndex = scanner.nextInt();
		System.out.print("종료 인덱스 : ");
		int endIndex = scanner.nextInt();
		
		char[] statmentChars = statment.toCharArray();
		char[] resultChars = new char[endIndex - startIndex];
		
		for (int index = 0; index < resultChars.length; index++) {
			resultChars[index] = statmentChars[startIndex + index];
		}
		System.out.println(resultChars);
	}

}
