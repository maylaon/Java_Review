package selfcheck;

import java.util.Arrays;

public class SellectSortReview {

	public static void main(String[] args) {
			
		int[] arr = new int[10];
		for(int i =0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
			
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectSort(int[] arr) {
		// 선택정렬
		// 최소값을 찾아서 한번에 자리를 바꾼다.
	
		
		/*for(int i=0; i<arr.length; i++){
			int min = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
				}
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;			
		}	
		*/
	
		for(int i=0; i < arr.length-1; i++){
			int j = 0;
			int min = i;
			for(j = i+1; j < arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				
		}
	
	
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
