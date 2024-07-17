package introduction;


public class Remove_specific_characters {
//	문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
//	my_string에서 letter를 제거한 문자열을 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		String answer = "";
		String my_string = "BCBdbe";
		String letter = "B";
		
		answer = my_string.replace(letter, "");
		
		System.out.println(answer);
	}
}
