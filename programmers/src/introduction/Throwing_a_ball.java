package introduction;

public class Throwing_a_ball {
//	머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 
//	공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다. 
//	친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, 
//	k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 함수를 완성해보세요.
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int k = 5;
		int answer = 0;
		int a = 0;
		for(int i = 0; i < k-1; i++) {
			a+= 2;
			if(a == numbers.length) a = 0;
			else if(a == numbers.length+1) a = 1;
			
			System.out.println(a);
			answer = numbers[a];
		}
	
		System.out.println(answer);
	}
}
