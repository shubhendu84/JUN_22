package com.kk.beans;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DummyArrays {

	public static void main(String[] args) {

		int[] arr = { 75, 24, 56, 96, 14, 12, 80, 42 };

		System.out.println("Before array sort... ");
		for (int no : arr) {
			System.out.print(" "+no);
		}
		Arrays.sort(arr);
		
		// Collections.sort(null);
		System.out.println("\nAfter array sort... ");
		for(int no1 : arr) {
			System.out.print(" "+no1);
		}
		
		
	}

}
