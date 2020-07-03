package selfcheck;

public class OperatorReview {

	public static void main(String[] args) {
		// 0625 Review p.45-47
		/*int number = 4;
		System.out.println(number++);
		System.out.println(number);
		System.out.println(++number);
		
		number += 4;
		System.out.println(number);
		
		char ch = 'A';
		short s = (short)ch;
		int in = 100;
		byte b = 10;
		long lo = 100L;
		float f = lo;
		
		char c = 'A';
		char z = 'Z';
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C');
		System.out.println('C'-c);
		System.out.println(c++);
		System.out.println(c);*/
		
		
		//3-3
		/*int num = 10;
		String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		System.out.println(result);
		*/
		 
		//3-4
		/*int apples = 130;
		int bucket = 10;
		int numOfBucket = apples % bucket != 0 ? apples / bucket + 1 : apples / bucket;
		System.out.println(numOfBucket);
			
		//3-5
		int num = 357;
		int result = Math.round(num / 100) * 100;
		System.out.println(result);
		*/
		//3-6
		/*byte a = 10;
		byte b = 20;
		int c = a + b;
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2.0f;
		long l = 3000L * 3000L *3000L;
		float f2 =0.1f;
		double d = 0.1;
		boolean result = d!=f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);*/
		
		/*//3-7
		int num = 24;
		System.out.println((Math.round(num/10)*10 + 10)-num);
		*/
		
		//3-8
		int fahrenheit = 100;
		float formula  = 5 / 9.0f * (fahrenheit - 32);
		float celcius = (float)(Math.round(formula * 1000.0f) / 1000f);
		System.out.println("Formula :" + formula);
		System.out.println("Fahrenheit :" + fahrenheit);
		System.out.println("Celcius :" + celcius);
		
		
		
		
		
		
	}

}
