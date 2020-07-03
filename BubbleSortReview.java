package selfcheck;

import java.util.Arrays;

public class BubbleSortReview {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i =0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(arr));
			
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr) {
		// 버블정렬
		// 큰 수를 뒤로 보내는 것 1) 인덱스0,1 비교 => 큰 수를 1에, 작은수를 0에. 이런 식으로 자리 바꾸면서 비교
		
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length-i-1; j++){ //for구문을 한번씩 돌때마다 뒤에서부터 큰 수가 쌓이게 되므로, arr.length-i-1까지만 비교하면 되므로.
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//한번 반복해서 자리를 바꾼다고 해서 정렬이 완성 되는 것이 아니므로, 반복을 arr.length-1 만큼 해 주어야 한다.
		// j와 j+1 비교하는 것: j loop, 비교 몇번 반복 할 건지 : i loop (arr.length-1)
		
		
				
		
		
	}

}
