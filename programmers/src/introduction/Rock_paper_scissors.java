package introduction;

import java.util.Arrays;

public class Rock_paper_scissors {
//	가위는 2 바위는 0 보는 5로 표현합니다. 
//	가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, 
//	rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 함수를 완성해보세요.
	public static void main(String[] args) {
		String rsp = "205";
		String answer = "";
		String[] rsp1 = rsp.split("");
		for(int i = 0; i < rsp1.length; i++) {
			if(rsp1[i].equals("2")) answer += "0";
			else if(rsp1[i].equals("0")) answer += "5";
			else if(rsp1[i].equals("5")) answer += "2";
		}
		
		System.out.println(answer);
//		System.out.println(Arrays.toString(rsp1));
	}
}
