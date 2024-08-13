package introduction;

public class test1 {
	public static void main(String[] args) {
		int[] numList = {12, 4, 15, 46, 38, -2, 15};
		int answer = -1;
		for(int i = 0; i < numList.length; i++) {
			if(numList[i] < 0 ) {
				answer = i;
				break;
			} else continue;
		}
		System.out.println(answer);
	}
}
