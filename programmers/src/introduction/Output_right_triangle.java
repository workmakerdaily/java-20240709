package introduction;

import java.util.Scanner;

public class Output_right_triangle {
//	"*"의 높이와 너비를 1이라고 했을 때, 
//	"*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 
//	정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("*".repeat(i));
		}
		sc.close();
		
	
	}
}
