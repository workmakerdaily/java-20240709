package introduction;

import java.util.Arrays;

public class Create_Maximum_2 {
//	정수 배열 numbers가 매개변수로 주어집니다. 
//	numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록함수를 완성해주세요.
	public static void main(String[] args) {
		int[] numbers = {1, 2, -3, 4, -5};
		int answer = 0;
		Arrays.sort(numbers);
		
		int p = numbers[numbers.length-1]*numbers[numbers.length-2];
		int m = numbers[0]*numbers[1];
		if(p >= m) answer = p;
		else answer = m;
		
		
		System.out.println(answer);
	}
}
