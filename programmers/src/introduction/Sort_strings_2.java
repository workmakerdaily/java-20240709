package introduction;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_strings_2 {
//	영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, 
//	my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록  함수를 완성해보세요.
	public static void main(String[] args) {
		String my_string = "Python";
		 String answer = "";
		 char[] a = new char[my_string.length()];
		 for(int i = 0; i <my_string.length(); i++) {
			 a[i]=String.valueOf(my_string).toLowerCase().charAt(i);
		 }
		Arrays.sort(a);
		for(int i = 0; i <my_string.length(); i++) {
			answer += a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(answer);
	}
}
