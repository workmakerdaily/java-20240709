package chapter1.practice;


import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		// 모두 대문자로 만들기
		// 사용자로부터 문자열 statement를 입력받고
		// 압력 받은 문자열을 영어라면 모두 대문자로 변경하여
		// 문자배열에 저장한 후 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자입력 >> ");
		String statement = scanner.nextLine().toUpperCase();
		
		char[] arr = new char[statement.length()];
		for(int index = 0; index < statement.length(); index++) {
			arr[index] = statement.charAt(index);
		}
		System.out.println(arr);
	}
}

