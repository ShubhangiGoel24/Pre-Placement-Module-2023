class Solution {
    public int singleNumber(int[] nums) {
	int x = 0;
	for (int a : nums) {
		x = x ^ a;
	}
	return x;
}
}
