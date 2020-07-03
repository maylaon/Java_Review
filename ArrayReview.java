package selfcheck;

import java.util.Arrays;


public class ArrayReview {

	public static void main(String[] args) {
		// p.72 #2-26
		/*int[] score = new int[7];
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			int random = (int)(Math.random()*100);
			score[i] = random;
			sum += random;
		}
		double avg = sum / (double)score.length;
		System.out.println(sum);
		System.out.println(Math.round(avg*100)/100.0);
		 
		int min = score[0];
		int max = score[0];
		
		for(int i = 0; i < score.length; i++){
			if(score[i] < min){
				min = score[i];
			}else if(max < score[i]){
				max = score[i];
			}
		}
		System.out.println(max);
		
		//p.74
		String[] names = {"김씨", "이씨", "박씨", "한씨"};
		String temp = names[1];
		names[1] = names[2];
		names[2] = temp;
		System.out.println("변경후: " + Arrays.toString(names));
		
	
		//수업시간 REVIEW
		//문제..1 : 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세용
		
		int[] array = new int[10];
		 sum = 0;
	
		//문제1-2: 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		//문제 1-3: 배열의 저장된 모든 값을 합계와 평균을 구해주세요.
		
		for(int i=0; i < array.length; i++){
			int random	= (int)(Math.random()*100)+1;
			array[i] = random;
			sum += random;
			
		}
		avg = sum / (double)array.length;
		System.out.println(Arrays.toString(array));
		System.out.println(sum);
		System.out.println(avg);
				
		
		//문제1-4: 배열에 저장된 값들 중 최소값과 최대값을 출력해 주세요.
		min = array[0];
		max = array[0];
		for(int i=0; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}else if(max < array[i]){
				max = array[i];
			}
		}
		System.out.println("min: " + min + " max : " + max);*/
		
		//문제 2-1. 1-10 까지를 담는 배열 작성
		int[] ten = new int[10];
		for(int j=0; j<ten.length; j++){
			ten[j] = j + 1;	
			System.out.print(ten[j]);
		}
		
		// 배열 순서를 바꾸세요(셔플)
		int tempo = 0;
		int rand = 0;
		for(int i = 0; i < 10; i++){
			rand = (int)(Math.random()*ten.length);
			tempo = ten[0];
			ten[0]= ten[rand];
			ten[rand] = tempo;
		}
		System.out.println(Arrays.toString(ten));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
