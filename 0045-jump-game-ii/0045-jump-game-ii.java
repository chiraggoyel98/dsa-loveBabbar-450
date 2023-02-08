class Solution {
    public int jump(int[] nums) {
        int max = 0;
        int jumps = 0;
        int curr = 0;

        if(nums.length<=1) return 0;

        for(int i=0; i<nums.length; i++) {
            //for curr jump find the max we can reach from i to curr level;
            //at index i u can reach max = i + nums[i] 
            max = Math.max(max, i+nums[i]);

            //if i reaches curr index update the prams;
            if(curr==i) {
                curr = max;
                jumps++;
            }

            if(curr>=nums.length-1) return jumps;
        }

        return jumps;
    }
}