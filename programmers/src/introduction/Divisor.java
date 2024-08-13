package introduction;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Divisor {
//	정수 n이 매개변수로 주어질 때 
//	n의 약수를 오름차순으로 담은 배열을 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		int n = 24;
		List<Integer> answer = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer.add(i); 
			}
			
		}
		System.out.println(answer);
	}
}
