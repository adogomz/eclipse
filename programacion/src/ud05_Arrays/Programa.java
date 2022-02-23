package ud05_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		
		int[] nums = {5, 1, 3, 2, 0, 5};	
		for (int i = 0; i < nums.length - 1; i++) {
			   if (nums[i] > nums[i + 1]) {
			      nums[i + 1]++;
			   }
			}
		System.out.println(Arrays.toString(nums));
		
    }
}
