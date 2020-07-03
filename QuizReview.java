package selfcheck;

import java.util.Arrays;

public class QuizReview {

	public static void main(String[] args) {
		quiz4();

	}

	private static void quiz4() {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
				
	}
		
		System.out.println(Arrays.toString(arr));
		int random = (int) (Math.random() * 4) + 2;
		int[] temp = new int[100];
		int count = 0;
		System.out.println(random);


		for(int i = 0; i <arr.length; i++){
			boolean check = false;
			if(arr[i] % random == 0){
				check = true;
				temp[count++] = arr[i];
			}
			
		}
		System.out.println(Arrays.toString(temp));

		int[] result = new int[count];
		for(int i=0; i<result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
		
		//result 정렬하기(자리바꾸기..ㅠ 선택/버블/삽입정렬로 해보기)
		int tem = 0;
		for(int i = 0; i<result.length; i++){
			for(int j = 1; j < result.length; j++){
				if(result[j-1] > result[j]){
					tem = result[j];
					result[j] = result[j-1];
					result[j-1] = tem;
					
				}
				
				
				
			}
		}
		
		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
