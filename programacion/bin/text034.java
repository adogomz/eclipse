import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class text034 {

	public static void main(String[] args) throws FileNotFoundException {
		int[] nums = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95};
        
		for (int i = 1; i < 10; i++) {
		    nums[i] = nums[i - 1];
		}

		System.out.println(Arrays.toString(nums));
    }
}