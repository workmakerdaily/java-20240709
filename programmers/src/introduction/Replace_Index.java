package introduction;

import java.util.Arrays;

public class Replace_Index {
//	문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
//	my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 
//	바꾼 문자열을 return 하도록 함수를 완성해보세요.
	public static void main(String[] args) {
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		String[] answer = my_string.split("");
		
		String str = answer[num1];
		answer[num1] = answer[num2];
		answer[num2] = str;
		String.join("", answer);
		
	
		System.out.println(answer);

		
		
		
		
		}
}
