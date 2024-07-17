package introduction;



public class Remove_vowels {
	
//	영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
//	문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 함수를 완성해주세요.
	
	public static void main(String[] args) {
		String my_string = "nice to meet you";		
	
		System.out.println(my_string.replaceAll("[aeiou]",""));
	}
}
