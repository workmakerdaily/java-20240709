package introduction;

public class Repeated_text_output {
//	문자열 my_string과 정수 n이 매개변수로 주어질 때, 
//	my_string에 들어있는 각 문자를 n만큼 반복한 문자열을
//	return 하도록 함수를 완성해보세요.
	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		String answer = "";
		for(int i = 0; i < my_string.length(); i++) {
			for(int j = 0; j < n; j++) {
				answer += my_string.charAt(i);
			}
		}
	System.out.println(answer);
	}
}
