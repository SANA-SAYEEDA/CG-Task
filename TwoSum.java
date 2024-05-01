import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println("Enter the total numbers in the array:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the array numbers: ");
		for (int i = 0; i < n; i++)
			nums[i] = scan.nextInt();
		System.out.println("Enter the target number: ");
		int target = scan.nextInt();
		int[] res = new int[2];
		res = twoSum(nums, target);
		System.out.println(res[0]+" "+res[1]);
		scan.close();
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] index = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					index[0] = i;
					index[1] = j;
				}
			}

		}
		return index;
	}
}
