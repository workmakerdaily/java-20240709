package introduction;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_in_string {
//	문자열 str1, str2가 매개변수로 주어집니다. 
//	str1 안에 str2가 있다면 1을 없다면 2를 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		int answer = 0;

			if(str1.contains(str2)) answer = 1;
			else answer = 2;

		
		System.out.println(answer);
	}
}
