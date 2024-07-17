package introduction;

import java.util.Arrays;

public class Addition_of_fractions {
//	첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
//	두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
//	두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 함수를 완성해보세요.
	public static void main(String[] args) {
		int numer1 = 9;
		int denom1 = 2;
		int numer2 = 1;
		int denom2 = 3;
		int[] answer = {(numer1*denom2) + (numer2*denom1),denom1*denom2};	
		// numer1/denom1 + numer2/denom2
//		{(numer1*denom2) + (numer2*denom1),denom1*denom2};
//		if((numer1*denom2) + (numer2*denom1) % denom1*denom2 == 0) 
		
		System.out.println(Arrays.toString(answer));
		
	}
}
