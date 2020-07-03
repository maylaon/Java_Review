package selfcheck;

public class RepititiveReivew {

	public static void main(String[] args) {
		// 0629 java review
		// p.55
		// #2-19 1)
		/*for(int i = 0; i <= 5; i++){
			System.out.print(i+" ");
		}
		
		// 2)
		System.out.println();
		for(int i = 5; i >= 0; i--){
			System.out.print(i+" ");
		}
		
		//3)
		int sum = 0;
		for(int i = 2; i <= 10; i++){
			sum += i;
		}
		System.out.println(sum);
	
		//4)
		double mul = 1.0;
		for(int i = 5; i < 15; i++){
			mul *= i;
		}
		System.out.println(mul);
	
		//5)
		sum = 0;
		for(int i = 4; i <=4462; i+=2){
			sum += i;
		}
		System.out.println(sum);
	
		//6)
		sum = 0;
		for(int i = 8; i < 57; i+=2){
			sum += i;			
		}
		System.out.println(sum);
		
		
		//
		 
		  * 	"    *"
		 		"___**"
		 		"__***"
		 		"_****"
		 		"*****"
		를 만들고 싶을 때
		
		for(int i = 1; i<=5; i++){
			for(int j = 5; j > i; j--){
			System.out.print(" ");	
			}for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		  * 	"*____"
		 		"**___"
		 		"***__"
		 		"****_"
		 		"*****"
		를 만들고 싶을 때
		
			for(int i = 1; i <= 5; i++){
				for(int j = 1; j <= i; j++){
					System.out.print("*");
				}for(int j = 5; j > i; j--){
					System.out.print(" ");
				}
				System.out.println();
			}
		
			 "*****"
			 * "*****"
			 * "*****"
		만들기
		
		for(int i =1; i <=3; i++){
			for(int j =1; j <= 5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		 "*****"
		 * "*****"
		 * "*****"
		 * "*****"
	만들기
		
		for(int i = 1; i <=4; i++){
			for(int j =1; j <=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		 "___**"
		 * "__***"
		 * "-****"
		 * "*****"
	만들기
		
		for(int i =1; i <= 4; i++){
			for(int j = 3; j >= i; j--){
				System.out.print(" ");
			}for(int j = 1; j <= i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2-21(p.58)
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
				}for(int j = 4; j > i; j--){
					System.out.print(" ");
				}
				System.out.println();		
		}*/
		
		//2-14
		
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		
		
		//연습문제 (p.64)
		//4-2 : 1부터 20까지의 정수중에서 2또는 3의 배수가 아닌 수의 총합을 구하세용
		int sum = 0;
		for(int i = 1; i <= 20; i++){
			if(i % 2 != 0 && i % 3 != 0){
				sum += i;
			}
			
		}
		System.out.println(sum);
		
		//4-3 for문을 while 문으로
		for(int dan = 2; dan < 10; dan++){
			for(int gob = 1; gob < 10; gob++){
				System.out.println(dan + "*" + gob + "=" + dan * gob);
			}
		}
		
		int dan1 =2;
		int gob1 = 1;
		while(dan1 < 10){
			gob1 = 1;
			while(gob1 <10){
				System.out.print(dan1 + "*" + gob1 + "=" + dan1 * gob1 + "\t");
				gob1++;
			}
			System.out.println();
			dan1++; 
		}
		
		//4-4
		int random1 = 0;
		int random2 = 0;
		
		for(int i = 1; i <= 6; i++){
		while(random1 + random2 != 6){
			random1 = (int) (Math.random() * 6) + 1;
			random2 = (int) (Math.random() * 6) + 1;			
		}
		System.out.println(random1 + "," + random2);
		random1 = 0;
		random2 = 0;
		}
		
		//4-5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	}

