package introduction;

public class Addition_of_hidden_numbers_1 {
//	문자열 my_string이 매개변수로 주어집니다. 
//	my_string안의 모든 자연수들의 합을 return하도록 함수를 완성해주세요.
	public static void main(String[] args) {
		String my_string = "1a2b3c4d123";
		   int answer = 0;
	        for(char i : my_string.toCharArray()) {
				if(i >= 48 && i <= 57){
	               answer += Integer.parseInt(String.valueOf(i)); 
	            }
	        }
		System.out.println(answer);
	
		

	

	}
	
}

