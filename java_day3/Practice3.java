package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		// 문자열 자르기
		// 사용자로부터 시작인덱스와 종료인덱스를 입력받고
		// 입력받은 시작인덱스와 종료인덱스까지 문자열을 잘라서
		// 자른 문자열을 출력
		
		// string 기능 substring을 사용하지 않고 char[]을 이용해서 작성
		
		String statment = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그린 그림이다";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 인덱스 : ");
		int number1 = scanner.nextInt();
		System.out.print("종료 인덱스 : ");
		int number2 = scanner.nextInt();
		
		char[] char1 = statment.toCharArray();
		char[] resultChar = new char[number2 - number1];
		for(int index = 0; index < resultChar.length; index++) {
		resultChar[index] = char1[number1 + index];
		}
		System.out.println(resultChar);
	}
}
