package introduction;

import java.awt.datatransfer.StringSelection;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Length_of_array_element {
//	문자열 배열 strlist가 매개변수로 주어집니다. 
//	strlist 각 원소의 길이를 담은 배열을 retrun하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		int[] answer = new int [strlist.length];
		for(int i = 0; i < strlist.length; i++) {
			String a = strlist[i];
			answer[i] = a.length();
			

			}

		
		System.out.println(Arrays.toString(answer));

		}
		
		
	}

