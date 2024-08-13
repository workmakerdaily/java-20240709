package introduction;

import java.util.Arrays;

public class Find_a_number {
//	정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 
//	num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	public static void main(String[] args) {
		int num = 232443;
		int k = 4;
		int answer = 0;
		String[] arr = String.valueOf(num).split("");
		String[] a = String.valueOf(k).split("");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(a[0])) {answer = i+1; break;}
			else answer = -1;
		
		}
		System.out.println(answer);
	}
}
