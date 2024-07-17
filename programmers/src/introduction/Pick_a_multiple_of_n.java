package introduction;

import java.util.Arrays;

public class Pick_a_multiple_of_n {
	// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, 
	// numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		int n = 12;
		int[] numlist = {2, 100, 120, 600, 12, 12};
		
		 int a = 0;
	        for(int i = 0; i < numlist.length; i++){
	            if(numlist[i] % n == 0){
	                a++;
	            }
	        }
	    int[] answer = new int[a];
	    int b = 0;
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i] % n == 0) {
			 answer[b] = numlist[i];
			 b++;
			}
			
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
