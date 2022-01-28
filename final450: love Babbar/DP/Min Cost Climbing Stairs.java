/* problem Link: https://leetcode.com/problems/min-cost-climbing-stairs/
solution:
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prevPrev=0;
        int prev=0;
     
        for(int i=2;i<=cost.length;i++){
            int curr=Math.min(prev+cost[i-1],cost[i-2]+prevPrev);
            prevPrev=prev;
            prev=curr;
        }
        return prev;
    }
}

//using dp top down 
class Solution {
    private HashMap<Integer,Integer> map = new HashMap<>();
    private int[] nums;
    
    private int dp(int i) {
        if(i<=1) return 0;
        
        if(!map.containsKey(i)) {
            map.put(i, Math.min(dp(i-1)+nums[i-1],dp(i-2)+nums[i-2]));
            
        }
        return map.get(i);
    }
    
    public int minCostClimbingStairs(int[] cost) {
        nums=cost;
        return dp(nums.length);
    }
}
