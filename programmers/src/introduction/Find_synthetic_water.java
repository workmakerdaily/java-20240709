package introduction;

public class Find_synthetic_water {
//	약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
//	자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		
		for(int i = 1; i <= n; i++) {
			int count = 0;
			for(int j = 1; j <= n; j++) {
				if(i % j == 0) count++;
			}
			if(count >= 3) answer++;
		}
			
		System.out.println(answer);
	}
}
