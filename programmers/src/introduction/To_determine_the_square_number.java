package introduction;

public class To_determine_the_square_number {
//	어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 
//	정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		int n = 144;
		int answer = 0;
		double a = Math.sqrt(n);
		if(a % 1 == 0) answer = 1;
		else answer = 2;
		
		
		System.out.println(answer);	
	}
}
