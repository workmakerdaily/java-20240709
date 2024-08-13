package introduction;

import java.util.Arrays;

public class Games_369 {
//	머쓱이는 친구들과 369게임을 하고 있습니다. 
//	369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
//	머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 함수를 완성해보세요.
	public static void main(String[] args) {
		int order = 29423;
		int answer = 0;
		String[] order1 = String.valueOf(order).split("");
		String[] clap = {"3","6","9"};
		for(int i = 0; i < order1.length; i++) {
			if(order1[i].equals(clap[0])) answer += 1;
			else if(order1[i].equals(clap[1])) answer += 1;
			else if(order1[i].equals(clap[2])) answer += 1;
		}
		
		System.out.println(answer);
	}
}
