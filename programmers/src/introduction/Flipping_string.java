package introduction;

public class Flipping_string {
//	문자열 my_string이 매개변수로 주어집니다. 
//	my_string을 거꾸로 뒤집은 문자열을 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";
		answer = new StringBuffer(my_string).reverse().toString();
		System.out.println(answer);
	}
}
