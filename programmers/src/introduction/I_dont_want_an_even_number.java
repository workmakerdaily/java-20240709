package introduction;

import java.util.Arrays;

//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로
//담긴 배열을 return하도록 함수를 완성해주세요.
//결과 : [1, 3, 5, 7, 9]
public class I_dont_want_an_even_number {
	public static void main(String[] args) {
		int n = 10;
		int m = 0;
		int c = 0;
		  if(n % 2 == 0) c = n / 2;
		  else c = n / 2 + 1;
		int[] arr = new int[c]; 
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 1) {
				arr[m++]= i;		
			}
		}
	System.out.println(Arrays.toString(arr));
		}
		
	}




