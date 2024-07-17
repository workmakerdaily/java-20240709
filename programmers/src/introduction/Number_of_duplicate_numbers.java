package introduction;

public class Number_of_duplicate_numbers {
	
	//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
	//array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
	// array_len은 배열 array의 길이입니다.

	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5};
		int n = 1;
		int a = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == n) a++;
		}
		System.out.println(a);

	}
}
