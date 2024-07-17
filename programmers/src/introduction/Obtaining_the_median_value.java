package introduction;

import java.util.Arrays;

//중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 
//예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 
//중앙값을 return 하도록 함수를 완성해보세요.
public class Obtaining_the_median_value {
	public static void main(String[] args) {
	int[] arr = {2, 1, 10, 7, 11};	
	Arrays.sort(arr);	
	int j = arr.length / 2;	
	System.out.println(arr[j]);
	}
}
