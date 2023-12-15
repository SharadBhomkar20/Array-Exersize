package com.prowing.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	
	private static Scanner scan;

	public ArrayReverse() {}

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = scan.nextInt();
		int[] nums = new int[size];

		System.out.println("Enter numbers in array :");
		for (int i = 0; i < size; i++)
			nums[i] = scan.nextInt();
		System.out.println("Reversed Array : " +Arrays.toString(reverseArray(nums)));
	}

	public static int[] reverseArray(int[] nums) {
		
		int[] reversedArray = new int[nums.length];
		int count=0;
		for(int i=nums.length-1; i>=0; i--) {
			reversedArray[count++] = nums[i];
		}
		return reversedArray;
	}

}
