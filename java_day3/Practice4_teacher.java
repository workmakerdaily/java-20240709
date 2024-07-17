package chapter1.practice;

import java.util.Scanner;

public class Practice4_teacher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 : ");
		String statement = scanner.nextLine();
		
		char[] statementChars = statement.toCharArray();
		for (int index = 0; index < statementChars.length; index++) {
			char charater = statementChars[index];
			boolean lowerEnglish = charater >= 97 && charater <= 122;
			if (!lowerEnglish) continue;
			
			statementChars[index] = (char)(charater - 32);
		}
		System.out.println(statementChars);
	} 
}
