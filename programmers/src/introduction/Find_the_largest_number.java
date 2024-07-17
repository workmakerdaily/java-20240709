package introduction;

import java.util.Arrays;

public class Find_the_largest_number {
//	정수 배열 array가 매개변수로 주어질 때, 
//	가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 함수를 완성해보세요.
	public static void main(String[] args) {
		int[] array = {9, 10, 11, 8};
		
		int max = 0;
		int num = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				num = i ;
			}
			}
		int[] answer = {max, num};
		System.out.println(Arrays.toString(answer));
		}
	}

