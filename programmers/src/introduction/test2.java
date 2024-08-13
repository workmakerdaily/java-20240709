package introduction;

class Solution {
		public int solution(int[] numList) {
			int answer = -1;
			for(int i = 0; i < numList.length; i++) {
				if(numList[i] < 0 ) {
					answer = i;
					break;
				} else continue;
			}
	        return answer;
	    }
	}

