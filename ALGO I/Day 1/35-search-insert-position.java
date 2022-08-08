class Solution {
    static int searchInsert(int[] nums, int target) {
        
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] >= target)
                return i;
        }
        return n;
    }
    public static void main(String args[])
    {
        int nums[] = {1 , 3 , 5 , 7 , 9} , target = 8;
        System.out.println(searchInsert(nums,target));
    }
}
    
