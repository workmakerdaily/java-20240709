package introduction;

import java.util.Arrays;

public class To_rotate_the_array {
//	정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
//	배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left"; 
		int[] answer = new int[numbers.length];
		if(direction.equals("left")) 
			for(int i = 0; i < numbers.length; i++) 
				if(i == numbers.length-1) answer[numbers.length-1] = numbers[0];
				 else answer[i] = numbers[i+1];
		else if(direction.equals("right")) 
			for(int i = 0; i < numbers.length; i++) 
				if(i == 0) answer[0] = numbers[numbers.length-1];
				 else answer[i] = numbers[i-1];
				
			System.out.println(Arrays.toString(answer));
		}
		
	}

