package com.vidvaan.array;


public class MinArray {
	public void min(int arr[]) {
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) 
			if(min>arr[i]) 
				min=arr[i];
				System.out.println(min);
		//return min;
			
			
		
		
	}
	public static void main(String[] args) {
		MinArray array= new MinArray();
		int arr[]= {37,46,84,74,46,6};
		array.min(arr);
		//System.out.println(array.min(arr));
		
		
	}

}
