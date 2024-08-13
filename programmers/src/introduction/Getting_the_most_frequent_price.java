package introduction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Getting_the_most_frequent_price {
//	최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
//	정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 함수를 완성해보세요. 
//	최빈값이 여러 개면 -1을 return 합니다.
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 3, 4};
		int answer = 0;
		int max = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < array.length; i++) {
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
			if(map.get(array[i]) > max) {
				max = map.get(array[i]);
				answer = array[i];
			} else if(map.get(array[i]) == max) {
				answer = -1;
			}
			
		}
		System.out.println(answer);
	}
}
