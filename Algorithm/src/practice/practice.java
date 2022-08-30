package practice;

public class practice {
	
	 public static void main(String[] args) {
	        // 미션: atoi
	        // string으로 주어진 숫자를 integer로 변환한다
	        // 단, Casting(ParseInt 등..)은 사용할 수 없습니다
	        // 단, 단일 char의 ParseInt는 가능합니다

	        System.out.println(atoi("1234") == 1234);
	        System.out.println(atoi("1234504321") == 1234504321);
	        System.out.println(atoi("7896") == 7896);
	        System.out.println(atoi("13590837") == 13590837);
	        System.out.println(atoi("00000000000000") == 0);
	        System.out.println(atoi("00000001000000") == 1000000);
	    }
	    
	    public static int atoi(String input) {
	        // 여기에서 구현하세요
	        
	        char[] input_char = input.toCharArray();
	        int jarisu = input.length()-1;
	        
	        int a = 1;
	        int output = 0;
	        
	        for(int i = input.length()-1; i >= 0; i--){

	        		output = output + a * (input_char[i]-'0');
	        		a = a * 10;
	        }
	        
	        System.out.println(output);
	        return output;
	    }
	

}
