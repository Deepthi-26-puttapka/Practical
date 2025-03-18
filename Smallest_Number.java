package javaprograms.Arrays1;
import java.util.*;

//smallest number in array

class Smallest_Number {
	public static void main(String args[]) {
		/*
		int[] arr= {20,70,10,30,8};
		
		int N=arr.length;
		System.out.println("Size :"+N);
		Arrays.sort(arr);
		System.out.println("smallest elemenet:"+arr[0]);
		System.out.println("largest elemenet:"+arr[4]);*/
		
		int[] arr= {20,70,10,30,8};
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		
		System.out.println("smallest elemenet:"+small);
	}
    
}





