package introduction;

import java.util.Arrays;

public class Add_more_digits {
//	정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 함수를 완성해주세요
	public static void main(String[] args) {
		int n = 930211;
		int answer = 0;
		String a = String.valueOf(n);
		String[] b = a.split("");
		for(int i = 0; i < b.length; i++) {
			answer += Integer.parseInt(b[i]);
		}
	System.out.println(answer);
	}
}
