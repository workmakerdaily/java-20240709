package introduction;

import java.util.Arrays;

public class Create_Maximum_1 {
//	정수 배열 numbers가 매개변수로 주어집니다. 
//	numbers의 원소 중 두 개를 곱해 만들 수 있는 
//	최댓값을 return하도록  함수를 완성해주세요.
	public static void main(String[] args) {
		int[] numbers = {0, 31, 24, 10, 1, 9};
		int answer = 0;
		Arrays.sort(numbers);
		answer = numbers[numbers.length-1] * numbers[numbers.length-2];
		System.out.println(answer);
		}
	}

