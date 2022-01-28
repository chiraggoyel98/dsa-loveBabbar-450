/*
Problem Link: https://leetcode.com/problems/house-robber/

Solution: arr[i] represents the maximum amount of money you can rob up to and including house at ith index.
*/
//bottoms up approach
class Solution {
    public int rob(int[] nums) {
        int[] arr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
          //Base cases
            if(i==0) arr[i] = nums[i];
            else if(i==1) arr[i] = Math.max(nums[i-1],nums[i]);
            else {
              //recurrrence Relation
                arr[i] = Math.max(arr[i-1], arr[i-2]+nums[i]); 
            }
            
        }
        //for(int i:arr) System.out.print(i+" ");
        return arr[nums.length-1];
        
    }
}


//top down approach
class Solution {
    private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    private int[] nums;
    
    private int dp(int i) {
        // Base cases
        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);
        if (!memo.containsKey(i)) {
            memo.put(i, Math.max(dp(i - 1), dp(i - 2) + nums[i])); // Recurrence relation
        }
        return memo.get(i);
    }
    
    public int rob(int[] nums) {
        this.nums = nums;
        return dp(nums.length - 1);
    }
}
