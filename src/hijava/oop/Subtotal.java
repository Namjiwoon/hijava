package hijava.oop;

public class Subtotal {
	public int sum(int[] nums) {
		int result = 0;
		for(int i : nums)
			result += i;
		
		return result;
	}
	
	public int avg(int[] nums) {
		int total = sum(nums);
		return total / nums.length;
	}
}
