package practice;

public class practice {
	
	 public static void main(String[] args) {
	        // �̼�: atoi
	        // string���� �־��� ���ڸ� integer�� ��ȯ�Ѵ�
	        // ��, Casting(ParseInt ��..)�� ����� �� �����ϴ�
	        // ��, ���� char�� ParseInt�� �����մϴ�

	        System.out.println(atoi("1234") == 1234);
	        System.out.println(atoi("1234504321") == 1234504321);
	        System.out.println(atoi("7896") == 7896);
	        System.out.println(atoi("13590837") == 13590837);
	        System.out.println(atoi("00000000000000") == 0);
	        System.out.println(atoi("00000001000000") == 1000000);
	    }
	    
	    public static int atoi(String input) {
	        // ���⿡�� �����ϼ���
	        
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
