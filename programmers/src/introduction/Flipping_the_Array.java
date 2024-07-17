package introduction;

import java.util.Arrays;

public class Flipping_the_Array {
//	정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
//	num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		int[] num_list = {1, 0, 1, 1, 1, 3, 5};
		int[] answer = new int[num_list.length];
		for(int i = 0; i < num_list.length; i++) {
			answer[i] += num_list[num_list.length-1-i];
		}
		System.out.println(Arrays.toString(answer));
	}
}
