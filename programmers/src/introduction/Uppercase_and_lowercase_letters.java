package introduction;

public class Uppercase_and_lowercase_letters {
//	문자열 my_string이 매개변수로 주어질 때, 
//	대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		String my_string = "abCdEfghIJ";
		 String answer = "";
		
			 for(char a : my_string.toCharArray()) {
				 if(a >= 65 && a <= 90) {
					 answer += String.valueOf(a).toLowerCase();
				 } else {
					 answer += String.valueOf(a).toUpperCase();
				 }
			 }
		 		
		 System.out.println(answer);
	}
}
