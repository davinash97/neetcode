package solutions;

import java.util.*;

class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for(int num: nums) {
			if(!set.add(num))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4};
		ContainsDuplicate sol = new ContainsDuplicate();
		String result = sol.containsDuplicate(arr) ? "duplicates found" : "No duplicates found";
		System.out.println(result);
	}
}