package selfcheck;

import java.util.Arrays;

public class SortReiview {

	public static void main(String[] args) {
		// 삽입정렬
		// 1) array[1]값부터 임시 공간(temp라 가정)에 둔다. 2) 전에 값들(i-1)과 다 비교. temp < (i-1) 일경우 temp 값을 (i-1)값에 둔다
		// 3) i-1 에 있던 값은 i로 자리를 한칸 뒤로 미룬다. 
		// 결과는 오름차순 정렬처럼 나타난다.
		
		int[] arr = new int[10];
		for(int i =0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		
		insertSort(arr); //삽입정렬
		System.out.println(Arrays.toString(arr));
		
	}

	private static void insertSort(int[] arr) {
		
		
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = 0;
			for(j = i-1; j >= 0; j--){
				if(temp < arr[j]){
					arr[j+1] = arr[j];
					arr[j] = temp;
					}else{
						break;
					}
				
				
			}	temp = arr[j+1];
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
